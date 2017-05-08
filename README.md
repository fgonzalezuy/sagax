# Sagax

                # Installation guide

Requirements to run this application:
Java - jdk version 1.8.0_91
Maven version 3.5.0


1.Uncompile the attached document.
2.Copy the folder sagax into the desired location.
3.Open a terminal, goes to the sagax folder, and run the follow command: “mvn clean package”
4.On the same terminal run the next command: “mvn spring-boot:run”, maven will lunch a tomcat server. Important: If you have some other server running, try to stop it, could have some issues with the normal configuration of the tomcat.

                # How to use it(with postman app)

The application is running on the url “http://localhost:8080/stairwell” and it needs 2 parameters to run, and both are mandatory, and only allows GET requests. 
A.numberOfFlights _ List of Integer, this parameter will be repeated for each new Integer in the list
B.stepsPerStride _ Integer

Examples:

With only one “numberOfFlights”
http://localhost:8080/stairwell?numberOfFlights=17&stepsPerStride=3

With multiple “numberOfFlights”
http://localhost:8080/stairwell?numberOfFlights=4&numberOfFlights=9&numberOfFlights=8&numberOfFlights=11&numberOfFlights=7&numberOfFlights=20&numberOfFlights=14&stepsPerStride=2