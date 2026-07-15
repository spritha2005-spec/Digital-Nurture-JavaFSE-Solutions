# Git Ignore Hands-on Lab (GitIgnore-HOL)

## Objective

- Understand the purpose of the `.gitignore` file.
- Learn how to ignore unwanted files and folders in a Git repository.

## Prerequisites

- Git installed and configured
- Git Bash
- Notepad++ configured as the default Git editor
- Local Git repository
- Remote GitHub/GitLab repository

## Hands-on Tasks

### 1. Created a `.gitignore` file

Configured the `.gitignore` file to ignore log files and log folders.

```gitignore
*.log
logs/
```

### 2. Created Files and Folders

```
2.GitIgnore
├── .gitignore
├── sample.txt
├── error.log
└── logs
    └── app.log
```

### 3. Verified Git Ignore

Executed:

```bash
git status
```

Observed:

- `.gitignore` was tracked.
- `sample.txt` was tracked.
- `error.log` was ignored.
- `logs/` directory was ignored.

### 4. Added Tracked Files

```bash
git add Git/2.GitIgnore/
```

### 5. Committed Changes

```bash
git commit
```

Commit message:

```
Implemented .gitignore

Ignored .log files and logs folder.
Added sample.txt for tracking.
```

### 6. Pushed to Remote Repository

```bash
git push origin main
```

## Files Included

```
2.GitIgnore
├── README.md
├── .gitignore
└── sample.txt
```

## Files Ignored

- `error.log`
- `logs/`
- `logs/app.log`

## Git Commands Used

- `git status`
- `git add`
- `git commit`
- `git push`

## Outcome

Successfully implemented a `.gitignore` file to ignore all `.log` files and the `logs` directory while tracking only the required project files.
