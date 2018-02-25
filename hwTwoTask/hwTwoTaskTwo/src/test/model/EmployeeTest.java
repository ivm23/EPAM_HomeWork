package test.model;

import main.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Employee employee;
    private ArrayList<Stationery> stationery;

    @Before
    public void setUp() {
        stationery = new ArrayList<>();
        stationery.add(new Pen(10, Color.RED));
        stationery.add(new Yardstick(10, 15.5));
        stationery.add(new HolePuncher(27));

        employee = new Employee("Joe", stationery);
    }

    @Test
    public void getNameShouldReturnTrue() {
        assertEquals("Joe", employee.getName());
    }
    @Test
    public void getArrayOfStationeryShouldReturnTrue() {
        assertEquals(stationery, employee.getStationery());
    }
    @Test
    public void calculateTotalSumOfStationeryShouldReturnTrue(){
        assertEquals(47, employee.calculateTotalSumOfStationery());
    }
}
