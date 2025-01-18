import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      int i = 1;
      int sum = 0;
      while (i <= n) { 
       
        i++;
        sum+=i;
      }
      System.out.println(sum);
       }
    }
