class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        result[0] = nums[0];
        for(int firstWindow = 1,secondWindow = n,count = 1; count< 2*n ;count++){
            if(count % 2 == 0){
                 result[firstWindow + secondWindow - n] = nums[firstWindow];
                 firstWindow++;
            }else{
                 result[firstWindow + secondWindow - n] = nums[secondWindow];
                 secondWindow++;
            }
        }
        return result;
    }
}