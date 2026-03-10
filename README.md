# studentmvc

Spring Boot (MVC + Thymeleaf) Student Management System using Spring Data JPA with an in-memory H2 database.

## Prerequisites

- Java 17
- Maven

## Run

```bash
mvn spring-boot:run
```

Then open:

- `http://localhost:8080/` (app UI)
- `http://localhost:8080/h2-console` (H2 console)

Notes:

- The DB is in-memory (`jdbc:h2:mem:testdb`), so data resets when the app restarts.
- H2 console path is configured as `/h2-console` in `src/main/resources/application.properties`.

