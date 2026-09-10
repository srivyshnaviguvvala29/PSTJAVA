class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] != 0) {
                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++;
            }
        }
    }
}
##sample input
  nums =[0,1,0,3,12]
##sample output
  [1,3,12,0,0]
