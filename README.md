# Student Registration CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application for student registration using JDBC in Java. The application allows users to manage student records in a MySQL database.

## Getting Started

Follow these instructions to set up and run the project on your local machine.

### Prerequisites

- Java Development Kit (JDK) installed
- MySQL database server running
- MySQL Connector/J library

### Folder Structure

The workspace contains the following folders:

- `src`: Contains the source code
- `lib`: Contains the dependencies
- `bin`: Contains the compiled output files

### Setting Up

1. Clone the repository or download the source code.
2. Open the project in Visual Studio Code.
3. Ensure the MySQL Connector/J library is included in the `lib` folder or update the path in `.vscode/settings.json`.

### Database Setup

1. Create a MySQL database named `students_db`.
2. Create a table named `students` using the following SQL query:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255)
);
