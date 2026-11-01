import java.util.Scanner;

public class FeedbackAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ratings = new int[5];
        int sum = 0;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            ratings[i] = sc.nextInt();
            sum += ratings[i];
        }

        double average = sum / 5.0;

        System.out.println("Average Feedback Rating = " + average);

        sc.close();
    }
}
