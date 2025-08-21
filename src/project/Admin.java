package project;
import java.util.*;
import java.util.ArrayList;
import java.lang.Integer;

public class Admin {
    public static ArrayList<Integer> numbers
            = new ArrayList<>(9);
    public static void main(String[] arg) throws Exception {
        Scanner input = new Scanner(System.in);
        try {

            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);

            System.out.println("Total parking spots: " + numbers);

            System.out.println("how many more spots do you want to add?");
            int addedSpots = input.nextInt();

            numbers.ensureCapacity(9 + addedSpots); //increases capacity

            for (int i = 9; i < addedSpots + 9; i++) { // prints increased capacity (original + new)
                numbers.add(i + 1);
            }
            System.out.println("Updated parking spots: " + numbers);
        }

        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
    public static void viewTotalSpots(){
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println("Total parking spots: " + numbers);
    }
    public static void addSpots(){
        Scanner input = new Scanner(System.in);
        System.out.println("how many more spots do you want to add?");
        int addedSpots = input.nextInt();

        numbers.ensureCapacity(9 + addedSpots);

        for (int i = 9;i<addedSpots + 9;i++){
            numbers.add(i+1);
        }
        System.out.println("Updated parking spots: " + numbers);

    }
    public static void carReport(){
    System.out.println("--------------------------------------------------");
    System.out.println("Car of id: " + Customer.id);
    System.out.println("Parking spot: " + Customer.id);
    System.out.println("Plate: " + Customer.plate);
    System.out.println("Total parking time = " + Customer.difference_In_Hours + " hours & " + Customer.difference_In_Minutes + " minutes");
    System.out.println("Receipt: "+((Customer.difference_In_Hours * 60) + (Customer.difference_In_Minutes)) + "$");
    System.out.println("--------------------------------------------------");
}

    public static ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public static void setNumbers(ArrayList<Integer> numbers) {
        Admin.numbers = numbers;
    }
}
