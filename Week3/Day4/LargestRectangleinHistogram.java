class Solution {
    public int largestRectangleArea(int[] heights) {
        ArrayDeque<Integer> indexStack = new ArrayDeque<>();
        int answer = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!indexStack.isEmpty() &&
                    heights[indexStack.peek()] >= currentHeight) {

                int height = heights[indexStack.pop()];

                int leftBoundary = indexStack.isEmpty()
                        ? -1
                        : indexStack.peek();

                int width = i - leftBoundary - 1;

                answer = Math.max(answer, height * width);
            }

            indexStack.push(i);
        }

        return answer;
        
    }
}
