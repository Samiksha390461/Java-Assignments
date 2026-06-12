class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> lastSeen = new HashMap<>();
        int start=0;
        int answer=0;
        for(int end=0;end<s.length();end++){
            char current = s.charAt(end);
            if(lastSeen.containsKey(current) && lastSeen.get(current)>=start){
                start= lastSeen.get(current)+1;
            }
            lastSeen.put(current,end);

            int windowLength = end-start+1;
            answer = Math.max(answer,windowLength);
        }
        return answer;
        
    }
}
