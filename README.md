# EventHive – Community Event & Hackathon Portal

A full-stack, open-source platform to **organize**, **manage**, and **participate** in community-driven tech events and hackathons. Built for developer communities, colleges, and tech clubs looking to simplify event workflows and boost engagement.

---

## 📌 Description

**EventHive** helps organizers create, update, and track events and sessions while enabling participants to register, attend sessions, and view leaderboards. It streamlines community coordination and replaces the scattered usage of forms, sheets, and email threads.

---

## 🚀 Features

* 👥 **User Roles**: Organizer and Participant access
* 🗕️ **Event Management**: Create/update events with posters, descriptions, and schedules
* 📋 **Registration**: Track participant registrations and export attendance
* 🧑‍🏫 **Sessions**: Add speaker sessions, live links, and resources
* 🏆 **Leaderboard Module**: Optional support for hackathons with dynamic scoring
* 📂 **Upload Materials**: Share session slides, videos, and resources
* 📝 **Certificate & Rewards**: Downloadable certificates (optional)
* 🔗 **Meet Integration**: Zoom/Google Meet support (add links per session)
* 📊 **Admin Dashboard**: View analytics, registered users, and event data

---

## 🛠️ Tech Stack

### 🎨 Frontend (React)

* React.js
* Tailwind CSS
* React Router
* Axios

### ⚙️ Backend (Spring Boot)

* Spring Boot (REST APIs)
* Spring Security (JWT-based auth)
* Lombok (optional)

### 📓 Database

* PostgreSQL 

---

## ⚙️ Prerequisites

* Node.js (v18+)
* Java 17+ (with Maven)
* PostgreSQL DB installed
* IDEs: VS Code (Frontend), IntelliJ/Eclipse (Backend)
* Git and GitHub account

---

## 🚦 Quick Start

### 🔧 Backend Setup

```bash
cd backend
# Add application.properties with DB config
mvn spring-boot:run
```

### 🌐 Frontend Setup

```bash
cd frontend
npm install
npm start
```

---

## 🧒‍⚖️ Project Structure

```
EventHive/
🔺── backend/
    🔺── src/main/java/com/eventhive/
        🔺── controller/
        🔺── service/
        🔺── model/
        🔺── repository/
        🔺── config/
    🔺── resources/
        └── application.properties
🔺── frontend/
    🔺── src/
        🔺── components/
        🔺── pages/
        🔺── services/
        └── App.js
🔺── README.md
🔺── LICENSE
```

---

## 👨‍💻 Development & Contribution

### 🛠 Setting Up Dev Environment

1. Fork this repo
2. Clone your fork locally

```bash
git clone https://github.com/your-username/EventHive.git
```

3. Create a branch

```bash
git checkout -b feature/your-feature
```

4. Make your changes and push

```bash
git add .
git commit -m "Added your feature"
git push origin feature/your-feature
```

5. Open a Pull Request (PR) on GitHub

---

### 🙌 Contribution Guidelines

* Follow clean code practices
* Document your PRs
* Check for open issues or request a feature
* Star the repo if you like it ⭐

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙏 Acknowledgements

* Open source communities that inspired this project
* Hackathons like SWoC, GSSoC, JWOC that promote open collaboration
* [React](https://reactjs.org/) and [Spring Boot](https://spring.io/projects/spring-boot) for the incredible developer experience

---

> Ready to make your events organized, accessible, and impactful? **Contribute to EventHive and build the future of tech communities.**
