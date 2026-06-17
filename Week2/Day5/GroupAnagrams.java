class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new LinkedHashMap<>();

        for (String word : strs) {

            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder signature = new StringBuilder();

            for (int count : freq) {
                signature.append('#').append(count);
            }

            String key = signature.toString();

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(groups.values());
        
    }
}
