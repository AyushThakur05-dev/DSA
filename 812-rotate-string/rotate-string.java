class Solution {
    public boolean rotateString(String s1, String s2) {
       if (s1.length()!=s2.length())
            return false;
       String result=s1+s1;
       return result.contains(s2);
    }
    
}