package com.spb.activemqservice.models;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -3191372284733768613L;
	
	private String studentName;
	private String studentAddress;
	private Long studentId;
	
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
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentName=");
		builder.append(studentName);
		builder.append(", studentAddress=");
		builder.append(studentAddress);
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
