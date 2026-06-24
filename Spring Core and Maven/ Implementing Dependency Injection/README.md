# Exercise 2: Implementing Dependency Injection

## Scenario

In the library management application, dependencies between the BookService and BookRepository classes are managed using Spring's IoC Container and Dependency Injection.

## Objective

Implement Dependency Injection between BookService and BookRepository using Spring Framework.

## Steps Performed

1. Created the BookRepository class.
2. Created the BookService class with a setter method for BookRepository.
3. Configured beans in applicationContext.xml.
4. Wired the BookRepository bean into the BookService bean using setter injection.
5. Loaded the Spring Application Context in the main application.
6. Retrieved the BookService bean and verified dependency injection.

## Technologies Used

* Java
* Spring Framework
* Maven

## Output

Book Service Initialized

Book Repository Initialized

BUILD SUCCESS

## Result

Dependency Injection was successfully implemented using Spring IoC Container and verified through successful application execution.
