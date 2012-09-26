package com.curt.vehicle;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.curt.parts.Part;
import com.curt.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

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
	
	
	public Vehicle Decode(){
		Vehicle v = new Vehicle();
		
		//TODO Hit CURT API to get the details
		String url = "https://api.curtmfg.com/v3/vin/decode/" + this.getVin() +
				"?key=" + this.api_key;
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		try{
			HttpResponse resp = client.execute(httpGet);
			HttpEntity entity = resp.getEntity();
			
			if(entity != null){
				InputStream stream = entity.getContent();
				String respString = Utils.convertStreamToString(stream);
				
				VinDecoder.DataWrapper wrap = new VinDecoder.DataWrapper();
				DecodedVin decoded = wrap.fromJson(respString);
				//if(decoded.getStatus())
			}
		}catch(ClientProtocolException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return v;
	}
	
	public static class DataWrapper {
		public DecodedVin fromJson(String json){
			Gson gson = new Gson();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(json).getAsJsonArray();
			
			DecodedVin decoded = new DecodedVin();
			decoded = gson.fromJson(json, DecodedVin.class);

			return decoded;
		}
		
	}
	
}
