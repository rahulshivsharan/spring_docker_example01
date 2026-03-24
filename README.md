# Spring-Boot Docker application with Rest service

### Spring-boot application 
The spring boot application runs on port 8089
In application.properties file the entry is as below

```
server.port=8089
```

You can run the application on eclipse and you can hit the endpoint at port 8089

### Running application on Docker

Your Dockerfile is present in folder locaton

```
src/main/docker
```


Once you do maven clean and maven install from eclipse, a jar file is created in 'target' folder

```
target/spring_docker_ex01.jar

```

From command terminal you need to go to the project folder, here in my case my project folder is 'spring_docker_ex01' 
present in parent folder 'code_practise'

```
code_practise/spring_docker_ex01$

```

run the below command to copy the .jar file from 'target' folder to 'docker' folder

```
cp target/spring_docker_ex01.jar src/main/docker/

```

goto to 'docker' folder where 'Dockerfile' exists

```
cd src/main/docker

```

run the below docker command to build the docker image

```
docker build -t springboot/spring_docker_ex01 .

```

to run the spring boot application present in the docker image run the below command

```
docker run -p 8080:8089 springboot/spring_docker_ex01

```

Here you can see even if the port 8089 is present in application.properties; 

the application when run from docker image runs on port 8080


You can go to the browser and do

```
http://localhost:8080/hi

```

it will load

```
{
  "message" : "Hello from Docker"
}
```

