# CRUD-Application-in-Java

This repo consists of a simple CRUD application that demonstrates the use of core Java programming concepts and basic SQL Database management.  
This project manages "User" data in a MySQL database, showcasing how to implement basix CRUD operations using JDBC.

#Table of Contents
- Features
- Technologies Used
- Setup Instructions
- Project Structure
- Usage Guide 
- Database Design
- Prospective areas of improvement

  FEATURES
  This application supports the following functionalities:
  1. CREATE - Adds a new user to the database
  2. READ - Fetches and displays all users from the DB
  3. UPDATE - Modifies user details by specifying the user ID.
  4. DELETE - Removes a user from the DB by the user ID

  Technologies Used
  - Java : Programming Language
  - JDBC : Java Database Connectivity, used to connect to the database
  - MySQL : Relational Database Management System (RDBMS)

 SETUP INSTUCTIONS 
 Prerequisites 
- Java Development Kit (JDK): Make sure JDK 8 or later is installed.
- MySQL Database: Install MySQL and set up a database.

  1. Clone the repo - git clone https://github.com/yourusername/java-crud-app.git cd java-crud-app
  2. Open a MySQL client (e.g., MySQL Workbench) and create the crud_app database
  3. Create the users table within the crud_app database
  4. Configure the Database Connection: in the  DatabaseConnection class , modify the URL, USER and PASSWORD fields to match your MySQL database credentials . Enure your MySQL server is running 
  5. Compile and run the program


 PROJECT STRUCTURE 

- Main.java  -  -  -  -  Entry point to interact with the CRUD .
- DatabaseConnection.java  -  -  -  -  Manages the MySQL database connection
- User.java  -  -  -  -   Represents the User entity
- UserDAO.java  -  -  -  -  Data Access Object to perform CRUD operations



USAGE GUIDE 
Creating a User 
To create a new user m initialize a User object with desired properties and pass it to the createUser() method. 

        User newUser = new User();
        newUser.setName("Alice Johnson");
        newUser.setEmail("alice@example.com");
        newUser.setAge(28);
        userDAO.createUser(newUser);


Reading all Users 
Retrieve a list of all users from the database by calling the getAllUsers() method.

        List<User> users = userDAO.getAllUsers();
            for (User user : users) {
        System.out.println(user.getName() + " - " + user.getEmail());
        }

Updating a User 
Update an existing user by modifying its details and calling the updateUser() method with the updated User object.

     User userToUpdate = userDAO.getAllUsers().get(0); // Example: fetching           first user
    userToUpdate.setAge(30);
    userDAO.updateUser(userToUpdate);

  Deleting a User 
  To delete a user, specify their id and call the deleteUser() method.

  int userIdToDelete = 1; // Example: deleting user with ID 1
userDAO.deleteUser(userIdToDelete);


DATABASE DESIGN 
The users table stores information for each user with the following fields:

id: Unique identifier for each user, auto-incremented.
name: The user's full name.
email: The user's email address.
age: The user's age


SQL for creating Tables 
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    age INT
);


PROSPECTIVE IMPROVEMENTS
This simple CRUD application can be further enhanced with the following features:

1. Validation: Add checks to validate user input (e.g., email format, age range).
2. Exception Handling: Improve exception handling for more robust error management.
3. Logging: Implement logging to track application flow and errors.
4. GUI: Create a graphical user interface (GUI) for an interactive user experience.
5. Testing: Write unit tests to verify CRUD operations.


    
  
  
