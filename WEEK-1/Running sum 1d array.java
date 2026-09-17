class Solution {
    public int[] runningSum(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        
        return nums;
    }
}
##sample input
Input: nums = [1,2,3,4]
##sample output
Output: [1,3,6,10]
