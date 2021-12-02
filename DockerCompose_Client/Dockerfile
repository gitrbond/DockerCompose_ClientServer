FROM alpine

RUN apk update
RUN apk add openjdk11
# Make port 9001 available to the world outside this container
EXPOSE 9001

# The application's jar file
ARG JAR_FILE=target/DockerCompose_Client-0.0.1-SNAPSHOT.jar
#ARG JAR_FILE=target/DockerCompose_Client.jar
# Add the application's jar to the container
ADD ${JAR_FILE} DockerCompose_Client.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "/DockerCompose_Client.jar"]