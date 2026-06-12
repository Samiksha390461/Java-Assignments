class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();

        if(p.length()>s.length()){
            return result;
        }
        HashMap<Character,Integer> target = new HashMap<>();
        HashMap<Character,Integer> current = new HashMap<>();

        for(char ch:p.toCharArray()){
            target.put(ch,target.getOrDefault(ch,0)+1);
        }
        int left=0;
        for(int right=0;right<s.length();right++){
            char add = s.charAt(right);
            current.put(add,current.getOrDefault(add,0)+1);
            if(right-left +1 > p.length()){
                char remove = s.charAt(left);
                current.put(remove,current.get(remove)-1);
                if(current.get(remove)==0){
                    current.remove(remove);
                }
                left++;
            }
            if(current.equals(target)){
                result.add(left);
            }

        }
        return result;
    }
}
