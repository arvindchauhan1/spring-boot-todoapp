# Todo Application

A simple and intuitive **Todo Application** built using **Spring Boot**, **Thymeleaf**, **Tailwind CSS**, and **MySQL**.

## Features
- Add new tasks with an easy-to-use form.
- View tasks dynamically rendered with Thymeleaf.
- Toggle task completion status.
- Delete tasks with a confirmation modal.
- Responsive design using Tailwind CSS.

## Tech Stack
- **Backend**: Spring Boot (Java 17, Thymeleaf, Maven)
- **Frontend**: Thymeleaf, Tailwind CSS, JavaScript
- **Database**: MySQL
- **Build Tool**: Maven

## Installation
1. **Clone the repository**
   ```bash
   git clone https://github.com/arvindchauhan1/spring-boot-todoapp
   cd todo-application
   ```

2. **Set up the MySQL Database**
   - Create a new database and configure the connection in `src/main/resources/application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
     spring.datasource.username=root
     spring.datasource.password=<your_password>
     ```

3. **Build and run the project**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the app**
   Open [http://localhost:8080](http://localhost:8080) in your browser.

### Thank You
- **Arvind Chauhan**  
  [LinkedIn](https://linkedin.com/in/arvindchauhan1) | [GitHub](https://github.com/arvindchauhan1)