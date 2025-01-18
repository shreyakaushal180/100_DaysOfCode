import java.util.Scanner;
public class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (true){
            if(n % 10 == 0){
                break;
            }
            System.out.println("You entered: " + n);
            System.out.print("Enter another number: ");
            n=sc.nextInt();
        } System.out.println("Eixted loop");
    
        
    }
    
}
