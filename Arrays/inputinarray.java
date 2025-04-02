import java.util.*;
package Arrays;

public class inputinarray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter element for array: ");
            arr[i] = sc.nextInt();
        }System.out.print(Arrays.toString(arr));

    }
    
}
//to take input in array 