package com.curt.vehicle;

import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;
import android.widget.Toast;

import com.curt.parts.Part;
import com.curt.parts.PartAttribute;
import com.curt.utils.Utils;

public class Vehicle {
	public int vehicleID = 0;
    public int yearID = 0;
    public int makeID = 0;
    public int modelID = 0;
    public int styleID = 0;
    public int aaiaID = 0;
    public double year = 0;
    public String make = "";
    public String model = "";
    public String style = "";
    public int installTime = 0;
    public String drilling = "";
    public String exposed = "";
    /**
	 * @return the vehicleID
	 */
	public int getVehicleID() {
		return vehicleID;
	}
	/**
	 * @param vehicleID the vehicleID to set
	 */
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	/**
	 * @return the yearID
	 */
	public int getYearID() {
		return yearID;
	}
	/**
	 * @param yearID the yearID to set
	 */
	public void setYearID(int yearID) {
		this.yearID = yearID;
	}
	/**
	 * @return the makeID
	 */
	public int getMakeID() {
		return makeID;
	}
	/**
	 * @param makeID the makeID to set
	 */
	public void setMakeID(int makeID) {
		this.makeID = makeID;
	}
	/**
	 * @return the modelID
	 */
	public int getModelID() {
		return modelID;
	}
	/**
	 * @param modelID the modelID to set
	 */
	public void setModelID(int modelID) {
		this.modelID = modelID;
	}
	/**
	 * @return the styleID
	 */
	public int getStyleID() {
		return styleID;
	}
	/**
	 * @param styleID the styleID to set
	 */
	public void setStyleID(int styleID) {
		this.styleID = styleID;
	}
	/**
	 * @return the aaiaID
	 */
	public int getAaiaID() {
		return aaiaID;
	}
	/**
	 * @param aaiaID the aaiaID to set
	 */
	public void setAaiaID(int aaiaID) {
		this.aaiaID = aaiaID;
	}
	/**
	 * @return the year
	 */
	public double getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(double year) {
		this.year = year;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
	/**
	 * @param style the style to set
	 */
	public void setStyle(String style) {
		this.style = style;
	}
	/**
	 * @return the installTime
	 */
	public int getInstallTime() {
		return installTime;
	}
	/**
	 * @param installTime the installTime to set
	 */
	public void setInstallTime(int installTime) {
		this.installTime = installTime;
	}
	/**
	 * @return the drilling
	 */
	public String getDrilling() {
		return drilling;
	}
	/**
	 * @param drilling the drilling to set
	 */
	public void setDrilling(String drilling) {
		this.drilling = drilling;
	}
	/**
	 * @return the exposed
	 */
	public String getExposed() {
		return exposed;
	}
	/**
	 * @param exposed the exposed to set
	 */
	public void setExposed(String exposed) {
		this.exposed = exposed;
	}
	/**
	 * @return the attributes
	 */
	public ArrayList<PartAttribute> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(ArrayList<PartAttribute> attributes) {
		this.attributes = attributes;
	}
	public ArrayList<PartAttribute> attributes = new ArrayList<PartAttribute>();
	
	
	public ArrayList<Part> GetParts() throws UnknownHostException{
		ArrayList<Part> parts = new ArrayList<Part>();
		
		String url = "https://api.curtmfg.com/v2/GetParts?dataType=json" +
				"&year=" + this.getYear() +
				"&make=" + this.getMake() +
				"&model=" + this.getModel() +
				"&style=" + this.getStyle();
		HttpClient client = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(url);
		try{
			HttpResponse resp = client.execute(httpGet);
			HttpEntity entity = resp.getEntity();
			
			if(entity != null){
				InputStream stream = entity.getContent();
				String respString = Utils.convertStreamToString(stream);
				
				Part.DataWrapper wrap = new Part.DataWrapper();
				return wrap.fromJson(respString);
			}
		}catch(ClientProtocolException e){
			e.printStackTrace();
		}catch(UnknownHostException e){
			e.printStackTrace();
			throw new UnknownHostException();
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
}
