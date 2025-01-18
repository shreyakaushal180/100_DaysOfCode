package loops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
    while (n>0){
        int lastDigit= n % 10;
        System.out.print(lastDigit);
        n /= 10;
    }
}
}
    

