package com.curt.vehicle;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.curt.utils.Utils;
import com.google.gson.Gson;

public class VinDecoder {

	private final String api_key = "8aee0620-412e-47fc-900a-947820ea1c1d";
	private String vin = "";
	
	/**
	 * @param vin
	 */
	public VinDecoder(String vin) {
		super();
		this.setVin(vin);
	}
	
	public VinDecoder(){
		super();
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	
	public Vehicle Decode() throws Exception{
		Vehicle v = new Vehicle();
		
		//TODO Hit CURT API to get the details
		String url = "http://api.curtmfg.com/v3/vin/decode/" + this.getVin() +
				"?key=" + this.api_key;
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Content-Type", "application/json");
		try{
			
			HttpResponse resp = client.execute(httpGet);
			HttpEntity entity = resp.getEntity();
			
			if(entity != null){
				InputStream stream = entity.getContent();
				String respString = Utils.convertStreamToString(stream);
				VinDecoder.DataWrapper wrap = new VinDecoder.DataWrapper();
				DecodedVin decoded = wrap.fromJson(respString);
				
				String status = decoded.getStatus().toUpperCase();
				if(status == "PARAMERR" || status == "VINERR" || status == "SECERR" || status == "CHECKERR"){
					throw new Exception("Failed to process VIN");
				}else if(status == "NOTFOUND"){
					throw new Exception("We couldn't decode that VIN");
				}else{ // Success
					DecodedVin.Vehicle dv = decoded.getVehicle();
					v.setYear(Double.parseDouble(dv.getYear()));
					v.setMake(dv.getMake());
					v.setModel(dv.getModel());
					v.setStyle(dv.getTrim());
				}
			}
		}catch(ClientProtocolException e){
			e.printStackTrace();
			throw new Exception("Failed to process VIN");
		}catch(IOException e){
			e.printStackTrace();
			throw new Exception("Failed to process VIN");
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Failed to process VIN");
		}
		
		return v;
	}
	
	public static class DataWrapper {
		public DecodedVin fromJson(String json){
			Gson gson = new Gson();
			DecodeHandler handler = new DecodeHandler();
			DecodedVin decoded = new DecodedVin();
			
			handler = gson.fromJson(json, DecodeHandler.class);
			decoded = handler.decode;
			
			return decoded;
		}
		
	}
	
	
}
