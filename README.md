# Employee Management REST API

A simple RESTful web service built with Spring Boot that manages employee records.

## Features
- GET /employees → retrieve all employees
- POST /employees → add a new employee
- In-memory employee storage
- REST API testing using JUnit and MockMvc

## Tech Stack
- Java 17
- Spring Boot
- Gradle
- JUnit
- MockMvc

## Example Request

POST /employees
{
  "employee_id": "E101",
  "first_name": "John",
  "last_name": "Doe",
  "email": "john@example.com",
  "title": "Developer"
}
