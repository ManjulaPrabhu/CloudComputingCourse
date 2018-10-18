package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;


public class Course {

	private String courseName;
	private long courseId;
	private List<Long> associatedLectureId;
	private List<Long> associatedStudentsId;
	private Long associatedProfessorId;
	private String board;
	private Long associatedTAId;
	
	public Course() {
		
	}
	
	public Course(long courseId, String courseName, List<Long> associatedLectureId, List<Long> associatedStudentsId, long associatedProfessorId, String board, long associatedTAId) {
		this.courseName=courseName;
		this.courseId=courseId;
		this.associatedLectureId=associatedLectureId;
		this.associatedStudentsId=associatedStudentsId;
		this.associatedProfessorId=associatedProfessorId;
		this.board=board;
		this.associatedTAId=associatedTAId;
	}


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public List<Long> getAssociatedLectureId() {
		return associatedLectureId;
	}

	public void setAssociatedLectureId(List<Long> associatedLectureId) {
		this.associatedLectureId = associatedLectureId;
	}

	public List<Long> getAssociatedStudentsId() {
		return associatedStudentsId;
	}

	public void setAssociatedStudentsId(List<Long> associatedStudentsId) {
		this.associatedStudentsId = associatedStudentsId;
	}

	public Long getAssociatedProfessorId() {
		return associatedProfessorId;
	}

	public void setAssociatedProfessorId(Long associatedProfessorId) {
		this.associatedProfessorId = associatedProfessorId;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Long getAssociatedTAId() {
		return associatedTAId;
	}

	public void setAssociatedTAId(Long associatedTAId) {
		this.associatedTAId = associatedTAId;
	}


	
}
