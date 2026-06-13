class Solution {
    public boolean isSubsequence(String s, String t) {
        int small=0;
        int large=0;
        while(small<s.length() && large<t.length()){
            if(s.charAt(small)==t.charAt(large)){
                small++;
            }
            large++;
        }
        return small==s.length();
        
    }
}
