# Employee-Management-System
A centralized platform to manage employee records (personal details, job titles, contact info). Simplifies HR tasks, reduces paperwork, and improves data accuracy. Supports onboarding, workforce tracking, and scalable HR operations for businesses. Built with Spring Boot, Angular, PostgreSQL, and Docker.
Tech Stack
Built with Spring Boot, Angular, PostgreSQL & Docker
Features
✅ Full CRUD Operations

Create, Read, Update, Delete employees

Pagination & Sorting 

✅ Responsive UI

Built with Angular Material

Mobile-friendly design

✅ Dockerized Deployment

Easy setup with docker-compose

Pre-configured PostgreSQL container

✅ REST API

JWT Authentication


Tech Stack
Layer	Technology
Frontend	Angular 16+
Backend	Spring Boot 3.x (Java 17)
Database	PostgreSQL
Container	Docker

employee-management/
├── backend/               # Spring Boot app
│   ├── src/               # Source code
│   ├── pom.xml            # Maven config
│   └── Dockerfile
│
├── frontend/              # Angular app
│   ├── src/               # Angular components
│   ├── package.json       # Node dependencies
│   └── Dockerfile
│
├── docker-compose.yml     # Multi-container setup
└── README.md              # This file

Prerequisites
Docker & Docker Compose

Java 17 (for local backend dev)

Node.js 18+ & Angular CLI (for local frontend dev)

PostgreSQL (or use Docker)

Installation
 Docker
docker-compose up --build  # Starts all services
Access:

Frontend: http://localhost:4200

Backend: http://localhost:8080

Database: postgresql://localhost:5432

API Documentation
Endpoint	Method	Description
/api/employees	GET	Get all employees
/api/employees	POST	Add new employee
/api/employees/{id}	GET	Get employee by ID
/api/employees/{id}	PUT	Update employee
/api/employees/{id}	DELETE	Delete employee