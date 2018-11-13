package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="course")
public class Course {
	private String id;
	private String courseName;
	private long courseId;
	private List<Long> associatedLectureId;
	private List<Long> associatedStudentsId;
	private long associatedProfessorId;
	private long boardId;
	private long associatedTAId;
	
	public Course() {
		
	}
	
	public Course(String id,long courseId, String courseName, List<Long> associatedLectureId, List<Long> associatedStudentsId, long associatedProfessorId, long boardId, long associatedTAId) {
		this.id=id;
		this.courseName=courseName;
		this.courseId=courseId;
		this.associatedLectureId=associatedLectureId;
		this.associatedStudentsId=associatedStudentsId;
		this.associatedProfessorId=associatedProfessorId;
		this.boardId=boardId;
		this.associatedTAId=associatedTAId;
	}

	@DynamoDBAttribute(attributeName="courseName")
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@DynamoDBIndexHashKey(attributeName = "courseId",globalSecondaryIndexName = "courseId-index")
	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@DynamoDBAttribute(attributeName="associatedLectureId")
	public List<Long> getAssociatedLectureId() {
		return associatedLectureId;
	}

	public void setAssociatedLectureId(List<Long> associatedLectureId) {
		this.associatedLectureId = associatedLectureId;
	}

	@DynamoDBAttribute(attributeName="associatedStudentsId")
	public List<Long> getAssociatedStudentsId() {
		return associatedStudentsId;
	}

	public void setAssociatedStudentsId(List<Long> associatedStudentsId) {
		this.associatedStudentsId = associatedStudentsId;
	}

	@DynamoDBAttribute(attributeName="associatedProfessorId")
	public Long getAssociatedProfessorId() {
		return associatedProfessorId;
	}

	public void setAssociatedProfessorId(Long associatedProfessorId) {
		this.associatedProfessorId = associatedProfessorId;
	}
	
	@DynamoDBAttribute(attributeName="boardId")
	public Long getBoardId() {
		return boardId;
	}

	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}

	@DynamoDBAttribute(attributeName="associatedTAId")
	public Long getAssociatedTAId() {
		return associatedTAId;
	}

	public void setAssociatedTAId(Long associatedTAId) {
		this.associatedTAId = associatedTAId;
	}
	
	@DynamoDBHashKey(attributeName = "id")
	@DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
