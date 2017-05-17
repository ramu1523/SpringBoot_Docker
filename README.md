# SpringBoot_Docker
Step 1:
Install Docker CE(or Docker for mac – for mac users)
   https://www.docker.com/community-edition
or 
   https://docs.docker.com/docker-for-mac/install/#download-docker-for-mac (for mac users)
Docker for windows:(Haven’t tried this, but this should work):
  https://docs.docker.com/docker-for-window 

Step2:
Create a docker build/image using the below command
$ docker build -t dockerdemo-v1.0 .

Execute the below command to view the docker images
$ docker images

Step3:
Run the docker build as below
$ docker run -d --name dockerdemo-v1.0 --restart=always dockerdemo-v1.0


# docker commands
remove docker image: 
$ docker rm image-name


To view the docker logs : 
$ docker logs container-id


To view the docker containers
$ docker ps --all

Test the docker app response using the below url
http://localhost:8080/ramu
