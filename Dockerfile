FROM java:8

ADD build/libs/dockerdemo-0.0.1-SNAPSHOT.jar dockerdemo-v1.jar
RUN  bash -c 'touch /dockerdemo.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dockerdemo-v1.jar"]