
# 3.Git Branching and Merging Hands-on Lab (Git-HOL)

## Objective

- Understand Git branching and merging.
- Learn how to create and switch branches.
- Commit changes in a branch.
- Compare branches.
- Merge a branch into the main branch.
- Delete a merged branch.

## Prerequisites

- Git installed and configured
- Git Bash
- Notepad++ configured as the default Git editor
- Local Git repository
- GitHub/GitLab repository

## Hands-on Tasks

### 1. Create a New Branch

```bash
git branch GitNewBranch
```

### 2. List Available Branches

```bash
git branch -a
```

The `*` symbol indicates the currently active branch.

### 3. Switch to the New Branch

```bash
git checkout GitNewBranch
```

### 4. Create a New File

Created:

```
Git/3.Git-HOL/branch.txt
```

Content:

```
This file was created in GitNewBranch.
```

### 5. Stage and Commit the Changes

```bash
git add Git/3.Git-HOL/branch.txt
git commit
```

Commit message:

```
Added branch.txt

Created branch.txt in GitNewBranch.
```

### 6. Verify Repository Status

```bash
git status
```

### 7. Switch Back to Main Branch

```bash
git checkout main
```

### 8. Compare Branches

```bash
git diff main GitNewBranch
```

### 9. Merge the Branch

```bash
git merge GitNewBranch
```

### 10. View Commit History

```bash
git log --oneline --graph --decorate
```

### 11. Delete the Branch

```bash
git branch -d GitNewBranch
```

### 12. Push Changes to Remote Repository

```bash
git push origin main
```

## Project Structure

```
3.Git-HOL
├── README.md
└── branch.txt
```

## Git Commands Used

- git branch
- git branch -a
- git checkout
- git add
- git commit
- git status
- git diff
- git merge
- git log --oneline --graph --decorate
- git branch -d
- git push

## Outcome

Successfully:
- Created a new Git branch.
- Switched between branches.
- Added and committed changes in a branch.
- Compared differences between branches.
- Merged the branch into the main branch.
- Viewed the commit history.
- Deleted the merged branch.
- Pushed the updated repository to GitHub.
