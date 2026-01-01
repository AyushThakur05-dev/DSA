class Solution {
    public int maxDepth(String str) {
         int maxdepth=0,depth=0,opened=0,closed=0;
        char[] ch=str.toCharArray();
        for (int i =0;i<ch.length ; i++){
            if(ch[i]=='('){
                depth++;
                opened++;
            }
            if (ch[i]==')'){
                closed++;
                opened--;
                depth--;

            }
            maxdepth=Math.max(maxdepth,depth);
        }
        return maxdepth;
    }
}