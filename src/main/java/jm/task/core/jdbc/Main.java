package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

import java.util.List;

public class Main {
    private static UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        userService.createUsersTable();

        userService.saveUser("Anna", "Antonova", (byte) 11);
        userService.saveUser("Boris", "Bortov", (byte) 22);
        userService.saveUser("Clare", "Chase", (byte) 33);
        userService.saveUser("Denny", "Denisov", (byte) 44);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

