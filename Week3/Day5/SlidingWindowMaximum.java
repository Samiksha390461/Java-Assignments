class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];
        ArrayDeque<Integer> window = new ArrayDeque<>();

        int index = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!window.isEmpty() &&
                    nums[window.peekLast()] <= nums[right]) {
                window.pollLast();
            }

            window.offerLast(right);

            int left = right - k + 1;

            if (window.peekFirst() < left) {
                window.pollFirst();
            }

            if (left >= 0) {
                result[index++] = nums[window.peekFirst()];
            }
        }

        return result;
    }
}
