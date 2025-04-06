# 🏟️ MatchTracker

**MatchTracker** is a web application designed to record, manage, and display sports match results.  
This project was developed as a university assignment at Óbuda University.

---

## 📌 Features

- Create, read, update, and delete match records
- List and filter matches
- Display match data with Thymeleaf templates
- Fetch match data from external API using **Retrofit 2**
- Version-controlled database schema with **Liquibase**
- Dockerized PostgreSQL and backend for seamless deployment

---

## ⚙️ Tech Stack

| Layer         | Technology                        |
|---------------|------------------------------------|
| Backend       | Java 17, Spring Boot               |
| Frontend      | Thymeleaf                         |
| Database      | PostgreSQL                        |
| ORM           | Spring Data JPA                   |
| API Client    | Retrofit 2 + Jackson converter     |
| DB Migration  | Liquibase                         |
| Deployment    | Docker                            |

---

## 🔗 External API

Match data is also imported from an external REST API:  
`https://external.api.com/matches`  
This is handled using **Retrofit 2**, configured as a Spring Bean.

---

## 🧪 Running the Project

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/matchtracker.git
cd matchtracker
