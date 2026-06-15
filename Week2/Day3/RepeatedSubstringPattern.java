class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int part = 1; part <= n / 2; part++) {

            if (n % part != 0) {
                continue;
            }

            boolean valid = true;

            for (int i = part; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % part)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
        
    }


