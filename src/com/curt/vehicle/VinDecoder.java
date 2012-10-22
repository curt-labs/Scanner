package com.curt.vehicle;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

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
	
	
	public DecodeResponse Decode() throws Exception{
		
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
				DecodeResponse decoded = wrap.fromJson(respString);
				
				if(decoded.Error != null && decoded.Error.length() > 0){
					throw new Exception("Failed to process VIN:" + decoded.Vin);
				}
				return decoded;
				
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
		
		return new DecodeResponse();
	}
	
	public String Encode(DecodeResponse resp) throws Exception{
		try{
			VinDecoder.DataWrapper wrap = new VinDecoder.DataWrapper();
			return wrap.toJson(resp);
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("Failed to encode Part array");
		}
	}
	
	public static class DataWrapper {
		public DecodeResponse fromJson(String json){
			Gson gson = new Gson();
			
			return gson.fromJson(json, DecodeResponse.class);
		}
		
		public String toJson(DecodeResponse resp){
			Gson gson = new Gson();
			return gson.toJson(resp);
		}
	}
}
