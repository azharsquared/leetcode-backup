class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int[] sMap = new int[26];
        int[] tMap = new int[26];
        if(sCharArray.length != tCharArray.length){
            return false;
        }
        for(int i = 0; i<sCharArray.length;i++){
        sMap[122-sCharArray[i]] = sMap[122-sCharArray[i]] + 1;
        }
         for(int i = 0; i<tCharArray.length;i++){
            tMap[122-tCharArray[i]] = tMap[122-tCharArray[i]] + 1;
        }
        for(int i = 0 ; i < 26 ; i++ ){
          if(sMap[i] != tMap[i]){
              return false;
          }
        }
        return true;
    }
}