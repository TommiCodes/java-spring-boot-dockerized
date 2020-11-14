# Content Video 1
Dockerize a Java Spring Boot Starter Template

<<link to youtube video>>
(published on 19th of November 2020)

# You need
- Java
- Maven
- Docker
- Spring Initiliazr (e.g. in Spring Initializr Extension in VsCode or https://start.spring.io/)

# Start Commands for Docker
Build your image:  
`docker build <your path> -t <<user>/project-name>`  

Run:  
`docker run -p 8080:3000 <<user>/project-name>`  

For Example:  
`docker build <your path> -t thomas-oliver/sb-dockerized`  
`docker run -p 8080:3000 thomas-oliver/sb-dockerized`  

Basic Docker Commands:  
List your docker images: `docker images`  
List your running containers: `docker ps`  
List also stopped containers: `docker ps -a`
Kill a running container: `docker kill <id of container from docker ps (first 3 letters)>`, eg `docker kill fea`  