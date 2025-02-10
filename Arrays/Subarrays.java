package Arrays;

public class Subarrays {
    public static void subArrays(int num[]) {
        int ts =0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i = 0; i<num.length; i++){
            for(int j = i; j<num.length ; j++){
                int sum=0;
                for (int k = i; k<=j; k++){
                    System.out.println(num[k]+" ");
                    ts++;
                    sum+=num[k];       
                }System.out.println("Sum: "+sum);
                System.out.println(); 
                if(sum > maxsum){
                    maxsum = sum;
                }if(sum < minsum){
                    minsum = sum;
                }
            }System.out.println();
            
        }
        System.out.println("total sub arrays: " + ts);
        System.out.println("Greatest sum: "+ maxsum);
        System.out.println("Smallest sum: "+minsum);
        
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        subArrays(num);  
    }
}
