# Spring REST using Spring Boot 3

## Description
This project demonstrates the basics of developing RESTful web services using Spring Boot 3, including Spring Security and JWT-based authentication.

## Features
- Hello World REST API
- Load country details from Spring XML configuration
- Fetch country details using REST endpoints
- Retrieve country information by country code (case-insensitive)
- Basic Authentication using Spring Security
- JWT Authentication Service
- JWT Token Generation

## Technologies Used
- Java 21
- Spring Boot 3
- Spring Web
- Spring Security
- JSON Web Token (JJWT)
- Maven
- Eclipse IDE

## Endpoints
- GET /hello
- GET /country
- GET /country/{code}
- GET /authenticate

## Authentication
- Type: Basic Authentication
- Username: `user`
- Password: `pwd`

## Sample Responses

### Country Service

```json
{
  "code": "IN",
  "name": "India"
}
```

### Authentication Service

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```
