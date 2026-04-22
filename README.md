# GitHub Actions Gradle Demo

This is a tiny Kotlin/JVM project you can use to practice GitHub Actions with Gradle.

## What is included

- A simple Kotlin application
- One automated test
- A GitHub Actions workflow at `.github/workflows/ci.yml`

## What the workflow does

On each push to `main` and on every pull request, GitHub Actions will:

1. Check out the repository
2. Install JDK 17
3. Install Gradle
4. Run `gradle build`

## Suggested next steps

1. Create a new GitHub repository
2. Push this folder to that repository
3. Open the `Actions` tab on GitHub
4. Make a small code change and push again to watch the workflow run

## Notes

This project does not include a Gradle wrapper because this machine does not currently have Gradle installed to generate one. The CI workflow installs Gradle directly, which is fine for learning GitHub Actions.
