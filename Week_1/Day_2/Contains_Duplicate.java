package Week_1.Day_2;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for (int n: nums){
            s.add(n);
        }
        return nums.length!=s.size();
    }
}