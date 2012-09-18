package com.curt.parts;

import java.util.ArrayList;

import android.widget.RelativeLayout;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Part {
	
	public static class DataWrapper {
		public ArrayList<Part> fromJson(String json){
			Gson gson = new Gson();
			JsonParser parser = new JsonParser();
			JsonArray array = parser.parse(json).getAsJsonArray();
			
			ArrayList<Part> parts = new ArrayList<Part>();
			for(JsonElement obj : array){
				Part part = gson.fromJson(obj, Part.class);
				parts.add(part);
			}
			return parts;
		}
		
	}
	

	public ArrayList<PartAttribute> attributes = new ArrayList<PartAttribute>();
	public ArrayList<PartAttribute> vehicleattributes = new ArrayList<PartAttribute>();
    public ArrayList<PartAttribute> pricing = new ArrayList<PartAttribute>();
    public ArrayList<PartReview> reviews = new ArrayList<PartReview>();
    public ArrayList<PartImage> images = new ArrayList<PartImage>();
    public ArrayList<PartVideo> videos = new ArrayList<PartVideo>();
    public int partID = 0;
    public int custPartID = 0;
    public int status = 0;
    public String dateModified = "";
    public String dateAdded = "";
    public String shortDesc = "";
    public String oldPartNumber = "";
    public String listPrice = "";
    public String pClass = "";
    public int relatedCount = 0;
    public int installTime = 0;
    public double averageReview = 0;
    public String drilling = "";
    public String exposed = "";
    public int vehicleID = 0;
    public int priceCode = 0;
    
    public RelativeLayout resultDisplay = null;
	
}
