# Blog Application

## Description
The Blog application allows users to publish various articles on different topics.

## Features
- Users can publish articles with titles, content, and categories.
- Users can view articles published by themselves and others.
- Articles can be categorized for easy navigation.
- Users can search for articles based on keywords or categories.

## Technologies
- Java programming language
- Spring Boot framework
- Spring MVC for handling web requests
- Thymeleaf for server-side HTML rendering
- MySQL database for storing articles and user data

## Installation
1. Clone the repository.
2. Configure the MySQL database connection in the `application.properties` file.
3. Run the command `mvn install` to install dependencies.

## Usage
1. After installing dependencies and configuring the database connection, start the application by running `mvn spring-boot:run`.
2. Access the application through your web browser at `http://localhost:8080`.

## Code Structure
- `org.garden.readerarticleretriever.ReaderArticleRetrieverFacade`: Facade class for retrieving articles by ID.

## Testing
- Unit tests should cover all functionalities of the application, including article retrieval and publication.
