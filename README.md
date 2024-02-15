# TODO App

This is a simple TODO application written in Java, using Servlets, Jetty, Jakarta EE, Maven, Flyway for database migrations, H2 Database, Jackson for JSON serialization, and more.
I did it to learn the basics about CRUD, REST and HTTP :)

## Features

- Add new TODO items.
- Mark TODO items as completed.
- View list of TODO items.
- Delete completed TODO items.

## Technologies Used

- Servlets: Used for handling HTTP requests and responses.
- Jetty: Embedded servlet container for running the web application.
- Jakarta EE: Platform for building enterprise-level Java applications.
- Maven: Build automation and dependency management tool.
- Flyway: Database migration tool for managing database schema changes.
- H2 Database: Lightweight, in-memory SQL database for storing TODO items.
- Jackson: JSON serialization and deserialization library for converting Java objects to JSON and vice versa.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 20 or later
- Apache Maven
- Git

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/macioooo/TodoList.git
   ```

2. Navigate to the project directory:

   ```bash
   cd TodoList
   ```

3. Build the project using Maven:

   ```bash
   mvn clean package
   ```
4.Run Flyway migrations to apply database changes:

```bash
mvn flyway:migrate
```

5. Run the application using the embedded Jetty servlet container:

   ```bash
   java -jar target/TodoList.jar
   ```

6. Open your web browser and navigate to `http://localhost:8080` to access the TODO application.

## Usage

- To add a new TODO item, enter the task description in the input field and click "Add".
- To mark a TODO item as completed, click the checkbox next to the item.
- To delete completed TODO items, click the "Delete Completed" button.

## Contributing

Contributions are welcome! Feel free to fork the repository, make changes, and submit pull requests.

