package com.curt.vehicle;

public class DecodedVin{
   	private String vIN;
   	private String valid;
   	private String status;
   	private Vehicle vehicle;
   	private String version;

 	public String getVIN(){
		return this.vIN;
	}
	public void setVIN(String vIN){
		this.vIN = vIN;
	}
 	public String getValid(){
		return this.valid;
	}
	public void setValid(String valid){
		this.valid = valid;
	}
 	public String getStatus(){
		return this.status;
	}
	public void setStatus(String status){
		this.status = status;
	}
 	public Vehicle getVehicle(){
		return this.vehicle;
	}
	public void setVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
	}
 	public String getVersion(){
		return this.version;
	}
	public void setVersion(String version){
		this.version = version;
	}
	
	public class Vehicle{
	   	private String body;
	   	private String driveline;
	   	private String engine;
	   	private String id;
	   	private String make;
	   	private String model;
	   	private String trim;
	   	private String year;

	 	public String getBody(){
			return this.body;
		}
		public void setBody(String body){
			this.body = body;
		}
	 	public String getDriveline(){
			return this.driveline;
		}
		public void setDriveline(String driveline){
			this.driveline = driveline;
		}
	 	public String getEngine(){
			return this.engine;
		}
		public void setEngine(String engine){
			this.engine = engine;
		}
	 	public String getId(){
			return this.id;
		}
		public void setId(String id){
			this.id = id;
		}
	 	public String getMake(){
			return this.make;
		}
		public void setMake(String make){
			this.make = make;
		}
	 	public String getModel(){
			return this.model;
		}
		public void setModel(String model){
			this.model = model;
		}
	 	public String getTrim(){
			return this.trim;
		}
		public void setTrim(String trim){
			this.trim = trim;
		}
	 	public String getYear(){
			return this.year;
		}
		public void setYear(String year){
			this.year = year;
		}
	}
}
