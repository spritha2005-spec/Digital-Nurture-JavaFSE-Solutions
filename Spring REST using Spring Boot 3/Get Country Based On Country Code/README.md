# REST - Get Country Based on Country Code

## Objective

Create a RESTful web service that returns country details based on the country code. The search is case-insensitive.

## Endpoint

- **Method:** GET
- **URL:** http://localhost:8083/country/{code}

## Sample Requests

```
http://localhost:8083/country/in
http://localhost:8083/country/us
http://localhost:8083/country/de
http://localhost:8083/country/jp
```

## Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

## Features

- REST API using Spring Boot
- Uses `@GetMapping` with `@PathVariable`
- Country data loaded from `country.xml`
- Case-insensitive country code matching using `equalsIgnoreCase()`
- Returns JSON response automatically
- Tested using Browser and Postman

## Technologies Used

- Java 17
- Spring Boot
- Spring Core
- Spring Web
- Maven
