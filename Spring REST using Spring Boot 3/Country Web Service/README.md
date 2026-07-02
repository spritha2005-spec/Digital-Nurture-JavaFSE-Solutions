# REST - Country Web Service

## Objective

Create a RESTful web service that returns the details of India by loading the Country bean from the Spring XML configuration.

## Endpoint

- **Method:** GET
- **URL:** http://localhost:8083/country

## Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

## Features

- REST Controller using `@RestController`
- Request mapping using `@RequestMapping`
- Loads Country bean from `country.xml`
- Automatically converts Java object to JSON using Jackson
- Tested using Browser and Postman

## Technologies Used

- Java 17
- Spring Boot
- Spring Core
- Spring Web
- Maven
