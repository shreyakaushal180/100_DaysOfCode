import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float Pencil = sc.nextFloat();
        Float gst_pencil = Pencil* 0.18f;
        Float Pen = sc.nextFloat();
        Float gst_pen = Pen * 0.18f;
        Float Eraser = sc.nextFloat();
        Float gst_eraser = Eraser* 0.18f;
        Float Total_bill = Pencil + Pen + Eraser + gst_pencil + gst_pen + gst_eraser;
        System.out.print( Total_bill);        
    }
}
