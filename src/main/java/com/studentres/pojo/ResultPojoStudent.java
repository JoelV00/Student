package com.studentres.pojo;

public class ResultPojoStudent {
	private int id;
	private String name;
	private int rollNumber;
	private String gender;
	private int age;
	private String course;
	private int attendance;
	
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getCourse() {
		return course;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	

}
