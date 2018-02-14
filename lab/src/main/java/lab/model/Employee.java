package main.java.lab.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee extends Person{

    Map<Skills, Integer> skills;

    public Employee(String name, String surname) {
        super(name, surname);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth) {
        super(name, surname, dateOfBirth);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth, Map<Skills, Integer> skills) {
        super(name, surname, dateOfBirth);
        this.skills = skills;
    }


}
