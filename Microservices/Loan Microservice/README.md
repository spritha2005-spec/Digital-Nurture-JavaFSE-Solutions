# Loan Microservice

## Objective

Develop a Spring Boot microservice to retrieve loan details based on the loan number.

## Endpoint

- **Method:** GET
- **URL:** `http://localhost:8081/loans/H00987987972342`

## Sample Response

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven
