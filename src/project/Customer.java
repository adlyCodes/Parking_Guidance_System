package project;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
public class Customer {
    // public class Customer implements ParkingCalc {}

    public static int id;
    public static String plate;
    public static long difference_In_Minutes;
    public static long difference_In_Hours;
    public static long receipt;
    static void customer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id number: ");
        id = input.nextInt();
        if (id > 10 || id < 1) {
            System.out.println("\nYour id should range from 1 to 10");
            System.out.println("Please re-enter your id correctly\n");
            customer();
        }
        System.out.print("Enter your vehicle plate number: ");
        plate = input.next();
    }
  public static void  findDifference(String start_date, String end_date) {
        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "HH:mm:ss");
        try {
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
            long difference_In_Time
                    = d2.getTime() - d1.getTime();
            long difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;
            difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;
            difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;
            System.out.print(
                    "Difference "
                            + "between two dates is: ");

            System.out.println(
                    difference_In_Hours
                            + " hours, "
                            + difference_In_Minutes
                            + " minutes, "
                            + difference_In_Seconds
                            + " seconds");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        customer();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String start_date
                = formatter.format(date);
        System.out.println
                ("--------------------------------------------------" +
                        "\nWelcome, your ticket details are as follows: " +
                        "\nID number: " + id +
                        "\nYour plate number: " + plate +
                        "\nYour arrival time: " + formatter.format(date) +
                        "\nYou are parking at " + id + " spot" +
                        "\n--------------------------------------------------" );
        System.out.print("Your departure time is: ");
        String end_date
                = Exit.departureTime();
        findDifference(formatter.format(date), end_date);
        long receipt = ((difference_In_Hours * 60) + (difference_In_Minutes));
        System.out.println("Your Receipt is: " + receipt + "$");
    }
   /* Customer(long receipt, String plate, int id) {
        this.id=id;
        this.plate=plate;
        this.receipt=receipt;
    }*/

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public static long getDifference_In_Minutes() {
        return difference_In_Minutes;
    }

    public void setDifference_In_Minutes(long difference_In_Minutes) {
        this.difference_In_Minutes = difference_In_Minutes;
    }

    public static long getDifference_In_Hours() {
        return difference_In_Hours;
    }

    public  void setDifference_In_Hours(long difference_In_Hours) {
        this.difference_In_Hours = difference_In_Hours;
    }

    public static long getReceipt() {
        return receipt;
    }

    public void setReceipt(long receipt) {
        this.receipt = receipt;
    }

    /* @Override
    public  void findDifference(String s1, String s2) {

        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "HH:mm:ss");
        try {
            Date d1 = sdf.parse(s1);
            Date d2 = sdf.parse(s2);
            long difference_In_Time
                    = d2.getTime() - d1.getTime();
            long difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;
            difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;
            difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;
            System.out.print(
                    "Difference "
                            + "between two dates is: ");

            System.out.println(
                    difference_In_Hours
                            + " hours, "
                            + difference_In_Minutes
                            + " minutes, "
                            + difference_In_Seconds
                            + " seconds");
        }
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }*/
}
