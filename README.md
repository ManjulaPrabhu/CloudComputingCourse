# CloudComputingCourse
Elastic Beanstalk link: Courseservice-env-1.nccvaj53rs.us-west-2.elasticbeanstalk.com 

List of APIs implemented:
1.Courses

GET: getAllCourses() --> webapi/courses

GET: getCourse(long coursed) --> webapi/courses/{courseId}

POST: addCourse() --> webapi/courses
parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”}

DELETE: deleteCourse(long courseId) --> webapi/courses/{courseId}

PUT: updateCourse(long courseId, Course course) --> webapi/courses
parameters to be passed through body: { “courseName”: “abc”, “associatedLectureId” :[], “associatedStudentsId”: [], “associatedProfessorId”: “1”, “board”: “cc”, “associatedTAId” : “1”,"courseSNSTopic":"acscs"(valid topic ARN String)}

2. Student

GET: getAllStudents() --> webapi/students

GET: getStudent(long studentId) --> webapi/students/{studentid}

POST: addStudent() --> webapi/students
 parameters to be passed through body: { “firstName”: “xyz”, "emailId": "xyz@xyz.com",“enrolledProgramName”: “is” }

POST: registerToCourses() --> webapi/students/{studentId}/register
 parameters to be passed through body: { “associatedCourses”: [123,121]}

DELETE: deleteStudent(long studentId) -->  webapi/students/{studentid}

PUT: updateStudent(long studentId, Student student) --> webapi/students
parameters to be passed through body: { “firstName”: “xyz”, “associatedCourses”: [], “enrolledProgramName”: “is” }


3. Professor

GET: getAllProfessors() --> webapi/professors

GET: getProfessor(long professorId) --> webapi/professors/{professorId}

POST: addProfessor() --> webapi/professors
 parameters to be passed through body: { “firstName”: “xyz”, “department”: "is", “joiningDate”: "2018/09/09" }

DELETE: deleteProfessor(long professorId) -->  webapi/professors/{professorId}

PUT: updateProfessor(long professorId, Professor prof) --> webapi/professors
parameters to be passed through body: { “firstName”: “xyz”, “department”: "cs", “joiningDate”: "2017/09/09"  }

4.Board

GET: getAllBoards() --> webapi/board

GET: getBoard(long boardId) --> webapi/board/{boardId}

POST: addBoard() --> webapi/board
 parameters to be passed through body: { "courseId" : "2"}

DELETE: deleteBoard(long boardId) -->  webapi/board/{boardId}

PUT: updateBoard(long boardId, Board board) --> webapi/board
parameters to be passed through body: { "courseId" : "3"}

5.Announcement

GET: getAllAnnouncements() --> webapi/announcements

GET: getAnnouncement(long announcementId, long boardId) --> webapi/announcements/{announcementId}

POST: addAnnouncement() --> webapi/announcements
 parameters to be passed through body: { "announcementText" : "abc", "boardId": "123"}

DELETE: deleteAnnouncementId(long announcementId, long boardId) -->  webapi/announcements/{announcementId}

PUT: updateAnnouncement(long announcementId, long boardId, Announcement announcement) --> webapi/announcements
parameters to be passed through body: { "announcementText" : "sddssaf"}

