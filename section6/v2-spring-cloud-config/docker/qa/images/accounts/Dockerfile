LABEL org.label-schema.version=v1.0.0
LABEL com.docker.app.name=accounts
LABEL com.docker.app.version=s6

#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Create a working directory for the application
WORKDIR /app

# Copy the application source code to the working directory
COPY . .

# Build the application using Maven (clean and install)
RUN mvn clean install

#Information around who maintains the image
MAINTAINER mamadou4bah.com

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]