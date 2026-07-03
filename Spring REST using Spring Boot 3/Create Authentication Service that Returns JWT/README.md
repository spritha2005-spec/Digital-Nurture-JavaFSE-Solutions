# Create Authentication Service that Returns JWT

## Objective

Implement a RESTful authentication service that validates user credentials and returns a JSON Web Token (JWT).

## Endpoint

- **Method:** GET
- **URL:** http://localhost:8083/authenticate

## Authentication

- Type: Basic Authentication
- Username: `user`
- Password: `pwd`

## Sample Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

## Features

- Spring Security with Basic Authentication
- JWT token generation
- Authentication endpoint using `@GetMapping`
- Token generated after successful authentication
- Tested using Postman

## Technologies Used

- Java 17
- Spring Boot
- Spring Security
- JJWT
- Maven
