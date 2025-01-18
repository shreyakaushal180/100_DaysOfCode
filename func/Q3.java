package func;
import java.util.*;
public class Q3 {
    public static int isPalendrome(int num){
        int tem = num;
        int reverse = 0;
        while(num != 0){
            int remainder = num % 2;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }
    public static boolean condition(int num) {
        int palendrome = isPalendrome(num);
        if (num == palendrome){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = condition(a);
        System.out.print("Is the number a plaendrome? "+b);
    }
}
