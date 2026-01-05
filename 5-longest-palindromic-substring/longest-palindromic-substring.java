class Solution {
    public String longestPalindrome(String str) {
         String result = new String();
        for (int i = 0; i < str.length(); i++) {
            String odd = check(str, i, i);// checks odd
            String even = check(str, i, i + 1);//checks even
            if (odd.length() > result.length())
                result = odd;
            if (even.length() > result.length())
                result = even;
        }
        return result;
    }

    static String check(String str, int left, int right) {
        while ((left >= 0 && right < str.length()) && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}