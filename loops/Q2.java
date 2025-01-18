import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evensum = 0;
        int oddsum = 0;
        int number; 
        int choice;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt(); 

            if (number % 2 == 0) {
                evensum += number; 
            } else {
                oddsum += number; 
            }

            System.out.print("Enter 1 to continue and 0 to exit: ");
            choice = sc.nextInt(); 
            
        } while (choice == 1); 

             if(choice != 1 && choice !=0){
                System.out.println("Wrong input");
            }
        System.out.println("Sum of even numbers: " + evensum);
        System.out.println("Sum of odd numbers: " + oddsum);

        sc.close();
    }
}
