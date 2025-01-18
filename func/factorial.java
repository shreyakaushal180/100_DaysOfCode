package func;

import java.util.Scanner;

public class factorial {
    public static int facto(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *=i;
           
        }
        return fact;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        int fac = facto(num);
        System.out.println("Factorial of the number: "+fac);
    }
}
