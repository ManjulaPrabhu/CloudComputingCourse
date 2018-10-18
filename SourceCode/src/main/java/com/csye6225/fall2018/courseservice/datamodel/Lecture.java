package com.csye6225.fall2018.courseservice.datamodel;

public class Lecture {
	private String notes;
	private long lectureId;
	private long associatedCourseId;
	
	public Lecture(){
		
	}
	public Lecture(long lectureId, String notes, long associatedCourseId) {
		this.setLectureId(lectureId);
		this.setNotes(notes);
		this.setAssociatedCourseId(associatedCourseId);
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public long getLectureId() {
		return lectureId;
	}
	public void setLectureId(long lectureId) {
		this.lectureId = lectureId;
	}
	public long getAssociatedCourseId() {
		return associatedCourseId;
	}
	public void setAssociatedCourseId(long associatedCourseId) {
		this.associatedCourseId = associatedCourseId;
	}
	
}
