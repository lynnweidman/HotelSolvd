package model;

import enums.Division;
import interfaces.CurrentYear;
import interfaces.GreatPlaceToWork;
import interfaces.SalaryIncrease;

import java.util.ArrayList;
import java.util.Observable;

public abstract class HotelEmployee implements SalaryIncrease, CurrentYear, GreatPlaceToWork {
    protected int hotelEmployeeId;
    protected int hotelId;
    protected String hotelEmployeeFirstName;
    protected String hotelEmployeeLastName;
    protected int salary;
    protected int yearHired;
    protected Division division;

    HotelEmployee(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division) {
        this.hotelEmployeeId = hotelEmployeeId;
        this.hotelId = hotelId;
        this.hotelEmployeeFirstName = hotelEmployeeFirstName;
        this.hotelEmployeeLastName = hotelEmployeeLastName;
        this.salary = salary;
        this.yearHired = yearHired;
        this.division = division;
    }

    public static ArrayList<HotelEmployee> allHotelEmployees = new ArrayList<>();


    public int getHotelEmployeeId() {
        return hotelEmployeeId;
    }

    public void setHotelEmployeeId(int hotelEmployeeId) {
        this.hotelEmployeeId = hotelEmployeeId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelEmployeeFirstName() {
        return hotelEmployeeFirstName;
    }

    public void setHotelEmployeeFirstName(String hotelEmployeeFirstName) {
        this.hotelEmployeeFirstName = hotelEmployeeFirstName;
    }

    public String getHotelEmployeeLastName() {
        return hotelEmployeeLastName;
    }

    public void setHotelEmployeeLastName(String hotelEmployeeLastName) {
        this.hotelEmployeeLastName = hotelEmployeeLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearHired() {
        return yearHired;
    }

    public void setYearHired(int yearHired) {
        this.yearHired = yearHired;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    /*This final method is using the getSalaryIncrease from the SalaryIncrease interface. It can be used by subclasses,
        but cannot be overriden.*/
    @Override
    public final double getSalaryIncrease(int salary) {
        //super();
        if (CURRENT_YEAR - salary < 5) {
            salary = (int) ((salary * FIVE_PERCENT) + salary);
        } else {
            salary = (int) ((salary * TEN_PERCENT) + salary);
        }
        return salary;
    }

    @Override
    public void getGreatPlaceToWork() {
        System.out.println("This hotel is a great place to work!");
    }

    @Override
    public String toString() {
        return "HotelEmployee{" +
                "hotelEmployeeId=" + hotelEmployeeId +
                ", hotelId=" + hotelId +
                ", hotelEmployeeFirstName='" + hotelEmployeeFirstName + '\'' +
                ", hotelEmployeeLastName='" + hotelEmployeeLastName + '\'' +
                ", salary=" + salary +
                ", yearHired=" + yearHired +
                ", division=" + division +
                '}';
    }
}

