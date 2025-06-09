public class bubblesort{
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int turn = 0 ; turn<n; turn++ ){
            for(int j = 0; j<n-turn; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1] ;
                    nums[j+1] = nums[j];
                    nums[j]= temp;

                }
            }
        }
    }
     {
        
    }
    public static void main(String[] args) {
        
    }
}