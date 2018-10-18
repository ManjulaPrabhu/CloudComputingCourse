package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Lecture;

public class LectureService {
	static HashMap<Long, Lecture> lect_Map = InMemoryDatabase.getLectureDB();
	
	// Getting a list of all lectures
	// GET "..webapi/lectures"
	public List<Lecture> getAllLectures() {	
		//Getting the list
		List<Lecture> list = new ArrayList<>();
		for (Lecture lect : lect_Map.values()) {
			list.add(lect);
		}
		return list ;
	}

	// Adding a lecture
	public void addLecture(String notes,long associatedCourseId) {
		// Next Id 
		long nextAvailableId = lect_Map.size() + 1;
		//Create a Lecture Object
		Lecture lect = new Lecture(nextAvailableId,notes,associatedCourseId);
		lect_Map.put(nextAvailableId, lect);
	}
	
	public Lecture addLecture(Lecture lect) {	
		long nextAvailableId = lect_Map.size() + 1;
		lect.setLectureId(nextAvailableId);
		lect_Map.put(nextAvailableId, lect);
		return lect_Map.get(nextAvailableId);
	}
	
	// Getting One Lecture
	public Lecture getLecture(Long lectId) {
		return lect_Map.get(lectId);
	}
	
	// Deleting a lecture
	public Lecture deleteLecture(Long lectId) {
		Lecture deletedLecture = lect_Map.get(lectId);
		lect_Map.remove(lectId);
		return deletedLecture;
	}
	
	// Updating Lecture Info
	public Lecture updateLecture(Long lectId, Lecture lect) {	
		Lecture oldLectureObject = lect_Map.get(lectId);
		lectId = oldLectureObject.getLectureId();
		lect.setLectureId(lectId);
		// Publishing New Values
		lect_Map.put(lectId, lect) ;
		return lect;
	}
	
}
