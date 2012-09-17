package com.curt.parts;

public class PartReview {
	public int reviewID = 0;
    public int partID = 0;
    public int rating  = 0;
    /**
	 * @return the reviewID
	 */
	public int getReviewID() {
		return reviewID;
	}
	/**
	 * @param reviewID the reviewID to set
	 */
	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the review_text
	 */
	public String getReview_text() {
		return review_text;
	}
	/**
	 * @param review_text the review_text to set
	 */
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String subject  = "";
    public String review_text  = "";
    public String name  = "";
    public String email  = "";
    public String createdDate = "";
}
