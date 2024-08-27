
# Use an official Java runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory in the container
WORKDIR /app

# # Copy the Java application to the container
# COPY TestScript.java .

# COPY pom.xml .
COPY . .

# RUN mvn build

# CMD ["mvn", "test"]
