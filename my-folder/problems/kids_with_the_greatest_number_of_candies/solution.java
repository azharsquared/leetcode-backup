class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidStatus = new ArrayList<>();
        int maxCandyForKid = 0;
        for(Integer candy : candies){
            if(candy > maxCandyForKid){
                maxCandyForKid = candy;
            }
        }
        for(int kid = 0; kid < candies.length ; kid++ ){
            if(candies[kid] + extraCandies >= maxCandyForKid){
                kidStatus.add(true);
            }else{
                kidStatus.add(false) ;
            }
        }
        return kidStatus;
    }
}