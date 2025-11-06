# spring boot REST api
a simple RESTful API built with **Spring Boot**, **Spring Data JPA**, and **MySQL**, this project demonstrates basic **CRUD operations** and integration between a Spring Boot backend and a relational database.

---

## tech stack
- **spring boot**
- **spring data JPA**
- **mySql**
- **maven**
- **java 17+** (recommended: Java JDK 25)

---

## features
- create, read, update, delete operations (CRUD)
- RESTful endpoints using Spring Boot
- mySql database connectivity
- auto table creation using JPA (`spring.jpa.hibernate.ddl-auto=update`)

---

## how to run
1. clone the repository  

   ```bash
   git clone https://github.com/<your-username>/springboot-rest-api.git
2. configure your database in application.properties:<br>
spring.datasource.url = jdbc:mysql://localhost:3306/your_db_name<br>
spring.datasource.username = your_username<br>
spring.datasource.password = your_password<br>
spring.jpa.hibernate.ddl-auto = update<br>
3. run the project:<br>
mvn spring-boot:run<br>
4. access your API endpoints at:<br>
<http://localhost:8080>

---

## example endpoints
| method | endpoint              | description        |
| :----- | :-------------------- | :----------------- |
| GET    | `/api/products`       | Get all products   |
| GET    | `/api/products/{id}`  | Get products by ID |
| POST   | `/api/products`       | Add a new product  |
| PUT    | `/api/products/{id}`  | Update a product   |
| DELETE | `/api/products/{id}`  | Delete a product   |

---

## author

•𝗥𝗬ō𝗜𝗞𝗜 𝗧𝗘𝗡𝗞ā𝗜•<br>
aspiring Full Stack Dev.<br>
mail: <zeninmakisan2025@gmail.com><br>
linkedIn: <www.linkedin.com/in/jayanth-a-r-254232323>

---

## license

this project is open-source and available under the MIT License.
