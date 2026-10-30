import java.util.Scanner;

public class TrainArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trains = {"TN101", "TN102", "TN103", "TN104", "TN105"};

        System.out.print("Enter train index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Number: " + trains[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid train index!");
            System.out.println("Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}
