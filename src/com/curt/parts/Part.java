package com.curt.parts;

import java.util.ArrayList;
import java.util.Iterator;

import com.curt.category.Category;
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
	

	public ArrayList<PartAttribute> Attributes = new ArrayList<PartAttribute>();
	public ArrayList<PartAttribute> VehicleAttributes = new ArrayList<PartAttribute>();
	public ArrayList<PartAttribute> Content = new ArrayList<PartAttribute>();
    public ArrayList<PartPrice> Pricing = new ArrayList<PartPrice>();
    public ArrayList<PartReview> Reviews = new ArrayList<PartReview>();
    public ArrayList<PartImage> Images = new ArrayList<PartImage>();
    public ArrayList<PartVideo> Videos = new ArrayList<PartVideo>();
    public ArrayList<Category> Categories = new ArrayList<Category>();
    public ArrayList<Package> Packages = new ArrayList<Package>();
    public int PartId = 0;
    public int CustPartId = 0;
    public int Status = 0;
    public String DateModified = "";
    public String DateAdded = "";
    public String ShortDesc = "";
    public String PartClass = "";
    public int RelatedCount = 0;
    public int InstallTime = 0;
    public double AverageReview = 0;
    public String Drilling = "";
    public String Exposed = "";
    public int VehicleId = 0;
    public int PriceCode = 0;
    
	public String GenerateVideoUrl() {
		
		Iterator<PartVideo> vidIter = this.Videos.iterator();
		while(vidIter.hasNext()){
			PartVideo vid = vidIter.next();
			if(vid.IsPrimary){
				return vid.YouTubeVideoId;
			}
		}
		vidIter = this.Videos.iterator();
		while(vidIter.hasNext()){
			PartVideo vid = vidIter.next();
			return vid.YouTubeVideoId;
		}
		
		return null;
	}
	
}
