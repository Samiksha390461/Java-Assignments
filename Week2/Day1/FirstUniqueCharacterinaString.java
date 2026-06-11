class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> countMap = new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            countMap.put(ch,countMap.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:countMap.entrySet()){
            if(entry.getValue()==1){
                return s.indexOf(entry.getKey());
            }
        }
        return -1;
        
    }
}
