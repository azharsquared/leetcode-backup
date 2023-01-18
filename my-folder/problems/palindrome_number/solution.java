class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x ;
        while(temp > 0){
            int val = temp % 10;
            temp = temp /10;
            rev = (rev * 10) + val;
        }
        if(rev == x){
            return true;
        }
        return false;
    }
}