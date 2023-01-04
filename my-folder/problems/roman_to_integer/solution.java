class Solution {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int total = 0;
        for(int i=c.length -1 ;i>=0;i--){
                switch(c[i]){
                    case 'I':
                        total = total + 1;
                        break;
                    case 'V':
                        if((i-1 >= 0) && c[i-1] == 'I'){
                            total = total + 4;
                            i--;
                        }else{
                            total = total + 5;
                        }
                        break;
                    case 'X':
                        if((i-1 >= 0) && c[i-1] == 'I'){
                            total = total + 9;
                            i--;
                            }else{
                            total = total + 10;
                        }
                        break;
                    case 'L':
                        if((i-1 >= 0) && c[i-1] == 'X'){
                            total = total + 40;
                            i--;
                            }else{
                            total = total + 50;
                        }
                        break;
                    case 'C':
                        if((i-1 >= 0) && c[i-1] == 'X'){
                            total = total + 90;
                            i--;
                                }else{
                            total = total + 100;
                        }
                        break;
                    case 'D':
                        if((i-1 >= 0) && c[i-1] == 'C'){
                            total = total + 400;
                            i--;
                                }else{
                            total = total + 500;
                        }
                        break;
                    case 'M':
                        if((i-1 >= 0) && c[i-1] == 'C'){
                            total = total + 900;
                            i--;
                        }else{
                            total = total + 1000;
                        }
                        break;
                    default:
                    break;
                }
        }
        return total;
    }
}