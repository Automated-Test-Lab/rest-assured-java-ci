
# Automated Test Lab 🧪 | Rest Assured + Java + CI

This project aims to provide test automation artifacts in the integration layer using the Java language and Rest Assured framework.

## ☑️ You must have:

To execute the project you must have:

- [Git](https://git-scm.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Gradle](https://gradle.org/install/)
- [Java](https://www.oracle.com/br/java/technologies/downloads/)


## 📁 Directory structure

We have the following directory structure in the project:

- *model/* - represents the structure and logic of a system's data. It defines the properties and behaviors of business objects, interacts with the database, and encapsulates business rules and data persistence.


- *control/* -acts as an intermediary between user requests and system operations. It receives HTTP requests, processes the data, interacts with the model and returns the appropriate response


- *util/* - The util folder has functions that will be reused and used in various parts of the code. This makes maintenance easier, because when a modification is made to a specific file, it will be available for the entire project. Also avoiding code repetition.

## 🚀 Running the project:

- Clone the repository:

```bash
  $ git clone git@github.com:Automated-Test-Lab/rest-assured-java-ci.git
```
- Run tests:

```bash
  $ ./gradlew test
```

## 🚀 Running the pipeline (GitHub Action):

Explanation of the steps of ``gradle.yml``:

- **Check out repository code:** this step downloads the code from the repository to the GitHub Action runtime.


- **Set up JDK 17:** configures the Java Development Kit (JDK) to version 17. You can change the version as needed.


- **Cache Gradle packages:** this step uses a cache for Gradle packages, which speeds up the build process in subsequent runs.


- **Build with Gradle:** runs the ./gradlew build command, which compiles the project.


- **Run Tests:** runs the integration tests defined in the project using ``./gradlew test``.

Every time you push to the ``main`` branch or open a pull request, the GitHub Action will be executed as defined.

## 🛠️  Technologies

- [Git](https://git-scm.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Gradle](https://gradle.org/install/)
- [Java](https://www.oracle.com/br/java/technologies/downloads/)

## 📫 Contributing

To contribute to the project, follow these steps:

    1. Clone this repositoy
    2. Create a branch: git checkout -b <nome_branch>.
    3. Make your changes and commit them: git commit -m '<mensagem_commit>'
    4. Push to branch: git push origin <nome_branch>
    5. Create the merge request.