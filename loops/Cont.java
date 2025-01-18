import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int n = sc.nextInt();
        while (true) {
            if(n%10==0){
                System.out.print("The number is divisible by 10. Enter another number: ");
                n=sc.nextInt();
                continue;
            }
            System.out.println("You entered : "+n);
            System.out.println("Enter another number: ");
            n=sc.nextInt();

            
        }
    

    }
}
