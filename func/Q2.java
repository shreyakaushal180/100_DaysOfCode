package func;
import java.util.*;
public class Q2 {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = isEven(a);
        System.out.println(b);
        
    }
    
}
