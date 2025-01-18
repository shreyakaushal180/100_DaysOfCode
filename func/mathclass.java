package func;

import java.util.Scanner;

public class mathclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();
        System.out.println("Maximum number between "+ a+ "and "+ b + " is " + Math.max(a,b));
        System.out.println("Minimum number between "+ a+ "and "+ b + " is " + Math.min(a,b));
        System.out.println("Square root of " + a + " is " + Math.sqrt(a));
        System.out.println("square root of " + b + " is "+ Math.sqrt(b));
        
    }
    
}
