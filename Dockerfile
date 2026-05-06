# Use Java 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the built JAR file
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]