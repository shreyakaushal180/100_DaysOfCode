package Arrays;

public class LargestSmallestNum {
    public static void largestSmallestNum (int num[]) {
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(smallest<num[i]){
                smallest = num[i];
            }
            if(largest>num[i]){
                largest=num[i];
            }
        }
        System.out.println("Smallest number: "+ largest);
        System.out.println("Largest number: "+smallest);
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        largestSmallestNum(num);
    }
}
