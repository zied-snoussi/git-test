<h1 align="center" style="color:red">Git Test</h1>

<div align="center">
  <img src="./GITHUB.jpeg" alt="Github" width="100%"/>
</div>

## Description

This repository serves as a testbed for learning and practicing Git and GitHub workflows.

## Table of Contents

- [Description](#description)
- [Table of Contents](#table-of-contents)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Using GitHub and Git](#using-github-and-git)
  - [How to Use GitHub](#how-to-use-github)
  - [Resolving Conflicts](#resolving-conflicts)

## Getting Started

To get started with this project, follow the steps below.

### Prerequisites

Ensure you have the following installed:

- Git
- Code editor of your choice

### Installation

1. Clone the repository:

```bash
git clone https://github.com/zied-snoussi/git-test.git
```

2. Navigate to the project directory:

```bash
cd git-test
```

## Usage

Instructions on how to use the project will be added here.

## Contributing

Contributions are welcome! Please refer to the [CONTRIBUTING.md](CONTRIBUTING.md) file for guidelines.

## License

This project is licensed under the [MIT License](LICENSE).

---

## Using GitHub and Git

### How to Use GitHub

1. **Create a Repository**: Click on the "+" icon in the top-right corner of GitHub and select "New repository". Fill in the necessary details and click "Create repository".

2. **Clone a Repository**: To clone a repository to your local machine, use the `git clone` command followed by the repository URL.

```bash
git clone https://github.com/zied-snoussi/git-test.git
```

3. **Commit Changes**: Use `git add .` to stage all changes, then `git commit -m "Your message"` to commit them.

```bash
git add .
git commit -m "Your message"
```

4. **Push Changes**: Push your changes to the remote repository using `git push`.

```bash
git push origin <branch-name>
```

5. **Create Pull Requests**: If you're working on a forked repository, create a pull request to propose changes to the original repository.

### Resolving Conflicts

1. **Fetch Changes**: Fetch changes from the remote repository to ensure your local repository is up to date.

```bash
git fetch origin
```

2. **Merge Changes**: Merge changes from the remote repository into your local branch.

```bash
git merge origin/<branch-name>
```

3. **Resolve Conflicts**: If there are conflicts, open the conflicted file(s) in your code editor. Edit the file(s) to resolve conflicts, then add and commit the changes.

```bash
git add .
git commit -m "Resolve conflicts"
```

4. **Push Changes**: Push the resolved changes to the remote repository.

```bash
git push origin <branch-name>
```

5. **Update Pull Request**: If resolving conflicts for a pull request, update the pull request on GitHub with the resolved changes.

```bash
git push origin <branch-name> --force
```

```bash
git push origin <branch-name> --force
```

6. **Rebase Changes**: Alternatively, you can rebase your changes on top of the latest changes from the remote repository.

```bash
git rebase origin/<branch-name>
```

7. **Resolve Conflicts**: If there are conflicts during the rebase process, follow the same steps mentioned earlier to resolve them.

8. **Complete Rebase**: After resolving conflicts, continue the rebase process by running:

```bash
git rebase --continue
```

9. **Push Changes**: Finally, push the rebased changes to the remote repository.

```bash
git push origin <branch-name> --force
```

By following these steps, you should be able to effectively resolve conflicts and keep your local and remote repositories in sync.