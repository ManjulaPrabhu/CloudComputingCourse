package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Student;

public class StudentsService {
	static HashMap<Long, Student> students_map = InMemoryDatabase.getStudentDB();
	
	// Getting a list of all students 
	// GET "..webapi/students"
	public List<Student> getAllStudents() {	
		//Getting the list
		List<Student> list = new ArrayList<>();
		for (Student student : students_map.values()) {
			list.add(student);
		}
		return list ;
	}

	// Adding a student
	public void addStudent(String firstName,List<Long> associatedCourses, String enrolledProgramName) {
		// Next Id 
		long nextAvailableId = students_map.size() + 1;
		//Create a Student object
		Student studentObject=new Student(nextAvailableId,firstName, new ArrayList<Long>(),enrolledProgramName);
		students_map.put(nextAvailableId, studentObject);
	}
	
	public Student addStudent(Student student) {	
		long nextAvailableId = students_map.size() + 1;
		student.setStudentId(nextAvailableId);
		students_map.put(nextAvailableId, student);
		return students_map.get(nextAvailableId);
	}
	
	// Getting One Student
	public Student getStudent(Long studentId) {
		return students_map.get(studentId);
	}
	
	// Deleting a student
	public Student deleteStudent(Long studentId) {
		Student deletedStudent = students_map.get(studentId);
		students_map.remove(studentId);
		return deletedStudent;
	}
	
	// Updating Student Info
	public Student updateStudentDetails(Long studentId, Student student) {	
		Student oldStudentObject = students_map.get(studentId);
		studentId = oldStudentObject.getStudentId();
		student.setStudentId(studentId);
		// Publishing New Values
		students_map.put(studentId, student) ;
		return student;
	}

	
}
