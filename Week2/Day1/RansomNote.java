class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder source = new StringBuilder(magazine);
        for(char ch:ransomNote.toCharArray()){
            int pos = source.indexOf(String.valueOf(ch));
            if(pos==-1){
                return false;
            }
            source.deleteCharAt(pos);
        }
        return true;
        
    }
}
