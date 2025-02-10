package Arrays;

public class Subarrays {
    public static void subArrays(int num[]) {
        int ts =0;
        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length ; j++){
                for (int k = i; k<=j; k++){
                    System.out.println(num[k]+" ");
                    ts++;
                }System.out.println();
            }System.out.println();
        }System.out.println("total sub arrays:" + ts);
        
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        subArrays(num);
        
    }
}
