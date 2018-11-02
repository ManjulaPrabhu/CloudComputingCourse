# CloudComputingCourse
Elastic Beanstalk link: Courseservice-env.2qatkvitjp.us-west-2.elasticbeanstalk.com 

List of APIs implemented:

1.Programs:

GET: getAllPrograms() --> webapi/programs

GET: getProgram(long programId) --> webapi/programs/{programId}

POST : addProgram() --> webapi/programs
parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }

DELETE: deleteProgram(long programId) webapi/programs/{programId}

PUT: updateProgram(long programId, Program prog) 
parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }

2.Courses

GET: getAllCourses() --> webapi/courses

GET: getCourse(long coursed) --> webapi/courses/{courseId}

POST: addCourse() --> webapi/courses
parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”}

DELETE: deleteCourse(long coursed) --> webapi/courses/{courseId}

PUT: updateCourse(long courseId, Course course) --> webapi/courses
parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”}

3. Lecture

GET: getAllLectures() --> webapi/lectures

GET: getLecture(long lectureId) --> webapi/lectures/{lecturedid}

POST: addLecture() --> webapi/lectures
parameters to be passed through body: { “notes” : “abcs”, “associatedCourseId”: “1”}

DELETE: deleteLecture(long lectureId) --> webapi/lectures/{lecturedid}

PUT: updateLecture(long lectureId, Lecture lecture) webapi/lectures
parameters to be passed through body: { “notes” : “abcs”, “associatedCourseId”: “1”}

4. Student

GET: getAllStudents() --> webapi/students

GET: getStudent(long studentId) --> webapi/students/{studentid}

POST: addStudent() --> webapi/students
 parameters to be passed through body: { “firstName”: “xyz”, “associatedCourses”: [], “enrolledProgramName”: “is” }

DELETE: deleteStudent(long studentId) -->  webapi/students/{studentid}

PUT: updateStudent(long studentId, Student student) --> webapi/students
parameters to be passed through body: { “firstName”: “xyz”, “associatedCourses”: [], “enrolledProgramName”: “is” }


