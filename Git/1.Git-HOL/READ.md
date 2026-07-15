
# 1.Git Hands-on Lab (Git-HOL)

## Objective
This hands-on demonstrates the basic Git workflow, including configuring Git, creating a local repository, tracking files, committing changes, and pushing the repository to a remote GitLab repository.

## Prerequisites
- Git for Windows
- Git Bash
- Notepad++
- GitHub account
- GitLab account

## Tasks Performed

### 1. Git Configuration
- Installed Git.
- Configured username and email.
- Configured Notepad++ as the default Git editor.

### 2. Create a Local Repository
```bash
mkdir GitDemo
cd GitDemo
git init
```

### 3. Create a File
```bash
echo "Welcome to Git" > welcome.txt
```

### 4. Verify File
```bash
ls
cat welcome.txt
git status
```

### 5. Stage the File
```bash
git add welcome.txt
```

### 6. Commit Changes
```bash
git commit
```

Commit message:
```
Initial commit

Added welcome.txt to the GitDemo repository.
```

### 7. Connect to Remote Repository
```bash
git remote add origin <repository-url>
```

### 8. Push to Remote Repository
```bash
git push -u origin master
```

## Repository Structure

```
1.Git-HOL
├── README.md
└── welcome.txt
```

## File Content

**welcome.txt**

```
Welcome to Git
```

## Commands Used

- git --version
- git config
- git init
- ls
- cat
- git status
- git add
- git commit
- git remote add
- git push
- git pull

## Outcome

Successfully:
- Configured Git.
- Created a local Git repository.
- Added and committed files.
- Connected to a remote repository.
- Pushed the project to GitLab.
- Organized the hands-on in the Digital-Nurture-JavaFSE-Solutions repository.
