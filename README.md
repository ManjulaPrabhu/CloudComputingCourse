# CloudComputingCourse
Elastic Beanstalk link: Courseservice-env.2qatkvitjp.us-west-2.elasticbeanstalk.com 
List of APIs implemented:
1.	Class: Program.java
Resource: ProgramResource.java
Service: ProgramService.java
GET  getAllPrograms()
GET  getProgram(long programId)
POST  addProgram() parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }
DELETE  deleteProgram(long programId)
PUT  updateProgram(long programId, Program prog)  parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }
2.	Class: Course.java
Resource: CourseResource.java
Service: CourseService.java
GET  getAllCourses()
GET  getCourse(long coursed)
POST  addCourse()  parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”}
DELETE  deleteCourse(long coursed)
PUT  updateCourse(long courseId, Course course)  parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”}
3.	Class: Lecture.java
Resource: LectureResource.java
Service: LectureService.java
GET  getAllLectures()
GET  getLecture(long lectureId)
POST  addLecture()  parameters to be passed through body: { “notes” : “abcs”, “associatedCourseId”: “1”}
DELETE  deleteLecture(long lectureId)
PUT  updateLecture(long lectureId, Lecture lecture)   parameters to be passed through body: { “notes” : “abcs”, “associatedCourseId”: “1”}

4.	Class: Student.java
Resource: StudentResource.java
Service: StudentService.java
GET  getAllStudents()
GET  getStudent(long studentId)
POST  addStudent()  parameters to be passed through body: { “firstName”: “xyz”, “associatedCourses”: [], “enrolledProgramName”: “is” }
DELETE  deleteStudent(long studentId)
PUT  updateStudent(long studentId, Student student)   parameters to be passed through body: { “firstName”: “xyz”, “associatedCourses”: [], “enrolledProgramName”: “is” }



	



