package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void testDelete() {
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        int listSize = list.getCount();
        list.addCity(city);
        list.delete(city);
        assertEquals(list.getCount(),listSize);
    }
    @Test
    public void testHasCity(){
//        list = MockCityList();
//        City city = new City("Regina", "Saskatchewan");
//        list.addCity(city);
//        assertTrue(list.hasCity(city));
    }
}
