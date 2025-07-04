# Contributing to EventHive

Thank you for your interest in contributing to Open Graph Visualizer! This document provides guidelines and information for contributors.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [How to Contribute](#how-to-contribute)
- [Pull Request Process](#pull-request-process)
- [Coding Standards](#coding-standards)
- [Testing](#testing)
- [Documentation](#documentation)

## 📜 Code of Conduct

This project and everyone participating in it is governed by our Code of Conduct. By participating, you are expected to uphold this code.

## 🚀 Getting Started

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/Swapnil-Dhamal/EventHive.git
   cd EventHive
   ```
3. **Add the original repository** as upstream:
   ```bash
   git remote add upstream https://github.com/Swapnil-Dhamal/EventHive.git
   ```

## 🛠️ Development Setup

1. **Install frontend dependencies**:

   ```bash
   cd frontend
   npm install
   ```

2. **Configure backend environment**:

   * Navigate to the backend directory:

     ```bash
     cd ../backend
     ```
   * Open or create the `src/main/resources/application.properties` file and add your DB config:

     **For PostgreSQL:**

     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/eventhive
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
     ```


3. **Run the backend (Spring Boot)**:

   ```bash
   ./mvnw spring-boot:run
   ```

4. **Run the frontend (React)**:
   Open a new terminal window:

   ```bash
   cd frontend
   npm start
   ```
---


## 🤝 How to Contribute

### Reporting Bugs

Before creating bug reports, please search existing issues to avoid duplicates. When creating a bug report, include:

- **Use a clear and descriptive title**
- **Describe the exact steps to reproduce the problem**
- **Provide specific examples** with sample URLs if applicable
- **Describe the behavior you observed** vs. what you expected
- **Include screenshots** if helpful
- **Environment details** (OS, browser, Java version)

### Suggesting Enhancements

Enhancement suggestions are tracked as GitHub issues. When creating an enhancement suggestion:

- **Use a clear and descriptive title**
- **Provide a detailed description** of the suggested enhancement
- **Explain why this enhancement would be useful**
- **List some other applications where this enhancement exists**, if applicable

### Types of Contributions We're Looking For

- 🐛 **Bug fixes**
- ✨ **New features** (please discuss in issues first)
- 📝 **Documentation improvements**
- 🎨 **UI/UX enhancements**
- ⚡ **Performance optimizations**
- 🧪 **Test coverage improvements**
- 🌐 **New social platform support**

## 📝 Pull Request Process

1. **Create a feature branch**:
   ```bash
   git checkout -b feature/your-feature-name
   ```

2. **Make your changes** following our coding standards

3. **Lint your changes and perform manual tests**:
   ```bash
   For frontend:
   npm run lint
   For backend:
   run unit tests or test endpoints using Postman.
   ```

4. **Commit your changes**:
   ```bash
   git commit -m "feat: add amazing new feature"
   ```
   
   Follow [Conventional Commits](https://www.conventionalcommits.org/):
   - `feat:` for new features
   - `fix:` for bug fixes
   - `docs:` for documentation
   - `style:` for formatting changes
   - `refactor:` for code refactoring
   - `test:` for adding tests
   - `chore:` for maintenance

5. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Create a Pull Request** on GitHub

### Pull Request Requirements

- **Fill out the PR template** completely
- **Link to related issues** using keywords (fixes #123)
- **Include tests** for new functionality (suggest manual test procedure)
- **Update documentation** if needed
- **Ensure all checks pass** (tests, linting, etc.)
- **Keep PRs focused** on a single feature/fix

## 💻 Coding Standards

### General Guidelines

- **Follow TypeScript best practices**
- **Use meaningful variable and function names**
- **Keep functions small and focused**
- **Build dynamic systems, try to avoid rigid code unless deemed necessary**
- **Comment complex logic**
- **Follow existing code style**

### Frontend (React)

- **Use functional components** with hooks
- **Follow React best practices**
- **Use meaningful variable and function names** 
- **Keep components focused** on single responsibilities
- **Use Tailwind CSS** for styling consistently
- **Follow shadcn/ui patterns** for components

### Backend (Express)

- **Use Java with Spring Boot standards** throughout
- **Follow RESTful API conventions**
- **Implement proper error handling**
- **Structure packages meaningfully (controller, service, repository)** over promises
- **Validate input data**
- **Follow security best practices**

### Code Formatting

We use Prettier and ESLint. Run before committing:

```bash
npm run format
npm run lint

For the backend, follow the IntelliJ/Java formatting guidelines
```



## 📖 Documentation

- **Update README.md** for new features
- **Add JSDoc comments** for functions and classes
- **Update API documentation** for backend changes
- **Include examples** in documentation
- **Keep docs up to date** with code changes

## 🏷️ Issue and PR Labels

We use labels to organize issues and PRs:

- `bug` - Something isn't working
- `enhancement` - New feature or request
- `documentation` - Improvements or additions to docs
- `good first issue` - Good for newcomers
- `help wanted` - Extra attention is needed
- `question` - Further information is requested

## 🚦 Development Workflow

1. **Check for existing issues** before starting work
2. **Create an issue** for major changes
3. **Discuss your approach** in the issue
4. **Create a PR** when ready
5. **Respond to feedback** promptly
6. **Squash commits** if requested

## 💡 Tips for New Contributors

- **Start small** - look for "good first issue" labels
- **Ask questions** - we're here to help!
- **Read the codebase** - understand the architecture
- **Test thoroughly** - both happy and error paths
- **Be patient** - reviews take time

## 🆘 Getting Help

- **GitHub Discussions** - for questions and general discussion
- **GitHub Issues** - for bugs and feature requests
- **Discord/Slack** - if available for real-time chat

Thank you for contributing to EventHive! 🎉