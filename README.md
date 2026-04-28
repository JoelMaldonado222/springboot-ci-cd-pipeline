# Midterm Demo: IntelliJ → GitHub → Maven/JUnit → Jenkins → Docker

A minimal Spring Boot 3 app demonstrating a full CI/CD workflow.

## 🚀 Live Demo
👉 https://springboot-ci-cd-pipeline-production.up.railway.app/hello

## Tech Stack
- Java 17 / Spring Boot 3
- Maven + JUnit (build & test)
- Jenkins (CI pipeline)
- Docker (containerization)
- Railway (cloud deployment)

## Pipeline Stages
1. Checkout code from GitHub
2. Build & test with `mvn verify`
3. Docker image build
4. Smoke test (`curl /hello`)
5. Deploy to Railway

## Run Locally
```bash
mvn clean verify
mvn spring-boot:run
```
Then visit: http://localhost:8080/hello

## Run with Docker
```bash
docker build -t midterm-demo .
docker run -d --name midterm-demo -p 8080:8080 midterm-demo
```
