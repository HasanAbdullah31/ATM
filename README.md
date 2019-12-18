# ATM Simulator

The ATM Simulator does exactly as its name implies - it emulates an ATM's "login" feature
(credentials being credit card number and PIN) and basic functionalities such as balance inquiry,
withdrawal, and transfer. The ATM Simulator is a web app created using Spring Boot and various Java
plugins (listed as dependencies in the Maven POM file).

**Responsibilities:**
- Created the front-end using JavaScript, HTML, and CSS
- Leveraged Thymeleaf to connect the front-end with the back-end
- Constructed and maintained the MySQL database
- Established database connectivity using JPA and Hibernate
- Implemented all functionalities including view and update balance requests
- Configured build environment and dependencies with Maven

**Environment:**
- Java, Spring Boot, Spring Web, Spring Security, MVC
- JavaScript, jQuery, HTML, CSS, Thymeleaf
- JPA, Hibernate
- MySQL, MySQL Java Connector
- Git, Maven, Spring Boot DevTools

**Run Locally:**
1. Install Java 8, MySQL 5.5+, and a Java IDE (this project used IntelliJ IDEA).
2. Configure MySQL with username `root` and password `admin123`. This project assumes that these are
the login credentials for MySQL. Alternatively, if you want to use different credentials, be sure to
change `spring.datasource.username` and `spring.datasource.password` in `src/main/resources/application.properties` as needed.
3. Start the MySQL server, and run the `atm.sql` script (located in this directory). The script
creates a database called `atm` with tables `users` and `accounts` prefilled with information.
4. In your IDE, build the project with Maven 3.3+, and then run
`src/main/java/com/ahs/Application.java`. This will start the web app.
5. Navigate to `http://localhost:8080/app/login` in your web browser. Card numbers can be found starting
from line 17 of the `atm.sql` file, and their associated PINs are in comments at the end of the respective
line. For example, card number `378282246310005` has PIN `123`.
6. That's it! Play around with the app, and see the changes updated in your MySQL database.
