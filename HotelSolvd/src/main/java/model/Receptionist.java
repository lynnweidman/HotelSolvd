package model;

import enums.Division;

public class Receptionist extends HotelEmployee {
    Receptionist(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division){
        super(hotelEmployeeId,hotelId, hotelEmployeeFirstName, hotelEmployeeLastName, salary, yearHired, division);
    }
}

