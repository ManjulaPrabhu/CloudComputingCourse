# CloudComputingCourse
Elastic Beanstalk link: Courseservice-env.2qatkvitjp.us-west-2.elasticbeanstalk.com 

List of APIs implemented:

1.Class: Program.java

Resource: ProgramResource.java

Service: ProgramService.java

GET: getAllPrograms()

GET: getProgram(long programId)

POST : addProgram() 
parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }

DELETE: deleteProgram(long programId)

PUT: updateProgram(long programId, Program prog) 
parameters to be passed through body: {“programName” :”xyzstring”, “associatedCourseId” : [] }


