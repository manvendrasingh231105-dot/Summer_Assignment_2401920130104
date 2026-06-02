package Week_1.Day_2;

class Solution {
    public int maxSubArray(int[] nums) {
         int r=nums[0];
        int max=nums[0];

        for(int i =1;i<nums.length;i++) {
            max=Math.max(max+nums[i],nums[i]);
            r=Math.max(r,max);
        }
        return r;
        
    }
}