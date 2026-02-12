📚 Library Management System (Servlet + JDBC)

A web-based Library Management System developed using Java Servlets, JDBC, and DAO architecture.
The application allows administrators to manage books and authors with database-backed storage and server-side processing.

✨ Features

Add and view books and authors

Database-driven storage (no localStorage)

Servlet-based request handling

DAO pattern for database operations

Layered architecture (Bean → DAO → Service → Servlet)

Server-side validation and processing

🏗 Architecture
Servlet Layer → Service Layer → DAO Layer → Database

📂 Project Structure
src/main/java
 ├── com.kce.book.bean
 │     ├── AuthorBean.java
 │     └── BookBean.java
 │
 ├── com.kce.book.DAO
 │     ├── AuthorDAO.java
 │     └── BookDAO.java
 │
 ├── com.kce.book.service
 │     └── Administrator.java
 │
 ├── com.kce.book.servlets
 │     ├── MainServlet.java
 │     └── ViewServlet.java
 │
 └── com.kce.book.util
       └── DBUtil.java

🛠 Technologies Used

Java Servlets

JDBC

JSP/HTML (frontend pages)

Apache Tomcat

Oracle / MySQL (via DBUtil)

DAO Pattern

⚙️ Requirements

Java JDK 11+

Apache Tomcat 9+

Eclipse / IntelliJ

Database setup

JDBC driver added to project

<img width="767" height="780" alt="image" src="https://github.com/user-attachments/assets/1710d315-a23d-464f-be0f-76fe0d147bde" />

<img width="758" height="103" alt="image" src="https://github.com/user-attachments/assets/9622f51e-5ce9-4e15-8b99-739332d484dc" />

<img width="775" height="761" alt="image" src="https://github.com/user-attachments/assets/eedc929e-c0ef-41df-b0ad-3aa996c713ba" />


