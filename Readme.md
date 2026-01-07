# EasyQ – AI Question & Answer Backend Service

A Spring Boot backend application that demonstrates how AI capabilities can be integrated into a backend system using clean architecture and best practices.

This project implements a **Question & Answer (Q&A) service** with a mock AI provider, designed to be easily replaceable with real AI services such as OpenAI.

---

## 🚀 Features

- RESTful Q&A API
- Clean layered architecture
- DTO-based API contracts
- Input validation and global exception handling
- AI abstraction layer (mocked)
- Easy integration with real AI services

---

## 🛠 Tech Stack

- Java 21  
- Spring Boot  
- Spring Web  
- Jakarta Validation  
- Maven  

---

## 🏗 Architecture Overview

Controller → Service → AI Layer
↓
DTOs
↓
Exception Handling


### Layer Responsibilities

- **Controller**: Handles HTTP requests and responses
- **Service**: Business logic and orchestration
- **AI Layer**: AI abstraction (mock / real AI)
- **DTOs**: Request & response contracts
- **Exception Handling**: Centralized error management

---

## 🤖 AI Service

Currently, the application uses a **Mock AI Service** that simulates AI-generated answers.

The AI logic is abstracted behind an interface, making it easy to integrate real AI providers (e.g., OpenAI) in the future without changing controller or service code.

---

## 📡 API Endpoints

### Ask a Question

**POST**

/api/v1/qa/ask


#### Request Body
```json
{
  "question": "What is Spring Boot?"
}


Success Response (200 OK)

{
  "question": "What is Spring Boot?",
  "answer": "Spring Boot is a framework that simplifies building production-ready Spring applications with minimal configuration.",
  "source": "Mock-AI"
}


Validation Error Response (400 Bad Request)

{
  "status": 400,
  "message": "Question must not be empty",
  "timestamp": "2026-01-07T10:30:22"
}


⚙️ Setup & Run Instructions
Prerequisites

Java 21

Maven

VS Code (or any IDE)

Build & Run
mvn spring-boot:run


The application will start on:

http://localhost:8080