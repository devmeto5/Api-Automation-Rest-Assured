# API Automation with Rest Assured

This project is a simple demonstration of API automation testing using Java and Rest Assured. It includes basic examples of testing different HTTP methods (GET, POST, PUT, DELETE) with the JSONPlaceholder API. The tests are written using JUnit 5 to verify the functionality of various endpoints.

## Prerequisites

- Java SDK (version 11 or higher)
- Apache Maven (version 3.6 or higher)
- Internet connection (to download dependencies)

## Getting Started

Follow the steps below to set up and run the project locally

### 1. Clone the Repository

```sh
https://github.com/YOUR_USERNAME/Api-Automation-Rest-Assured.git
cd Api-Automation-Rest-Assured
```

### 2. Install Dependencies

Ensure that all the dependencies are downloaded by running the following Maven command:

```sh
mvn install
```

This command will download the required libraries and dependencies specified in the `pom.xml` file, including Rest Assured and JUnit.

### 3. Running the Tests

To execute the test cases, use the following command:

```sh
mvn test
```

After running the command, Maven will compile and execute the tests included in `APITest.java`. You should see results in the terminal showing the status of each test.

## Project Structure

- **src/test/java**: Contains the `APITest.java` file with the test cases.
- **pom.xml**: The Maven configuration file which manages dependencies for the project.

### Example Tests

The `APITest` class includes several examples of API tests:

1. **GET Request**: Tests fetching a list of posts.
2. **POST Request**: Tests creating a new post.
3. **PUT Request**: Tests updating an existing post.
4. **DELETE Request**: Tests deleting a post.

These tests use JSONPlaceholder (https://jsonplaceholder.typicode.com) as a mock API for demonstration purposes.

## Dependencies

- **Rest Assured**: Version 5.3.0 - A Java library for testing REST APIs.
- **JUnit 5**: Version 5.9.1 - For unit testing the API endpoints.

## Setting Up Java and Maven

Make sure Java and Maven are correctly installed:

1. Install Java SDK (e.g., OpenJDK 11) from [AdoptOpenJDK](https://adoptopenjdk.net/).
2. Install Apache Maven from [Apache Maven Download](https://maven.apache.org/download.cgi).
3. Add both Java and Maven to your system's PATH to run commands from the terminal.

## Customizing Tests

Feel free to modify the API endpoints or request data in the `APITest.java` file to suit your testing needs. You can also add more tests for other scenarios, such as validation of response headers, performance testing, etc.

## License

This project is licensed under the MIT License. You can freely use and modify it.


