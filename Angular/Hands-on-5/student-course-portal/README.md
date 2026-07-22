# Angular Hands-on 5 – Reactive Forms, FormBuilder, FormArray & Custom Validators

## Objective

This hands-on demonstrates how to build a Reactive Form in Angular using FormBuilder, FormGroup, FormControl, FormArray, built-in validators, custom synchronous validators, and asynchronous validators. It also shows how to create dynamic form controls for enrolling in multiple courses.

---

## Topics Covered

- ReactiveFormsModule
- FormBuilder
- FormGroup
- FormControl
- FormArray
- Built-in Validators
- Custom Synchronous Validators
- Custom Asynchronous Validators
- Dynamic Form Controls
- Reactive Form Submission

---

## Features Implemented

### Task 1 – Reactive Form with FormBuilder

- Created **ReactiveEnrollmentFormComponent**
- Configured routing for `/enroll-reactive`
- Built the form using `FormBuilder`
- Added the following controls:
  - Student Name
  - Student Email
  - Course ID
  - Preferred Semester
  - Terms & Conditions
- Applied built-in validators:
  - `required`
  - `minLength`
  - `email`
  - `requiredTrue`
- Bound the form using `formGroup`
- Bound controls using `formControlName`
- Disabled the Submit button until the form becomes valid
- Logged:
  - `enrollForm.value`
  - `enrollForm.getRawValue()`

---

### Task 2 – Custom Validators & FormArray

#### Custom Synchronous Validator

Implemented **noCourseCode()** validator.

- Rejects course IDs beginning with **XX**
- Displays:

```
Course code starting with XX is not allowed.
```

---

#### Custom Async Validator

Implemented **simulateEmailCheck()**.

- Waits 800 ms
- If email contains **test@**
- Displays:

```
Email already taken.
```

---

#### Dynamic FormArray

Implemented **additionalCourses** using `FormArray`.

Features:

- Add Another Course button
- Dynamically creates new course input fields
- Remove button deletes selected course
- Supports multiple additional course entries

---

## Project Structure

```
src/
│
├── app/
│
├── pages/
│   └── reactive-enrollment-form/
│       ├── reactive-enrollment-form.ts
│       ├── reactive-enrollment-form.html
│       └── reactive-enrollment-form.css
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

## Concepts Learned

- Reactive Forms
- FormBuilder
- FormGroup
- FormControl
- FormArray
- Built-in Validators
- Custom Validators
- Async Validators
- Dynamic Form Controls
- Reactive Form Submission

---

## Difference Between `value` and `getRawValue()`

### `enrollForm.value`

- Returns only enabled form controls.
- Disabled controls are excluded.

### `enrollForm.getRawValue()`

- Returns all controls.
- Includes disabled controls.

---

## How to Run

```bash
npm install
ng serve
```

Open:

```
http://localhost:4200/enroll-reactive
```

---

## Expected Output

- Reactive Enrollment Form
- Built-in validation
- Custom course ID validation
- Async email validation
- Dynamic Additional Courses section
- Add/Remove Course functionality
- Disabled Submit button until form is valid
- Form values displayed in the browser console after submission

---

## Learning Outcomes

After completing this hands-on, you will understand:

- Building forms using Reactive Forms
- Using FormBuilder to simplify form creation
- Managing form controls with FormGroup and FormControl
- Creating dynamic controls with FormArray
- Implementing synchronous and asynchronous validators
- Handling form validation and submission in Angular
