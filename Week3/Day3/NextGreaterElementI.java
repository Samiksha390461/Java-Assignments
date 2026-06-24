class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextValue = new HashMap<>();
        Deque<Integer> pending = new ArrayDeque<>();

        for (int num : nums2) {

            while (!pending.isEmpty() && pending.peek() < num) {
                nextValue.put(pending.pop(), num);
            }

            pending.push(num);
        }

        while (!pending.isEmpty()) {
            nextValue.put(pending.pop(), -1);
        }

        int[] answer = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            answer[i] = nextValue.get(nums1[i]);
        }

        return answer;
        
    }
}
