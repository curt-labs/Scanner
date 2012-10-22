package com.curt.vehicle;

import java.util.ArrayList;
import java.util.Map;

import android.util.Log;

import com.curt.parts.Part;

public class DecodeResponse{
	
	private final String ACES_YEAR_ID = "ACES_YEAR_ID";
	private final String MAK_NM = "MAK_NM";
	private final String MDL_DESC = "MDL_DESC";
	private final String TRIM_DESC = "TRIM_DESC";
	
	public String Vin = "";
	public String CorrectedVin = "";
	public int ReturnCode = 0;
	public ArrayList<PolkField> Fields = new ArrayList<PolkField>();
	public String Error = "";
	public ArrayList<Part> Parts = new ArrayList<Part>();
	public ArrayList<VehicleConfigOption> ConfigOptions = new ArrayList<VehicleConfigOption>();
	
	public String GetYear(){
		for(int i = 0; i < this.Fields.size(); i++){
			PolkField field = this.Fields.get(i);
			if(field.Name.equals(ACES_YEAR_ID)){
				return field.Value;
			}
		}
		return "";
	}
	
	public String GetMake(){
		for(int i = 0; i < this.Fields.size(); i++){
			PolkField field = this.Fields.get(i);
			if(field.Name.equals(MAK_NM)){
				return field.Value;
			}
		}
		return "";
	}
	
	public String GetModel(){
		for(int i = 0; i < this.Fields.size(); i++){
			PolkField field = this.Fields.get(i);
			if(field.Name.equals(MDL_DESC)){
				return field.Value;
			}
		}
		return "";
	}
	
	public String GetTrim(){
		for(int i = 0; i < this.Fields.size(); i++){
			PolkField field = this.Fields.get(i);
			if(field.Name.equals(TRIM_DESC)){
				return field.Value;
			}
		}
		return "";
	}
	
	
	
	public class VehicleConfigOption{
		public String Type = "";
		public ArrayList<String> Options = null;
	}
	
	public class PolkField{
		public String Name = "";
		public String Value = "";
	}
	
}
