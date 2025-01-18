import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String  result = (marks >= 33) ? "PASS":"FAIL";
        System.out.println(result);
    }


}
