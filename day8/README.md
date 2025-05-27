# 🏢 Employee Management System – Spring Boot REST API

A robust and extensible Spring Boot-based Employee Management System designed to handle organizational data efficiently. The application models real-world entities such as **Employees**, **Departments**, and **Projects**, and provides RESTful endpoints to manage them.

This version includes full functionality for managing **Departments**. Development is ongoing for Employees and Projects.

---

## 🎯 Objective

The goal of this project is to provide a scalable backend solution for employee-related operations within an organization, leveraging Spring Boot and Spring Data JPA. It serves as a foundation for HR, payroll, project allocation, and department-level operations.

---

## 🚀 Key Features (Implemented for Department Module)

* ✅ **Create Department** – Add new departments via HTTP POST.
* ✅ **View Department** – Fetch department details using ID.
* ✅ **View All Departments** – List all departments in the system.
* ✅ **Delete Department** – Remove a department by ID with validation.

---

## 🌐 REST API Endpoints – Department Module

| HTTP Method | Endpoint            | Description               | Response Status |
| ----------- | ------------------- | ------------------------- | --------------- |
| `POST`      | `/departments`      | Create a new department   | `201 Created`   |
| `GET`       | `/departments`      | Retrieve all departments  | `200 OK`        |
| `GET`       | `/departments/{id}` | Retrieve department by ID | `200 OK / 404`  |
| `DELETE`    | `/departments/{id}` | Delete department by ID   | `200 OK / 404`  |

---

## 📸 API Demonstrations

> Replace with your actual screenshots (e.g., Postman or Swagger UI)

### 📝 Create Department

![Create Department](screenshots/create-department.png)

### 📋 View All Departments

![View All Departments](screenshots/view-all-departments.png)

### 🔍 View Department by ID

![View By ID](screenshots/view-by-id.png)

### ❌ Delete Department

![Delete Department](screenshots/delete-department.png)

---

## 🔐 Error Handling

* Returns `404 Not Found` if department ID does not exist during GET or DELETE.
* Validation and error responses follow best practices for RESTful APIs.

---

## 🛠️ Technologies & Tools

* **Backend:** Java 17+, Spring Boot, Spring Web, Spring Data JPA
* **Database:** H2 (default, can be configured to MySQL/PostgreSQL)
* **Build Tool:** Maven
* **Testing:**  Postman

---

## 📌 Design Highlights

* **Modular Entity Design**: Easy to extend to include employees and project entities.
* **Clean REST API Principles**: Separation of concerns between controller, service, and repository layers (service layer to be added).
* **Robustness**: Null-checks and error-handling for better production readiness.

---

## 🛣️ Roadmap

| Milestone                 | Status         |
| ------------------------- | -------------- |
| Department CRUD APIs      | ✅ Completed    |
| Employee CRUD APIs        | 🔧 In Progress |
| Project CRUD APIs         | 🔧 In Progress |
| Service Layer Integration | 🔜 Upcoming    |
| Authentication & Roles    | 🔜 Planned     |
| Unit & Integration Tests  | 🔜 Planned     |

---

