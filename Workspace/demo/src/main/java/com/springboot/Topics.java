package com.springboot;

public class Topics {

	private String courseid;
	private String coursename;
	
	public Topics() {
		
	}
	
	public Topics(String courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
}
