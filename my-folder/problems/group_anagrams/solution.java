class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            if(map.containsKey(sort(strs[i]))){
                map.get(sort(strs[i])).add(strs[i]);
            }else{
                map.put(sort(strs[i]), new ArrayList(Arrays.asList(strs[i])));
            }
        }
        return new ArrayList(map.values());
    }

    public String sort(String str){
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}