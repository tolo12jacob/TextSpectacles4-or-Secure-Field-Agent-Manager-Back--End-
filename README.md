A secure web application managing objects or agents in this case, storing them in a database and retreiving that information in different ways and aspects.
2 roles for this application, admin and tutor
Admin - username - admin
Admin - password - 123
Tutor - username - Toya
Tutor - password - 123

# Field Agent Management System

A web-based **Field Agent Management System** developed using **Java EE (JSP, Servlets, JPA, EJB)**. The application enables users to register field agents, search records using different criteria, and manage agent information through a simple and user-friendly interface.

---

## Features

* Register new field agents
* Display all registered agents
* Search agents by gender
* Display married agents by gender
* Display the oldest registered field agent
* Secure login using Java EE Form Authentication
* Role-based access control
* Responsive and modern user interface
* Shared CSS styling across all pages

---

## Technologies Used

### Backend

* Java EE
* JSP (JavaServer Pages)
* Servlets
* Enterprise JavaBeans (EJB)
* Java Persistence API (JPA)

### Database

* Java DB (Apache Derby)

### Frontend

* HTML5
* CSS3

### Server

* GlassFish Server

### IDE

* Apache NetBeans

---

## System Modules

### User Authentication

Users authenticate using Java EE's built-in security mechanism before accessing protected resources.

### Agent Registration

Allows administrators to register new field agents by capturing:

* Agent ID
* Full Name
* Age
* Gender
* Date of Birth
* Marital Status

### Agent Management

Users can:

* View all registered agents
* Search agents by gender
* View married agents filtered by gender
* Display the oldest registered agent

---

## Project Structure


FieldAgentManagementSystem
│
├── HTML Pages
├── JSP Pages
├── Servlets
├── Enterprise Beans
├── Entity Classes
├── Persistence Layer
├── CSS
└── Database



---

## Learning Outcomes

This project demonstrates practical knowledge of:

* Java EE web application development
* MVC architecture
* Form handling
* Session-based authentication
* Database persistence using JPA
* Enterprise Beans (EJB)
* JSP scripting
* CRUD operations
* Responsive interface design




## Future Improvements

* Edit existing agent records
* Delete agents
* Pagination for large datasets
* Search by multiple filters
* Dashboard statistics
* Export records to PDF or Excel
* Improved date formatting
* Enhanced user roles and permissions

---

## Author

**Jacobs Tolo**

Diploma in Computer Science (Internet Programming)

---

## Licence

This project was developed for educational purposes.
