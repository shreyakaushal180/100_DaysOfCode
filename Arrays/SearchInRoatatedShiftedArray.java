package Arrays;

public class SearchInRoatatedShiftedArray {
    public static int Search (int[] nums ,int  target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left = mid +1;
            }else{
                right = mid;
            }
        }
        int shift = left;

        left = 0;
        right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
            int realMid = (mid + shift)%7;

            if(nums[realMid ] == target){
                return realMid;
            }else if(nums[realMid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int nums [] = {3, 4,5,6,0,1,2};
        System.out.println(Search(nums, 5));
        
    }
}
