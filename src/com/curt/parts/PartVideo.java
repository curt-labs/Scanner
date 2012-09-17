package com.curt.parts;

public class PartVideo {
	public int videoID = 0;
    public String youTubeVideoID = "";
    public boolean isPrimary = false;
    public int typeID = 0;
    public String type = "";
    public String typeicon = "";
	/**
	 * @return the videoID
	 */
	public int getVideoID() {
		return videoID;
	}
	/**
	 * @param videoID the videoID to set
	 */
	public void setVideoID(int videoID) {
		this.videoID = videoID;
	}
	/**
	 * @return the youTubeVideoID
	 */
	public String getYouTubeVideoID() {
		return youTubeVideoID;
	}
	/**
	 * @param youTubeVideoID the youTubeVideoID to set
	 */
	public void setYouTubeVideoID(String youTubeVideoID) {
		this.youTubeVideoID = youTubeVideoID;
	}
	/**
	 * @return the isPrimary
	 */
	public boolean isPrimary() {
		return isPrimary;
	}
	/**
	 * @param isPrimary the isPrimary to set
	 */
	public void setPrimary(boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	/**
	 * @return the typeID
	 */
	public int getTypeID() {
		return typeID;
	}
	/**
	 * @param typeID the typeID to set
	 */
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the typeicon
	 */
	public String getTypeicon() {
		return typeicon;
	}
	/**
	 * @param typeicon the typeicon to set
	 */
	public void setTypeicon(String typeicon) {
		this.typeicon = typeicon;
	}
}
