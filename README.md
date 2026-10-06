# Timesheet DevOps — v1 (Employee module + unit tests)

First iteration of the ESPRIT DevOps team project (2021). This repository holds the
**Employee module** of a timesheet management application, with **JUnit unit tests**
used as the quality gate of the CI pipeline.

➡️ The complete version with all modules, the Jenkins pipeline and the Docker image is in
[Timesheet_DevOps](https://github.com/rachedchakchouk/Timesheet_DevOps).

## Tech stack

- Java 8, Spring Boot 2.5, Spring Web, Spring Data JPA / Hibernate
- MySQL
- JSF / PrimeFaces + OCPsoft Rewrite (server-side views)
- Maven, JUnit 4, AssertJ

## What's inside

- **Entities**: `Entreprise`, `Departement`, `Employe`, `Contrat`, `Mission`, `MissionExterne`, `Timesheet`, `User`, `Role`
- **Employee service** (`IEmployeService` / `EmployeServiceImpl`): create, list, count, authenticate (email + password), delete
- **REST controller** (`EmployeRestController`) and **JSF controller** (`EmployeController`)
- **Unit tests** (`EmployeServiceImplTest`): add, list, count, authentication and delete, with timeouts

## Run

```bash
# MySQL running on localhost:3306
./mvnw test        # run the unit tests
./mvnw spring-boot:run
```

## Author

**Rached Chakchouk** — Full Stack Software Engineer (Java / Spring Boot / Angular)
[LinkedIn](https://www.linkedin.com/in/rached-chakchouk) · [Portfolio](https://rached-chakchouk.netlify.app)
