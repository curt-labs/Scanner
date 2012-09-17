package com.curt.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

	
	public static String convertStreamToString(InputStream stream){
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		StringBuilder sb = new StringBuilder();
		
		String line = null;
		try{
			while((line = reader.readLine()) != null){
				sb.append(line + "\n");
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				stream.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
}
