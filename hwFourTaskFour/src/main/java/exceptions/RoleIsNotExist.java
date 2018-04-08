package main.java.exceptions;

import main.java.Role;

public class RoleIsNotExist extends Exception {
    public RoleIsNotExist(Role role) {
        System.out.println(role.toString() + "isn't exist!");
    }
}
