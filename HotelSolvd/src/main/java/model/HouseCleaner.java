package model;

import enums.Division;

import java.util.ArrayList;
import java.util.Observable;

public class HouseCleaner extends HotelEmployee {
    HouseCleaner(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division){
        super(hotelEmployeeId, hotelId, hotelEmployeeFirstName, hotelEmployeeLastName, salary, yearHired, division);
    }
}

