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

import com.csye6225.fall2018.courseservice.datamodel.Lecture;
import com.csye6225.fall2018.courseservice.service.LectureService;

// .. /webapi/myresource
@Path("lectures")
public class LectureResource {

	LectureService lectureServiceObject = new LectureService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Lecture> getAllLectures() {
		return lectureServiceObject.getAllLectures();
	}
	
	
	// ... webapi/lecture/1 
	@GET
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture getLecture(@PathParam("lectureId") long lectureId) {
		return lectureServiceObject.getLecture(lectureId);
	}
	
	@DELETE
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture deleteLecture(@PathParam("lectureId") long lectureId) {
		return lectureServiceObject.deleteLecture(lectureId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture addLecture(Lecture lect) {
			 return lectureServiceObject.addLecture(lect);
	}
	
	@PUT
	@Path("/{lectureId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture updateLecture(@PathParam("lectureId") long lectureId, 
			Lecture lect) {
		return lectureServiceObject.updateLecture(lectureId, lect);
	}
	
	public void addLecture(String notes,long associatedCourseId) {
		lectureServiceObject.addLecture(notes,associatedCourseId);
	}
	
 }
