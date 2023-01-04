class Solution {
    public int countDigits(int num) {
        int digit = num;
        int count = 0;
        while(digit > 0){
            if(num % (digit % 10) == 0)
                count++;
            digit = digit/10;
        }
        return count;
    }
}