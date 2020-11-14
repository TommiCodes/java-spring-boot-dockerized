# Multi Stage build

# Base Image and name stage as "builder"
FROM maven:3-openjdk-15 AS builder

# Create App Directory inside our container
WORKDIR /thomas/app/src/

# Copy files
COPY src ./
COPY pom.xml ../

RUN mvn -f /thomas/app/pom.xml clean package

#### 2nd Stage ####

FROM openjdk:15.0.1

WORKDIR /thomas/lib/

# Copy the Jar from the first Stage (builder) to the 2nd stage working directory
COPY --from=builder /thomas/app/target/spring-boot-dockerized-0.0.1-SNAPSHOT.jar ./sb-dockerized.jar

# Expose the port to the inner container communication network
EXPOSE 3100

# Run the Java Application
ENTRYPOINT [ "java","-jar","/thomas/lib/sb-dockerized.jar"]

