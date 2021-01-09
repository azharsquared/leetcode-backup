class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        for(int i=0,sum =0;i<nums.length;i++){
            sum = sum + nums[i];
            sums[i] = sum;
        }
        return sums;
    }
}