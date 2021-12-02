# Start with a base image containing Java runtime
#FROM openjdk:8-jdk-alpine
FROM alpine
#FROM openjdk:11

# Make port 9002 available to the world outside this container
EXPOSE 9002
RUN apk update
RUN apk add openjdk11
# The application's jar file
ARG JAR_FILE=target/DockerCompose_Server-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} DockerCompose_Server.jar

# Run the jar file
ENTRYPOINT ["java", "-jar","/DockerCompose_Server.jar"]