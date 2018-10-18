package com.csye6225.fall2018.courseservice.datamodel;

import java.util.List;


public class Program {
	private long programId;
	private String programName;
	private List<Long> associatedCourseId;
	
	public Program() {
		
	}
	
	public Program(long programId, String programName, List<Long> associatedCourseId) {
		this.programId=programId;
		this.programName=programName;
		this.associatedCourseId=associatedCourseId;
	}
	
	public void setAssociatedCourseId(List<Long> associatedCourseId) {
		this.associatedCourseId=associatedCourseId;
	}
	public List<Long> getAssociatedCourseId(){
		return associatedCourseId;
	}
	
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}


	public long getProgramId() {
		return programId;
	}

	public void setProgramId(long programId) {
		this.programId = programId;
	}

	
	
}
