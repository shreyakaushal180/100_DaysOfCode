import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number == 2){
            System.out.println("PRIME NUMBER");
        }else{boolean isPrime= true;
            for(int i = 2; i<=Math.sqrt(number) ; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            } 
            if ( isPrime == true){
                System.out.println("PRIME NUMBER");
            }else{
                System.out.println("COMPOSITE NUMBER");
            }


    }
}}
