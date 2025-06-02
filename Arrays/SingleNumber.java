public class SingleNumber {
    public static boolean single(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                    
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,4,5,2};
        System.out.println(single(nums));
    }
}
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//O(n^2) ->Time complexity.
// to improve we have to use bitwise operator / Hashmaps.
