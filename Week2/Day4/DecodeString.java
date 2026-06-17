class Solution {
    private int pos = 0;
    public String decodeString(String s) {
        return buildString(s);
    }
    private String buildString(String s) {
        StringBuilder result = new StringBuilder();

        while (pos < s.length() && s.charAt(pos) != ']') {

            char ch = s.charAt(pos);

            if (Character.isLetter(ch)) {
                result.append(ch);
                pos++;
            } else {

                int repeat = 0;
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    repeat = repeat * 10 + (s.charAt(pos) - '0');
                    pos++;
                }

                pos++; // skip '['

                String inner = buildString(s);

                pos++; // skip ']'

                while (repeat-- > 0) {
                    result.append(inner);
                }
            }
        }

        return result.toString();
        
    }
}
