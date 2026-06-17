class Solution {
    public int compress(char[] chars) {
        int writePos = 0;
        int start = 0;

        while (start < chars.length) {

            char current = chars[start];
            int end = start;

            while (end < chars.length && chars[end] == current) {
                end++;
            }

            chars[writePos++] = current;

            int count = end - start;

            if (count > 1) {
                String freq = Integer.toString(count);

                for (char digit : freq.toCharArray()) {
                    chars[writePos++] = digit;
                }
            }

            start = end;
        }

        return writePos;
        
    }
}
