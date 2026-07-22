# Angular Hands-on 4 – Template-Driven Forms & Validation

## Objective

This hands-on demonstrates how to build a Template-Driven Form in Angular using FormsModule. It includes two-way data binding, built-in validation, error handling, form submission, and form reset functionality.

---

## Topics Covered

- Template-Driven Forms
- FormsModule
- ngModel Two-Way Binding
- ngForm
- Built-in Validators
  - required
  - minlength
  - email
- Template Reference Variables
- Validation Error Messages
- Form Submission
- Form Reset
- Angular Form State Classes

---

## Features Implemented

### Task 1

- Created EnrollmentFormComponent
- Added routing for `/enroll`
- Student Enrollment Request form
- Student Name input
- Student Email input
- Course ID input
- Preferred Semester dropdown
- Terms & Conditions checkbox
- Two-way binding using `[(ngModel)]`
- Form submission using `ngSubmit`
- Submit button disabled when the form is invalid

---

### Task 2

Added built-in validations:

- Student Name
  - Required
  - Minimum length 3

- Student Email
  - Required
  - Valid email format

- Course ID
  - Required

- Terms & Conditions
  - Must be checked

Implemented:

- Validation error messages
- Red border for invalid controls
- Green border for valid controls
- Success message after successful submission
- Reset button using `resetForm()`

---

## Project Structure

```
src/
│
├── app/
│
├── pages/
│   └── enrollment-form/
│       ├── enrollment-form.ts
│       ├── enrollment-form.html
│       └── enrollment-form.css
│
├── app.routes.ts
│
└── app.ts
```

---

## Technologies Used

- Angular 20
- TypeScript
- HTML
- CSS

---

## How to Run

```bash
npm install
ng serve
```

Open:

```
http://localhost:4200/enroll
```

---

## Expected Output

- Student Enrollment Request form
- Real-time validation
- Contextual validation messages
- Disabled submit button until form becomes valid
- Success message after submission
- Reset button clears the form

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Template-Driven Forms
- FormsModule
- ngModel
- ngForm
- Angular Validation
- Built-in Validators
- Form State Classes
- Form Submission
- Form Reset
