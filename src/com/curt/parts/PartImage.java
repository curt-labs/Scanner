package com.curt.parts;

public class PartImage {
    
	/**
	 * @return the Size
	 */
	public String getSize() {
		return Size;
	}
	/**
	 * @param Size the Size to set
	 */
	public void setSize(String Size) {
		this.Size = Size;
	}
	/**
	 * @return the Path
	 */
	public String getPath() {
		return Path;
	}
	/**
	 * @param Path the Path to set
	 */
	public void setPath(String Path) {
		this.Path = Path;
	}
	/**
	 * @return the Height
	 */
	public int getHeight() {
		return Height;
	}
	/**
	 * @param Height the Height to set
	 */
	public void setHeight(int Height) {
		this.Height = Height;
	}
	/**
	 * @return the Width
	 */
	public int getWidth() {
		return Width;
	}
	/**
	 * @param Width the Width to set
	 */
	public void setWidth(int Width) {
		this.Width = Width;
	}
	/**
	 * @return the PartId
	 */
	public int getPartID() {
		return PartId;
	}
	/**
	 * @param PartId the PartId to set
	 */
	public void setPartID(int PartId) {
		this.PartId = PartId;
	}
	/**
	 * @return the Sort
	 */
	public char getSort() {
		return Sort;
	}
	/**
	 * @param Sort the Sort to set
	 */
	public void setSort(char Sort) {
		this.Sort = Sort;
	}
	public String Path = "";
	public String Size = "";
    public int Height = 0;
    public int Width = 0;
    public int PartId = 0;
    public char Sort;
}
