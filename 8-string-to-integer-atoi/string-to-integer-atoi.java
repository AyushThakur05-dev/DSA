class Solution {
    public int myAtoi(String s) {
         if (s.isEmpty()) {
            return 0;
        }
        int i = 0;
        //this loop will ignore leading spaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
            if (i>=s.length())
                return 0;
        }
         
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i)=='+') {
            if(s.charAt(i) == '-'){
                sign=-1;
            }
            if(s.charAt(i) == '+'){
                sign=1;
            }
            i++;
        }
        
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i)) ) {

            result = (result * 10) + (s.charAt(i) - '0');
            if (sign*result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign*result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
        }
        
         result =sign*result;

        return (int) result;
    }
}