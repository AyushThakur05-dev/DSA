class Solution {
    public String reverseWords(String str) {
        String s = "";
        Stack<String> st = new Stack<>();
        String temp = "";
          int count=0;
       
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                temp = temp + c;
                count++;
            }
            if (c==' ' && count>0){
                st.push(temp);
                temp="";
                count=0;
            }
        }
        if (!temp.isEmpty()) {
            st.push(temp);
        }
        while (st.size() > 1) {
            s += st.pop() + " ";
        }
        s += st.pop();
        return s;
    }
}