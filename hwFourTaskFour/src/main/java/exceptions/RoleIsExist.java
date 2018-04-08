package main.java.exceptions;

import main.java.Role;

public class RoleIsExist extends Exception {
    public RoleIsExist(Role role) {
        System.out.println(role.toString() + "is exist!");
    }

}
