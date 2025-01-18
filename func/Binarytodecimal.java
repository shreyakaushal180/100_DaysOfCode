package func;

import java.util.Scanner;

public class Binarytodecimal {
    public static int binaryToDecimal(int num){
        int power = 0;
        int decimal = 0;
        while (num>0) {
            int lastDigit = num % 10;
        decimal = decimal + ( lastDigit * (int)Math.pow(2,power));
        power++;
        num = num/10;            
        }
        return decimal;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binery number : ");
        int binery = sc.nextInt(); 
        int dec = binaryToDecimal(binery);
        System.out.println(dec);
    }
}
