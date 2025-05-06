# Stage 1: Build with Maven (Base image will adapt depending on the platform)
FROM maven:3.9.9-eclipse-temurin-21-alpine AS maven-builder

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Stage 2: Use the correct JRE based on platform (Docker Buildx will handle platform)
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

COPY --from=maven-builder /app/target/*.jar app.jar

ENV JAVA_TOOL_OPTIONS="-Xmx1024m -Xms512m"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]