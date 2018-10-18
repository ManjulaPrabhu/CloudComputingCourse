package com.csye6225.fall2018.courseservice.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.csye6225.fall2018.courseservice.datamodel.InMemoryDatabase;
import com.csye6225.fall2018.courseservice.datamodel.Program;

public class ProgramService {
	static HashMap<Long, Program> prog_Map = InMemoryDatabase.getProgramDB();
	
	// Getting a list of all professor 
	// GET "..webapi/programs"
	public List<Program> getAllPrograms() {	
		//Getting the list
		ArrayList<Program> list = new ArrayList<>();
		for (Program program : prog_Map.values()) {
			list.add(program);
		}
		return list ;
	}

	// Adding a program
	public void addProgram(String programName,List<Long> associatedCourseId) {
		// Next Id 
		long nextAvailableId = prog_Map.size() + 1;
		//Create a Program Object
		Program prog = new Program(nextAvailableId, programName, new ArrayList<Long>());
		prog_Map.put(nextAvailableId, prog);
	}
	
	public Program addProgram(Program prog) {	
		long nextAvailableId = prog_Map.size() + 1;
		prog.setProgramId(nextAvailableId);
		prog_Map.put(nextAvailableId, prog);
		return prog_Map.get(nextAvailableId);
	}
	
	// Getting One Program
	public Program getProgram(Long progId) {
		return prog_Map.get(progId);
	}
	
	// Deleting a program
	public Program deleteProgram(Long progId) {
		Program deletedProgramDetails = prog_Map.get(progId);
		prog_Map.remove(progId);
		return deletedProgramDetails;
	}
	
	//Updating a Program
	public Program updateProgram(Long progId, Program prog) {	
		Program oldProgramObject= prog_Map.get(progId);
		progId = oldProgramObject.getProgramId();
		prog.setProgramId(progId);
		// Publishing New Values
		prog_Map.put(progId, prog) ;
		return prog;
	}
	
}
