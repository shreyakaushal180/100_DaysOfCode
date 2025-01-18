import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int A = sc.nextInt();

        if (A > 0) {
            System.out.println("POSITIVE");
        } else if (A == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("NEGATIVE");
        }

        sc.close(); // Close the scanner to release resources
    }
}
