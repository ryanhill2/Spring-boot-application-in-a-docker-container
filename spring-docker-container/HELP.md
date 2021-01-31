# Getting our docker container
* the jar will be in the target folder this 
jar will be created when you install/run
the spring boot app.

* insure docker is installed on your 
machine and from the root of the app run 
sudo docker build -t spring-boot-docker.jar .

* you should now have a image called 
spring-boot-docker.jar

* then create a container by doing
docker run -p 9090:8080 spring-boot-docker.jar