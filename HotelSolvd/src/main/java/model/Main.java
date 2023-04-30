package model;

import enums.Division;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import exceptions.Exceptions;
import org.apache.log4j.Logger;
import org.apache.log4j.*;
import org.apache.log4j.BasicConfigurator;
public abstract class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static final String FILE_NAME = "target/log.log";


    public static void main(String[] args) throws Exceptions, IOException {
        Hotel hotel1 = new Hotel(1,"Hilton", 0);
        Hotel hotel2 = new Hotel(2,"Super8", 0);
        Hotel hotel3 = new Hotel(3,"Marriott", 0);
        Hotel.allHotels.add(hotel1);
        Hotel.allHotels.add(hotel2);
        Hotel.allHotels.add(hotel3);


//Working with the tables LinkedList.
        /*Table table1 = new Table(1, 1, 1);
        Table table2 = new Table(2, 2, 2);
        Table table3 = new Table(3, 3, 3);
        Table.tables.add(table1);
        Table.tables.add(table2);
        Table.tables.add(table3);
        System.out.println(Table.tables);
        Table.tables.remove(1);
        System.out.println(Table.tables);*/


//Working with Menu HashMap. Assigning price to a menu item.
       /* Menu.menuItemsWithPrice.put("Burger", 6.99);
        Menu.menuItemsWithPrice.put("PizzaSlice", 4.50);
        System.out.println(Menu.menuItemsWithPrice);*/

        ArrayList<Double> list = new ArrayList<>();
        list.add(12.99);
        list.add(10.50);
        list.add(2.50);

        /*logger.info("Hello world.");
        logger.info("What a beautiful day.");*/

//Working with Exceptions.
        HouseCleaner emp1 = new HouseCleaner(101, 1, "Jessica", "Marshal", 30000, 2010, Division.HOUSE_CLEANER);
        HotelEmployee.allHotelEmployees.add(emp1);
        //Hotel.addEmployee();
        Manager emp2 = new Manager(102, 1, "John", "Smith", 60000, 2022, Division.MANAGEMENT);
        HotelEmployee.allHotelEmployees.add(emp2);
        System.out.println(HotelEmployee.allHotelEmployees);


        //System.out.println(HotelEmployee.allHotelEmployees);
        // Exceptions.checkHotelNameException(hotel1, "Hilton");
        // Exceptions.checkHotelNameException(hotel2, "Marriott");
        //Exceptions.checkCorrectNameFormatException(emp1.getHotelEmployeeFirstName());
        //Exceptions.checkEmployeeExistsException("Jessica", "Marshal");
        //Exceptions.checkDuplicateIdException(101);
        //Exceptions.checkCorrectYearFormatException(emp1.getYearHired());
        //System.out.println(Exceptions.computeDivision(1, 0));
        //Exceptions.logToFile("FILE_NAME");
        //System.out.println(Exceptions.logToFile());
        //System.out.println(Exceptions.readLine("target/log.log"));
        //System.out.println(Exceptions.readLine("log"));
        //System.out.println(Exceptions.readFileLine("target/log.log"));
        //System.out.println(Exceptions.readFileLine("log"));
        //System.out.println(Exceptions.checkForElement(13.99));
    }
}


