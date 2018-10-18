package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.Course;
import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Student;

public class CourseService {
	static HashMap<Long, Course> course_Map = InMemoryDatabase.getCourseDB();
	
	// Getting a list of all courses
	// GET "..webapi/courses"
	public List<Course> getAllCourses() {	
		//Getting the list
		List<Course> list = new ArrayList<>();
		for (Course course: course_Map.values()) {
			list.add(course);
		}
		return list ;
	}

	// Adding a course
	public void addCourse(String courseName,List<Long> associatedLectureId, List<Long> associatedStudentsId, long associatedProfessorId, String board, long associatedTAId) {
		// Next Id 
		long nextAvailableId = course_Map.size() + 1;
		
		//Create a Course Object
		Course course = new Course(nextAvailableId, courseName, new ArrayList<Long>(), new ArrayList<Long>(),associatedProfessorId, board, associatedTAId);
		course_Map.put(nextAvailableId, course);
	}
	public Course addCourse(Course course) {	
		long nextAvailableId = course_Map.size() + 1;
		course.setCourseId(nextAvailableId);
		course_Map.put(nextAvailableId, course);
		return course_Map.get(nextAvailableId);
	}
	
	// Getting One Course
	public Course getCourse(Long courseId) {
		return course_Map.get(courseId);
	}
	
	// Deleting a course
	public Course deleteCourse(Long courseId) {
		Course deletedCourse = course_Map.get(courseId);
		course_Map.remove(courseId);
		return deletedCourse;
	}
	
	// Updating Course Info
	public Course updateCourse(Long courseId, Course course) {	
		Course oldCourseObject= course_Map.get(courseId);
		courseId = oldCourseObject.getCourseId();
		course.setCourseId(courseId);
		// Publishing New Values
		course_Map.put(courseId, course) ;
		return course;
	}
	
}
