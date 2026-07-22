# Angular Hands-on 1 – Environment Setup, Project Structure & First Component

## Objective

This hands-on focuses on setting up the Angular development environment, understanding the Angular project structure, and creating the first components for the Student Course Portal application.

## Topics Covered

- Angular CLI Installation
- Angular Workspace Setup
- Angular Project Structure
- Running Angular Applications
- Building Angular Applications
- Creating Components
- Standalone Components
- Angular Configuration Files

## Project Structure

```
student-course-portal/
├── src/
│   ├── app/
│   │   ├── components/
│   │   │   └── header/
│   │   ├── pages/
│   │   │   ├── home/
│   │   │   ├── course-list/
│   │   │   └── student-profile/
│   │   ├── app.ts
│   │   ├── app.html
│   │   └── app.config.ts
│   ├── index.html
│   └── main.ts
├── angular.json
├── package.json
├── tsconfig.json
├── notes.txt
└── README.md
```

## Tasks Completed

### Task 1 – Project Setup

- Installed Angular CLI
- Created Angular project using Angular CLI
- Explored Angular project structure
- Documented important Angular configuration files in `notes.txt`
- Ran the application using `ng serve`
- Built the application using `ng build`
- Examined the generated `dist` folder
- Studied Angular build budgets (`maximumWarning` and `maximumError`)

### Task 2 – Component Creation

Created the following components:

- Header Component
- Home Component
- Course List Component
- Student Profile Component

Implemented:

- Navigation bar with portal name
- Welcome page
- Student portal description
- Dashboard statistics
  - Courses Available: 12
  - Enrolled: 3
  - GPA: 3.8

## Technologies Used

- Angular 20
- TypeScript
- HTML
- CSS
- Angular CLI

## How to Run

Install dependencies:

```bash
npm install
```

Run the application:

```bash
ng serve
```

Open your browser and visit:

```
http://localhost:4200
```

## Build the Project

```bash
ng build
```

The production build is generated inside the `dist/` folder.

## Expected Output

- Student Course Portal header
- Navigation links
- Welcome message
- Student portal description
- Dashboard statistics showing:
  - Courses Available
  - Enrolled
  - GPA

## Learning Outcome

After completing this hands-on, you will understand:

- Angular project creation
- Angular folder structure
- Standalone component architecture
- Angular CLI commands
- Component generation
- Running and building Angular applications
- Basic UI development using Angular components
