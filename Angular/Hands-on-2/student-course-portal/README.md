# Angular Hands-on 2 – Data Binding, Lifecycle Hooks & Component Communication

## Objective

This hands-on demonstrates Angular's core component interaction features, including data binding, lifecycle hooks, and parent-child communication by developing a dynamic Student Course Portal.

## Topics Covered

- Property Binding
- Event Binding
- Two-Way Binding (`ngModel`)
- Lifecycle Hooks
  - `ngOnInit`
  - `ngOnChanges`
  - `ngOnDestroy`
- `@Input` Decorator
- `@Output` Decorator
- `EventEmitter`
- Parent-Child Component Communication

## Project Structure

```
student-course-portal/
├── src/
│   ├── app/
│   │   ├── components/
│   │   │   └── course-card/
│   │   ├── pages/
│   │   │   ├── home/
│   │   │   └── course-list/
│   │   ├── app.ts
│   │   ├── app.html
│   │   └── app.config.ts
│   └── ...
├── angular.json
├── package.json
└── README.md
```

## Features Implemented

### Task 1 – Data Binding

- Interpolation
- Property Binding
- Event Binding
- Two-Way Binding using `[(ngModel)]`

### Task 2 – Lifecycle Hooks

Implemented the following lifecycle hooks:

- `ngOnInit`
- `ngOnChanges`
- `ngOnDestroy`

### Task 3 – Component Communication

- Parent Component: `CourseListComponent`
- Child Component: `CourseCardComponent`
- Passed course data using `@Input`
- Sent enrollment events using `@Output` and `EventEmitter`

## Components

- Home Component
- Course List Component
- Course Card Component

## Technologies Used

- Angular 20
- TypeScript
- HTML
- CSS

## How to Run

```bash
npm install
ng serve
```

Open the application in your browser:

```
http://localhost:4200
```

## Expected Output

- Student Course Portal home page
- Search box using Two-Way Binding
- Dynamic course cards
- Lifecycle hook execution visible in browser console
- Parent-child communication using `@Input` and `@Output`
- Enrollment event updates selected course

## Learning Outcome

After completing this hands-on, you will understand:

- Angular data binding techniques
- Angular component lifecycle
- Parent-child communication
- Event handling using EventEmitter
- Building reusable Angular components
