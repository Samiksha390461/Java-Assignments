class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> expected = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            switch (ch) {
                case '(':
                    expected.push(')');
                    break;

                case '{':
                    expected.push('}');
                    break;

                case '[':
                    expected.push(']');
                    break;

                default:
                    if (expected.isEmpty() || expected.pop() != ch) {
                        return false;
                    }
            }
        }

        return expected.isEmpty();
        
    }
}
