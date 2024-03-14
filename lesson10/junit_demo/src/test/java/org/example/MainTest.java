package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getIncorrectHighEarningEmployeeCount() {
        List<Employee> mockData = List.of(new Employee(123333.0, "Das"), new Employee(223333.0, "Das"));

        int expected = 12;
        int actual = main.getHighEarningEmployeeCount(mockData);

        assertNotEquals(expected, actual);
    }

    @Test
    void getHighEarningEmployeeCount() {
        List<Employee> mockData = List.of(new Employee(123333.0, "Das"), new Employee(223333.0, "Das"));

        int expected = 2;
        int actual = main.getHighEarningEmployeeCount(mockData);

        assertEquals(expected, actual);
    }
}