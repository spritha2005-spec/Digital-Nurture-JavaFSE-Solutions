# 4.Git Merge Conflict Resolution Hands-on Lab (Git-HOL)

## Objective

- Understand how merge conflicts occur in Git.
- Learn how to resolve merge conflicts manually.
- Practice merging branches and updating `.gitignore`.

## Prerequisites

- Git installed and configured
- Git Bash
- Notepad++ configured as the default Git editor
- Existing Git repository
- Basic knowledge of Git branching and merging

## Hands-on Tasks

### 1. Verify Repository Status

```bash
git status
```

Ensured the working tree was clean before starting.

### 2. Create a New Branch

```bash
git branch GitWork
git checkout GitWork
```

### 3. Create `hello.xml` in GitWork Branch

Created:

```
Git/4.Git-HOL/hello.xml
```

Content:

```xml
<message>Hello from GitWork branch</message>
```

Updated the file:

```xml
<message>Hello from GitWork branch - Updated</message>
```

### 4. Commit Changes

```bash
git add Git/4.Git-HOL/hello.xml
git commit
```

### 5. Switch to Main Branch

```bash
git checkout main
```

### 6. Create the Same File with Different Content

Created:

```xml
<message>Hello from Main branch</message>
```

Committed the changes.

### 7. View Commit History

```bash
git log --oneline --graph --decorate --all
```

### 8. Compare Branches

```bash
git diff main GitWork
```

### 9. Merge the Branch

```bash
git merge GitWork
```

Git reported a merge conflict because both branches modified the same file.

### 10. Resolve the Conflict

The conflicted file contained Git conflict markers.

Resolved by replacing the contents with:

```xml
<message>Hello from Main branch</message>
<message>Hello from GitWork branch</message>
```

Then staged and committed the resolved file.

### 11. Verify Repository Status

```bash
git status
```

### 12. Ignore Backup Files

Created a backup file:

```
hello.xml.bak
```

Created/updated `.gitignore`:

```gitignore
*.bak
```

Committed the `.gitignore` changes.

### 13. List Branches

```bash
git branch
```

### 14. Delete the Merged Branch

```bash
git branch -d GitWork
```

### 15. View Final Commit History

```bash
git log --oneline --graph --decorate
```

## Project Structure

```
4.Git-HOL
├── README.md
├── .gitignore
└── hello.xml
```

Ignored files:

```
hello.xml.bak
```

## Git Commands Used

- `git status`
- `git branch`
- `git checkout`
- `git add`
- `git commit`
- `git diff`
- `git merge`
- `git log --oneline --graph --decorate --all`
- `git branch -d`

## Outcome

Successfully:

- Created and switched between branches.
- Modified the same file in different branches.
- Generated a merge conflict.
- Resolved the merge conflict manually.
- Updated `.gitignore` to ignore backup files.
- Deleted the merged branch.
- Verified the commit history after merging.
