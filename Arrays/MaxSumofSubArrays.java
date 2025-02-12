package Arrays;

public class MaxSumofSubArrays {
    public static void maxSum(int num[]){
        int maxsum = Integer.MIN_VALUE;
        for (int i= 0; i<num.length; i++){
            for(int j = i; j < num.length; j++){
                int sum = 0;
                for(int k = i; k<=j ; k++){
                    sum+=num[k];
                }System.out.print("Sum of Subarrays: "+ sum);
                System.out.println();
                if(sum>maxsum){
                    maxsum = sum;
                }
            }
        }System.out.print("Max sum of array: "+ maxsum);
        System.out.println();
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        maxSum(num);
    }
}
