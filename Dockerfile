FROM eclipse-temurin:21-jre-alpine

# Apply the latest Alpine security updates (e.g. libexpat CVE fixes)
RUN apk upgrade --no-cache

# Set working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/democyber-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 for the web application
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
