Vaccine Management Backend
Project Overview
This is a backend service for managing vaccine-related data, built with Java 21 and Spring Boot. It provides APIs for managing vaccine inventory, distribution, and administration records.
Features

CRUD operations for vaccine records
Inventory tracking and management
User authentication and authorization
RESTful API endpoints
Database integration with JPA/Hibernate
Input validation and error handling

Technologies Used

Java: 21
Spring Boot: 3.x
Spring Data JPA: For database operations
Spring Security: For authentication and authorization
Maven: Dependency management
MySQL Database: For development
Lombok: To reduce boilerplate code
Swagger/OpenAPI: For API documentation

Prerequisites

Java 21 (JDK installed)
Maven (for dependency management)
IDE (e.g., IntelliJ IDEA, Eclipse)
Optional: Docker (if using containerized databases)

Setup Instructions

Clone the Repository:
git clone https://github.com/your-repo/vaccine-management-backend.git
cd vaccine-management-backend

Build the Project:
mvn clean install

Run the Application:
mvn spring-boot:run

The application will start on http://localhost:8080.

Running Tests
Run unit and integration tests with:
mvn test

Deployment

Package the application:mvn package

Deploy the generated .jar file to your server or cloud platform.
Alternatively, use Docker for containerized deployment:docker build -t vaccine-management-backend .
docker run -p 8080:8080 vaccine-management-backend

Contributing

Fork the repository.
Create a feature branch (git checkout -b feature-name).
Commit your changes (git commit -m "Add feature").
Push to the branch (git push origin feature-name).
Open a pull request.

Front-end:
Link: https://github.com/devtino2605/vaccine_manage_frontend.git

License
This project is licensed under the MIT License. See the LICENSE file for details.
Contact
For issues or inquiries, please open an issue on the repository or contact [hoaicalm@gmail.com].
