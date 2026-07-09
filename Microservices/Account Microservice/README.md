# Account Microservice

## Objective

Develop a Spring Boot microservice to retrieve account details based on the account number.

## Endpoint

- **Method:** GET
- **URL:** `/accounts/{number}`

## Sample Response

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven
