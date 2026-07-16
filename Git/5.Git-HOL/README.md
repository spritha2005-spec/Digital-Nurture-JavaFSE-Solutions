# Git Cleanup and Push to Remote Repository Hands-on Lab (Git-HOL)

## Objective

- Verify the repository is in a clean state.
- List all available branches.
- Pull the latest changes from the remote repository.
- Push local changes to the remote repository.
- Verify that the changes are reflected in the remote repository.

## Prerequisites

- Git installed and configured
- Git Bash
- Existing local Git repository
- Remote GitHub/GitLab repository

## Hands-on Tasks

### 1. Verify Repository Status

Checked whether the working directory was clean.

```bash
git status
```

### 2. List Available Branches

Displayed all local and remote branches.

```bash
git branch -a
```

### 3. Pull Latest Changes

Pulled the latest updates from the remote repository.

```bash
git pull origin main
```

> If the default branch is `master`, use:

```bash
git pull origin master
```

### 4. Push Local Changes

Pushed all committed local changes to the remote repository.

```bash
git push origin main
```

> If the default branch is `master`, use:

```bash
git push origin master
```

### 5. Verify Remote Repository

Refreshed the GitHub/GitLab repository and confirmed that all local changes were successfully reflected in the remote repository.

## Git Commands Used

- `git status`
- `git branch -a`
- `git pull`
- `git push`

## Outcome

Successfully:

- Verified the repository was in a clean state.
- Listed all available branches.
- Pulled the latest changes from the remote repository.
- Pushed local commits to the remote repository.
- Verified that the remote repository was updated successfully.
