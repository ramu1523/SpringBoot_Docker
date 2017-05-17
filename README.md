# SpringBoot_Docker

Create a docker build/image using the below command
$ docker build -t dockerdemo-v1.0 .

Execute the below command to view the docker images
$ docker images

Run the docker build as below

$ docker run -d --name dockerdemo-v1.0 --restart=always dockerdemo-v1.0


# docker commands
remove docker image: 
$ docker rm image-name


To view the docker logs : 
$ docker logs container-id


To view the docker images
$ docker ps --all

Test the docker app response using the below url
http://localhost:8080/ramu
