class Solution {
    public String removeOuterParentheses(String s) {
          StringBuilder str=new StringBuilder();
        int count=0;
        int n=s.length();
        for (int i =0;i<n ; i++){
            char ch=s.charAt(i);
            if (ch=='('){
                if (count>0){
                    str.append(ch);
                }
                count++;
            }
            if (ch==')'){
                if (count>1){
                    str.append(ch);
                }
                count--;
            }
        }
        return str.toString();
    }
}