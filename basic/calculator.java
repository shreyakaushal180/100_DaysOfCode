import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        Double A = sc.nextDouble();
        System.out.println("Enter B:");
        Double B = sc.nextDouble();
        System.out.println("Enter Operator:");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+': System.out.println(A+B);

                
                break;
            case '-': System.out.println(A-B);
                break;
            case '*': System.out.println(A*B);
                break;
            case '/': System.out.println(A/B);
                break;
            case '%': System.out.print(A%B);
                break;
        
            default: System.out.println("Wrong operator");
            
        }
    }
}
