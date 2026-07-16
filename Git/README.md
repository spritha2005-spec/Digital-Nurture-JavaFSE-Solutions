# Git Hands-on Labs

This directory contains all the Git hands-on exercises completed as part of the Cognizant Digital Nurture Java FSE program. These exercises cover Git installation, configuration, version control, branching, merging, conflict resolution, cleanup, and interaction with remote repositories.

---

## Exercise 1 - Git Configuration and Basic Commands

### Objective
- Configure Git on the local machine.
- Configure Notepad++ as the default Git editor.
- Create a local repository.
- Add, commit, and push files to a remote repository.

### Tasks Performed
- Installed Git.
- Configured Git username and email.
- Configured Notepad++ as the default editor.
- Created a local Git repository.
- Created `welcome.txt`.
- Added and committed the file.
- Connected the repository to GitHub/GitLab.
- Pushed the repository to the remote server.

### Commands Used

```bash
git --version
git config --global user.name
git config --global user.email
git init
git status
git add
git commit
git remote add origin
git push
git pull
```

---

## Exercise 2 - Git Ignore

### Objective
- Learn the purpose of `.gitignore`.
- Ignore unwanted files and folders.

### Tasks Performed
- Created `.gitignore`.
- Ignored `.log` files.
- Ignored the `logs` directory.
- Verified ignored files using `git status`.
- Added tracked files.
- Committed and pushed changes.

### .gitignore

```gitignore
*.log
logs/
```

### Commands Used

```bash
git status
git add
git commit
git push
```

---

## Exercise 3 - Branching and Merging

### Objective
- Understand Git branching.
- Merge a feature branch into the main branch.

### Tasks Performed
- Created a new branch.
- Switched between branches.
- Created and modified files.
- Committed branch changes.
- Compared branches.
- Merged the branch.
- Viewed commit history.
- Deleted the merged branch.

### Commands Used

```bash
git branch
git branch -a
git checkout
git add
git commit
git status
git diff
git merge
git log --oneline --graph --decorate
git branch -d
git push
```

---

## Exercise 4 - Merge Conflict Resolution

### Objective
- Understand merge conflicts.
- Resolve conflicts manually.

### Tasks Performed
- Created the `GitWork` branch.
- Created and modified `hello.xml`.
- Modified the same file in the main branch.
- Generated a merge conflict.
- Resolved the conflict manually.
- Added `.gitignore`.
- Ignored backup files.
- Deleted the merged branch.

### .gitignore

```gitignore
*.bak
```

### Commands Used

```bash
git status
git branch
git checkout
git add
git commit
git diff
git merge
git log --oneline --graph --decorate --all
git branch -d
git push
```

---

## Exercise 5 - Cleanup and Push to Remote Repository

### Objective
- Verify repository status.
- Synchronize the local repository with the remote repository.
- Push pending changes.

### Tasks Performed
- Verified repository status.
- Listed available branches.
- Pulled the latest changes from the remote repository.
- Pushed local commits to the remote repository.
- Verified successful synchronization.

### Commands Used

```bash
git status
git branch -a
git pull origin main
git push origin main
```

---

# Folder Structure

```
Git
├── README.md
├── 1.Git-HOL
│   ├── README.md
│   └── welcome.txt
├── 2.GitIgnore
│   ├── README.md
│   ├── .gitignore
│   └── sample.txt
├── 3.Git-HOL
│   ├── README.md
│   └── branch.txt
├── 4.Git-HOL
│   ├── README.md
│   ├── .gitignore
│   └── hello.xml
└── 5.Git-HOL
    └── README.md
```

---

# Git Concepts Covered

- Git Installation
- Git Configuration
- Local Repository Creation
- Git Status
- Git Add
- Git Commit
- Git Push
- Git Pull
- Git Ignore
- Branching
- Branch Switching
- Branch Comparison
- Branch Merging
- Merge Conflict Resolution
- Conflict Resolution using Git
- Cleanup and Remote Synchronization

---

# Outcome

Successfully completed all five Git hands-on exercises by learning Git configuration, repository management, version control, `.gitignore`, branching, merging, merge conflict resolution, cleanup, and synchronization with remote GitHub/GitLab repositories.
