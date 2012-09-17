package com.curt.parts;

public class PartImage {
	public int imageID = 0;
    public String size = "";
    /**
	 * @return the imageID
	 */
	public int getImageID() {
		return imageID;
	}
	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the partID
	 */
	public int getPartID() {
		return partID;
	}
	/**
	 * @param partID the partID to set
	 */
	public void setPartID(int partID) {
		this.partID = partID;
	}
	/**
	 * @return the sort
	 */
	public char getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(char sort) {
		this.sort = sort;
	}
	public String path = "";
    public int height = 0;
    public int width = 0;
    public int partID = 0;
    public char sort;
}
