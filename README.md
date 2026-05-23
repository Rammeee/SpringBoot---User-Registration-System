# User Registration System

A simple Spring Boot learning project for user registration management.

## Project Structure

- `pom.xml` - Maven project configuration.
- `src/main/java/com/day3/` - Application source code.
- `src/test/java/com/day3/` - Unit tests.
- `target/` - Build output.

## Features

- User model and registration service.
- Custom exception handling for invalid user age.
- Simple application entrypoint in `App.java`.

## Build & Run

```bash
mvn clean package
mvn exec:java -Dexec.mainClass="com.day3.App"
```

## Notes

- `target/` is excluded from source control via `.gitignore`.
- Use a Java 17+ JDK and Maven to build the project.
