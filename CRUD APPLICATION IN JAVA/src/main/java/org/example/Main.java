package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        // Create a new user
        User newUser = new User();
        newUser.setName("John Doe");
        newUser.setEmail("john@example.com");
        newUser.setAge(30);
        userDAO.createUser(newUser);

        // Read all users
        List<User> users = userDAO.getAllUsers();
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }

        // Update a user
        newUser.setAge(35);
        userDAO.updateUser(newUser);

        // Delete a user by ID
        userDAO.deleteUser(newUser.getId());
    }
}