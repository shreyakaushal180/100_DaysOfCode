package Arrays;

public class MaxSumPrefix {
    public static void max (int num []) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] =new int [num.length];

        prefix[0]=num[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i = 0; i<num.length; i++){
            int start = i ;
            for(int j = i; j<num.length; j++){
                int end = j;
                if(start==0){
                    curSum = prefix[end];
                }else{
                    curSum = prefix[end]-prefix[start-1];
                }
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.print("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
        int num [] = {5,8,-9,4,6,-2};
        max(num);
    }
}
//reduced time complexity from O(n^3) to O(n^2).