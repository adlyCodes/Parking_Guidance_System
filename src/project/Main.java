package project;
import java.util.*;
public class Main {
    Customer customer = new Customer();
    private static int module = 0;
    private static int adminChoose = 0;

    public static void main(String[] args) {

        System.out.println("\nChoose your module");
        System.out.print("1: Customer module\n2: Entry station module\n3: Exit station module\n4: Admin module\n5: Exit program\n");
        Scanner input = new Scanner(System.in);
        module = input.nextInt();
        switch (module) {
            case 1:
                Customer.main();
                main(new String[]{});
                break;
            case 2:
                Entry.main();
                main(new String[]{});
                break;
            case 3:
                Exit.main();
                main(new String[]{});
                break;
            case 4:
                System.out.println("1: View total spots\n2: Add spots\n3: View cars report");
                adminChoose = input.nextInt();
                if (adminChoose == 1) {
                    Admin.viewTotalSpots();
                }
                if (adminChoose == 2) {
                    Admin.addSpots();
                }
                if (adminChoose == 3) {
                    Admin.carReport();
                }
                main(new String[]{});
                break;
            case 5:
                System.exit(0);
        }
    }
}