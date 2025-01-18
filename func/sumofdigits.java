package func;
import java.util.*;
public class sumofdigits {
    public static int sumOfDigits(int num){
        int sum = 0;
       while(num !=0){
        int lastDigit = num % 10;
        sum = sum + lastDigit;
        num = num / 10;
    }
    return sum ;
      
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int A = sc.nextInt();
        System.out.print("The sum of digits of the given number: " + sumOfDigits(A) );
        
    }
}
