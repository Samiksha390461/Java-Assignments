class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        } 
        int[] target = new int[26];
        int[] window = new int[26];
        
        for(char ch:s1.toCharArray()){
            target[ch-'a']++;
        }
        int size= s1.length();
        for(int i=0;i<s2.length();i++){
            window[s2.charAt(i)-'a']++;
            if(i>=size){
                window[s2.charAt(i-size)-'a']--;
            }
            if(same(target,window)){
                return true;
            }
        }
        return false;
        
    }

    private boolean same(int[] first, int[] second){
        for(int i=0;i<26;i++){
            if(first[i]!=second[i]){
                return false;
            }
        }
        return true;
    }
}
