package com.springcore_test;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentEmail;
	
	//getter and setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	//constructor
	public Student(int studentId, String studentName, String studentAddress, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentEmail = studentEmail;
	}
	
	//default constructor
	public Student() {
		super();
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentEmail=" + studentEmail + "]";
	}
	
	
	
	

}
