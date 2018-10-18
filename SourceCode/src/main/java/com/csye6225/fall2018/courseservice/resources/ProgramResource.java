package com.csye6225.fall2018.courseservice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.csye6225.fall2018.courseservice.datamodel.Program;
import com.csye6225.fall2018.courseservice.service.ProgramService;

// .. /webapi/myresource
@Path("programs")
public class ProgramResource {

	ProgramService progService = new ProgramService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Program> getAllPrograms() {
		return progService.getAllPrograms();
	}
	
	
	// ... webapi/programs/1 
	@GET
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program getProgram(@PathParam("programId") long progId) {
		return progService.getProgram(progId);
	}
	

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program addProgram(Program prog) {
		 return progService.addProgram(prog);
	}
	
	@DELETE
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Program deleteProgram(@PathParam("programId") long progId) {
		return progService.deleteProgram(progId);
	}
	
	@PUT
	@Path("/{programId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Program updateProgram(@PathParam("programId") long progId, 
			Program prog) {
		return progService.updateProgram(progId,prog);
	}
	
	
	public void addProgram(String programName,List<Long> associatedCourseId) {
		progService.addProgram(programName,associatedCourseId);
	}
 }
