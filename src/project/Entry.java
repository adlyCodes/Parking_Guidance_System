package project;
import java.util.Arrays;
public class Entry  {

    Exit e1;
    public Entry( Exit e1){
        this.e1=new Exit(); // key word to refer at instance variable (e1)
    }

    public static boolean[] spots = new boolean[10];


    public static void freeSpot(boolean free){
        Arrays.fill(spots,Boolean.TRUE);

        System.out.println
                ("--------------------------------------------------");
        for(int i=Customer.id+1;i<10;i++){
            if (spots[i] == true){
                System.out.println("Spot number " +i + " is free");
            }
        }
        System.out.println
                ("--------------------------------------------------");
        System.out.println("You are advised to park at spot " + Customer.id);
        System.out.println("Spot "+ Customer.id + " is yours (Confirmed)");
        System.out.println
                ("--------------------------------------------------");
        //  System.out.println("Spot "+ Customer.id + " is busy (You)");
        for (int i = 0; i < Customer.id; i++){
            System.out.println("Spot "+ (1+i) + " is busy (You)");
        }
        for(int i=Customer.id+1;i<10;i++){

            if (spots[i] == true){
                System.out.println("Spot number " +i + " is free");
            }
        }
        System.out.println
                ("--------------------------------------------------");
    }

    public Exit getE1() {
        return e1;
    }

    public void setE1(Exit e1) {
        this.e1 = e1;
    }

    public static boolean[] getSpots() {
        return spots;
    }

    public void setSpots(boolean[] spots) {
        this.spots = spots;
    }

    public static void main() {
        freeSpot(false);
    }
}