package func;

import java.util.Scanner;

public class product {
    public static int pro (int num1 , int num2){
        int productOfAandB = num1 * num2;
        return productOfAandB;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number");
        int b = sc.nextInt();
        
        int prod = pro(a,b);
        System.out.print(prod);
        sc.close();
    }
}
