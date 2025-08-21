package project;
import java.util.*;
public class Exit {

    public static void main() {

        //System.out.println(Customer.receipt);

        System.out.println("Total parking time = " + Customer.difference_In_Hours + " hours & " + Customer.difference_In_Minutes + " minutes");
        System.out.println("Your receipt: "+((Customer.difference_In_Hours * 60) + (Customer.difference_In_Minutes)) + "$");
    }
    public static String departureTime(){
        Scanner input = new Scanner (System.in);
        return input.nextLine();
    }
}