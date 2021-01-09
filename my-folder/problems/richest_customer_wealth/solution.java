class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int customer = 0; customer < accounts.length;customer++){
            int individualWealth = 0;
           for(int account = 0; account < accounts[customer].length;account++){
            individualWealth = individualWealth + accounts[customer][account];
            }  
            if(individualWealth > maxWealth){
                maxWealth = individualWealth;
            }
        }
        return maxWealth;
    }
}