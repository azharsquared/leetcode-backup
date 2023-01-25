class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < nums.length;i++){
            int diff = target - nums[i];
            Integer val = map.get(diff);
            if( val != null){
                return new int[]{val,i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}