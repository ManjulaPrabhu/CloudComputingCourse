package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;

public class Student {
	private long studentId;
	private String firstName;
	private List<Long> associatedCourses;
	private String enrolledProgramName;
	
	
	public Student() {
		
	}
	
	public Student(long studentId) {
		this.studentId=studentId;
	}

	public Student(long studentId, String firstName, List<Long> associatedCourses, String enrolledProgramName) {
		this.studentId = studentId;
		this.firstName=firstName;
		this.setAssociatedCourses(associatedCourses);
		this.setEnrolledProgramName(enrolledProgramName);
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<Long> getAssociatedCourses() {
		return associatedCourses;
	}

	public void setAssociatedCourses(List<Long> associatedCourses) {
		this.associatedCourses = associatedCourses;
	}

	public String getEnrolledProgramName() {
		return enrolledProgramName;
	}

	public void setEnrolledProgramName(String enrolledProgramName) {
		this.enrolledProgramName = enrolledProgramName;
	}
	
	
}
