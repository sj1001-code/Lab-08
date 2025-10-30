package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

    }

    @Test
    void testDeleteCityReturnsFalseIfNotPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        assertFalse(list.deleteCity(calgary), "Should return false if city was not in the list");
    }

    @Test
    void testCountCitiesReflectsNumberOfCities() {
        CustomList list = new CustomList();

        assertEquals(0, list.countCities(), "Empty list should have 0 cities");

        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities(), "Should have 2 cities after adding 2");

        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(1, list.countCities(), "Should have 1 city after deleting 1");
    }
}
