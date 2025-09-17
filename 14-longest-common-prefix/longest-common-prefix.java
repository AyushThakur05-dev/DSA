class Solution {
    public String longestCommonPrefix(String[] str) {
         Arrays.sort(str);
        String str1=str[0];
        String str2=str[str.length-1];
        StringBuilder sb=new StringBuilder();
        int i=0;
        while ((i<str1.length()) && (i<str2.length())){
            boolean check=str1.charAt(i)==str2.charAt(i);
            if (check){
                 sb.append(str1.charAt(i));
            }
            else break;
            i++;
        }
        return sb.toString();
    }
}