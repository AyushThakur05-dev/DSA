class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        char[] c=s.toCharArray();
        int n=c.length;
        for (int i = 0 ; i < n ; i++){
            if (c[i]=='('){
                if(!st.isEmpty()){
                    str.append(c[i]);
                }
                st.push(c[i]);
            }
            if (c[i]==')'){
                st.pop();
                if (!st.isEmpty()){
                    str.append(c[i]);
                }
            }
        }
        return str.toString();
    }
}