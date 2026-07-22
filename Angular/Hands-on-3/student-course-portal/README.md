# Angular Hands-on 3 – Directives & Pipes

## Objective

This hands-on demonstrates the implementation of Angular structural directives, attribute directives, custom directives, and custom pipes by enhancing the Student Course Portal application.

---

## Topics Covered

- Structural Directives
  - *ngIf
  - *ngFor
  - *ngSwitch
  - ng-template
  - trackBy

- Attribute Directives
  - ngClass
  - ngStyle

- Custom Directive
  - Highlight Directive

- Custom Pipe
  - CreditLabel Pipe

---

## Features Implemented

### Task 1 – Structural Directives

- Display loading message using **\*ngIf**
- Render course cards using **\*ngFor**
- Optimize rendering using **trackBy**
- Display course status using **\*ngSwitch**
- Show fallback message using **ng-template**

### Task 2 – Attribute Directives

- Dynamic CSS classes using **ngClass**
- Dynamic border styling using **ngStyle**
- Expand/Collapse course details
- Highlight enrolled and full-credit courses

### Task 3 – Custom Directive & Pipe

- Created **Highlight Directive**
- Highlight card on mouse hover
- Created **CreditLabel Pipe**
- Display credits as:
  - 1 Credit
  - 2 Credits
  - 3 Credits
  - No Credits

---

## Project Structure

```
student-course-portal
│
├── src
│   ├── app
│   │   ├── components
│   │   │   └── course-card
│   │   ├── directives
│   │   │   └── highlight
│   │   ├── pages
│   │   │   └── course-list
│   │   └── pipes
│   │       └── credit-label-pipe
│   └── ...
```

---

## Technologies Used

- Angular
- TypeScript
- HTML
- CSS

---

## How to Run

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
ng serve
```

Open the application in your browser:

```
http://localhost:4200
```

---

## Expected Output

- Student Course Portal homepage
- Loading indicator
- Course cards displayed dynamically
- Passed/Failed/Pending badges
- Hover highlight effect
- Expand/Collapse details
- Dynamic styling using ngClass and ngStyle
- Credits displayed using the custom CreditLabel pipe

---

## Learning Outcomes

After completing this hands-on, you will be able to:

- Use Angular structural directives
- Apply attribute directives
- Create custom directives
- Build custom pipes
- Improve UI with dynamic styling
- Optimize rendering using trackBy

---
