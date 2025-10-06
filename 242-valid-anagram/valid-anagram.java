class Solution {
    public boolean isAnagram(String s1, String s2) {
          if (s1.length()!=s2.length())
            return false;
        int[] arr=new int[256];
        for (int i = 0 ;i <s1.length() ; i++){
            arr[s1.charAt(i)]++;
        }
        for (int i = 0 ; i<s2.length() ; i++){
            if (arr[s2.charAt(i)]==0)
                return false;
            else
                arr[s2.charAt(i)]--;
        }
        return true;
    }
}