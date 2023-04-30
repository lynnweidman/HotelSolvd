package exceptions;

import model.Hotel;
import model.HotelEmployee;
import model.Main;
import model.Receptionist;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;

public class Exceptions extends Exception {

/*
Constructor for custom exceptions.
*/
    public Exceptions(String message) {
        super(message);
    }

/*
Custom exception to see if there is a duplicate Id. Throws the exception and prints a message if there is.
*/
    public static void checkDuplicateIdException(int id) throws Exceptions {
        for( HotelEmployee employee : HotelEmployee.allHotelEmployees ) {
            if(String.valueOf(employee.getHotelEmployeeId()).equals(String.valueOf(id))) {
                String message = "This Id is taken. Cannot have duplicate Ids.";
                Exceptions duplicateId = new Exceptions(message);
                throw duplicateId;
            }
        }
    }

/*
Custom exception to see if an employee is already entered in the list.
Throws an exception and prints a message if they're already in the system.
*/
    public static void checkEmployeeExistsException(String firstName, String lastName) throws Exceptions {
        for( HotelEmployee employee : HotelEmployee.allHotelEmployees ) {
            if(employee.getHotelEmployeeFirstName().equalsIgnoreCase(firstName) & employee.getHotelEmployeeLastName().equalsIgnoreCase(lastName)) {
                String message = "This employee already exits.";
                Exceptions duplicateEmployee = new Exceptions(message);
                throw duplicateEmployee;
            }
        }
    }

/*
Custom exception to see if a hotel is already on the list.
Throws the exception and prints a message if the hotel is already in the system.
*/
    public static boolean checkHotelNameException(Hotel hotelObject, String hotelNameToCheck) throws Exceptions {
        if (hotelObject.getHotelName().equalsIgnoreCase(hotelNameToCheck)) {
            System.out.println("Yes, this is the " + hotelObject.getHotelName());
            return true;
        } else {
            String message = "This is the " + hotelObject.getHotelName() + " not the " + hotelNameToCheck;
            Exceptions noHotelFound = new Exceptions(message);
            throw noHotelFound;
        }
    }

/*
Custom exception to see if the year is entered as 4 digits.
Throws the exception and prints a message if the year is entered with more or less than 4 digits.
*/
    public static void checkCorrectYearFormatException(int year) throws Exceptions {
        if (String.valueOf(year).length() < 4 || String.valueOf(year).length() > 4) {
            String message = "Not proper date format.";
            Exceptions improperDateFormat = new Exceptions(message);
            throw improperDateFormat;
        }
    }

/*
Custom exception to see if the name contains any spaces.
Throws the exception and prints a message if the name contains any spaces.
*/
    public static void checkCorrectNameFormatException(String name) throws Exceptions {
        if (name.contains(" ")) {
            String message = "Names cannot contain spaces.";
            Exceptions improperIdFormat = new Exceptions(message);
            throw improperIdFormat;
        }
    }

/*An ArithmeticException exception with try/catch that prints an error message if there is division by 0.*/
    public static int computeDivision(int a, int b) {
        int quotient = 0;

        try {
            quotient = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("NumberFormatException occurred. Cannot divide by 0.");
        }
        return quotient;
    }

/*Throws an IOException if there is a problem logging to a file.*/
    public static void logToFile(String fileName ) throws IOException{
        final Logger logger = Logger.getLogger(Exceptions.class);
        logger.info("Hello world.");
        logger.info("What a beatiful day.");
    }

/*Throws an IOException if the file to read is not found.*/
    public static String readLine(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String line = in.readLine();
        return line;
    }

/*An FileNotFoundException with try/catch that prints an error message if the file is not found.*/

    public static void readFileLine(String fileName) throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String fileLine = bf.readLine();
            System.out.println(fileLine);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException");
            //e.printStackTrace();
        }
    }
}




