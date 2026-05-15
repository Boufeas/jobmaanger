# Job Manager API

A simple backend REST API built with Spring Boot for managing users and job postings.  
The project demonstrates a layered architecture using Controller, Service, and Repository layers, along with PostgreSQL 
for persistence.

---

## 🚀 Features

- User management (create, list users)
- Job management (create, list jobs)
- Relational database structure using JPA/Hibernate
- Clean layered architecture (Controller → Service → Repository)
- PostgreSQL integration
- RESTful API design

---

## 🏗️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Lombok

---

## 📦 Project Structure

com.example.demo
│
├── controller
│ ├── UserController
│ └── JobController
│
├── service
│ ├── UserService
│ └── JobService
│
├── repository
│ ├── UserRepository
│ └── JobRepository
│
├── entity
│ ├── User
│ ├── Job
│ ├── Category
│ └── Status
│
└── DemoApplication

---

## 🗄️ Database Design

### User
- id
- name
- email
- password
- One-to-Many → Jobs

### Job
- id
- title
- Many-to-One → User
- Many-to-One → Category
- Many-to-One → Status

### Category
- id
- name
- One-to-Many → Jobs

### Status
- id
- name
- One-to-Many → Jobs

---

## 📡 API Endpoints

### Users

- GET `/users` → Get all users
- POST `/users` → Create a new user

### Jobs

- GET `/jobs` → Get all jobs
- POST `/jobs` → Create a new job

---

## ⚙️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/jobmanager.git