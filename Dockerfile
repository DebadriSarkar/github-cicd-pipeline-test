FROM openjdk:17
EXPOSE 8080
ADD target/github-cicd-demo-1.0.0.jar github-cicd-demo-1.0.0.jar
ENTRYPOINT ["java","-jar","/github-cicd-demo-1.0.0.jar"]