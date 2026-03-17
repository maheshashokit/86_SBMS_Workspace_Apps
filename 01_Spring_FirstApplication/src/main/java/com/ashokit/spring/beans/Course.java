package com.ashokit.spring.beans;

public class Course {
	
	private String courseId;
	
	private String name;
	
	private String fee;
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFee(String fee) {
		this.fee = fee;
	}
	
	public String getFee() {
		return fee;
	}
	
	//service method to display data
	public String displayCourseDetails() {
		return String.format("CourseId: %S, CourseName: %S, CourseFee: %S",courseId,name,fee);
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", fee=" + fee + "]";
	}
}
