# CRUD-Spring-Boot

## Description

This project is a Spring Boot application demonstrating basic CRUD (Create, Read, Delete) operations. It provides a simple interface to interact with a database using Spring Data JPA and Hibernate.

## Features

- **Create**: Add new records to the database.
- **Read**: Retrieve records from the database.
- **Delete**: Remove records from the database.

## Prerequisites

- JDK 11 or later
- Maven
- An IDE like IntelliJ IDEA or Eclipse (optional)

## Getting Started

1. **Clone the repository:**

    ```bash
    git clone https://github.com/MarwanMohamed01/CRUD-Spring-Boot.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd CRUD-Spring-Boot
    ```

3. **Build the project:**

    ```bash
    mvn clean install
    ```

4. **Run the application:**

    ```bash
    mvn spring-boot:run
    ```

## Testing with Postman

You can use Postman to test the CRUD operations. Here are the endpoints to use:

- **Create**: `POST http://localhost:8080/api/employees`
    - Body: JSON object with the necessary fields.

- **Read**: `GET http://localhost:8080/api/employees`
    - No body required.

- **Delete**: `DELETE http://localhost:8080/api/employees/{id}`
    - Replace `{id}` with the ID of the record you want to delete.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- PostgreSQL



