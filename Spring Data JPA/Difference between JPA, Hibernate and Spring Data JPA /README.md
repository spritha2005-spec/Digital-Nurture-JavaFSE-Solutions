# Difference between JPA, Hibernate and Spring Data JPA

This exercise explains the relationship and differences between JPA, Hibernate, and Spring Data JPA.

## Java Persistence API (JPA)
- JPA is a Java specification for Object Relational Mapping (ORM).
- It defines standard APIs for persisting and retrieving data from relational databases.
- JPA itself does not provide an implementation.
- Hibernate is one of the most widely used implementations of JPA.

## Hibernate
- Hibernate is an ORM framework that implements the JPA specification.
- It provides features such as object mapping, session management, transaction management, caching, and query support.
- Developers write more boilerplate code to manage sessions and transactions.

## Spring Data JPA
- Spring Data JPA is built on top of JPA and Hibernate.
- It reduces boilerplate code by providing repository interfaces such as `JpaRepository`.
- It automatically handles common CRUD operations and transaction management.
- It simplifies database access and improves developer productivity.

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|--------|-----|-----------|-----------------|
| Type | Specification | JPA Implementation | Abstraction over JPA |
| Provides Implementation | No | Yes | No |
| Boilerplate Code | High | Moderate | Very Low |
| Transaction Management | Manual | Manual | Automatic with Spring |
| CRUD Support | Basic | Complete | Simplified using JpaRepository |

## Conclusion

JPA defines the standard, Hibernate implements the standard, and Spring Data JPA simplifies development by reducing boilerplate code while using JPA implementations such as Hibernate.
