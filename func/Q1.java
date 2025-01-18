package func;

import java.util.Scanner;

public class Q1 {
    public static int avgOfGiven (int a , int b){
        int avg = (a + b)/2;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = avgOfGiven(a, b);
        System.out.println(c);
    }
}
