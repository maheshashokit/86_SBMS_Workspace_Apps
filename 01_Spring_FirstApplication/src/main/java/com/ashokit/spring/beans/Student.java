package com.ashokit.spring.beans;

public class Student {
	
	private String studentId;	
	private String name;	
	private String courseName;
	private Course course;
	private Address address;
	
	//generating the setter method
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Course getCourse() {
		return course;
	}	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", courseName=" + courseName + ", course="
				+ course + ", address=" + address + "]";
	}

	//service method to display data
	public String displayStudentDetails() {
		return String.format("StudentId: %S, StudentName: %S, CourseName: %S",studentId, name,courseName);
	}
	
	public String displayCourseDetails() {
		//calling service method from course class
		return course.displayCourseDetails();
	}
	
	public String displayAddressDetails() {
		//calling service method from Student class
		return address.displayAddressDetails();
	}
}