# Step 1: Build with Maven
FROM --platform=linux/arm64 maven:3.9.9-eclipse-temurin-21-alpine AS maven-builder

WORKDIR /app
COPY . .

# ENV JAVA_TOOL_OPTIONS="-XX:UseSVE=0"

RUN mvn clean package -DskipTests

# Step 2: Run with JDK
FROM --platform=linux/arm64 openjdk:21-jdk-slim

WORKDIR /app

COPY --from=maven-builder /app/target/*.jar app.jar

ENV JAVA_TOOL_OPTIONS="-Xmx1024m -Xms512m"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]