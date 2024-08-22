# Use an official OpenJDK image as the base image
FROM openjdk:11-jdk

# Install Node.js
RUN apt-get update && \
    apt-get install -y curl && \
    curl -sL https://deb.nodesource.com/setup_14.x | bash - && \
    apt-get install -y nodejs

# Install Appium
RUN npm install -g appium
RUN appium driver install uiautomator2
RUN appium plugin install execute-driver

# Expose the Appium server port
EXPOSE 4723

COPY . .
# Define the command to start the Appium server
CMD ["appium"]

