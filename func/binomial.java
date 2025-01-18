package func;

import java.util.Scanner;

public class binomial {
    public static int factorial(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r ) {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int nr_factorial = factorial(n-r);
        int C = (n_factorial)/((r_factorial)*(nr_factorial));
                return C;
            
    }       
            public static void main(String[] args) {
        
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.print("Enter another number: ");
                int r = sc.nextInt();
                int c = binomialCoefficient(n, r);
                System.out.print("Binomiall Coefficient is "+ c);


    }
}
