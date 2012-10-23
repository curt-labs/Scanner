package com.curt.parts;

public class PartVideo {
	public int VideoId = 0;
    /**
	 * @return the videoId
	 */
	public int getVideoId() {
		return VideoId;
	}
	/**
	 * @param videoId the videoId to set
	 */
	public void setVideoId(int videoId) {
		VideoId = videoId;
	}
	/**
	 * @return the youTubeVideoId
	 */
	public String getYouTubeVideoId() {
		return YouTubeVideoId;
	}
	/**
	 * @param youTubeVideoId the youTubeVideoId to set
	 */
	public void setYouTubeVideoId(String youTubeVideoId) {
		YouTubeVideoId = youTubeVideoId;
	}
	/**
	 * @return the isPrimary
	 */
	public boolean isIsPrimary() {
		return IsPrimary;
	}
	/**
	 * @param isPrimary the isPrimary to set
	 */
	public void setIsPrimary(boolean isPrimary) {
		IsPrimary = isPrimary;
	}
	/**
	 * @return the typeId
	 */
	public int getTypeId() {
		return TypeId;
	}
	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(int typeId) {
		TypeId = typeId;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * @return the typeIcon
	 */
	public String getTypeIcon() {
		return TypeIcon;
	}
	/**
	 * @param typeIcon the typeIcon to set
	 */
	public void setTypeIcon(String typeIcon) {
		TypeIcon = typeIcon;
	}
	public String YouTubeVideoId = "";
    public boolean IsPrimary = false;
    public int TypeId = 0;
    public String Type = "";
    public String TypeIcon = "";
	
}
