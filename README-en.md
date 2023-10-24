**To Install Dependencies via Maven:**
1. Open a terminal or command prompt in the root of the project.
2. Enter the following command:
   ```
   mvn install
   ```
   This will download and install all the necessary dependencies for the project.

**To Run the Backend:**
1. Ensure that the dependencies have been successfully installed.
2. Enter the following command:
   ```
   mvn spring-boot:run
   ```
   This will start the backend server.

**Accessing the API Documentation:**
1. After the backend has started successfully, open a web browser.
2. Navigate to the following link:
   ```
   http://localhost:8080/swagger-ui.html
   ```
   This will open the Swagger interface, where you can explore the API documentation and test the endpoints.

**Accessing Tests:**
1. To access the project's tests, go to the following path in your project:
   ```
   src/test/java/com/example/mvchallenge/MvchallengeApplicationTests.java
   ```
   There, you will find unit and integration tests related to your application.
