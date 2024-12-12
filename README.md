# Task Management System

## Features
- Task management with CRUD operations.
- JWT-based authentication.
- Role-based access control for Admin and Users.
- Pagination and filtering of tasks.

## Requirements
- Java 17+
- Maven
- Docker and Docker Compose

## How to Run
1. Build the project:
   ```
   mvn clean install
   ```
2. Start services:
   ```
   docker-compose up --build
   ```
3. Access the API at `http://localhost:8080`.

## API Documentation
Swagger UI is available at `http://localhost:8080/swagger-ui.html`.
