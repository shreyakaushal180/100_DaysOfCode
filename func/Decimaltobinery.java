package func;

import java.util.Scanner;

public class Decimaltobinery {
    public static void decimalToBinery(int num) {
        int binery = 0;
        int power = 0;
        while(num>0){
            int rem = num%2;
            binery = binery + (rem *(int) Math.pow(10, power));
            power++;
            num = num/2;
        }
        System.out.print("binery form of number :"+ binery );
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a deciaml number :");
        int a = sc.nextInt();
        decimalToBinery(a);
    }
    
}
