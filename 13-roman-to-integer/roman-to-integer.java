class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int current =0 , prev=0 , integer=0;
        for (int i =ch.length-1 ; i>=0 ; i--){
            current=hm.get(ch[i]);
            if (current>=prev){
                integer+=current;
            }
            else{
                integer-=current;
            }
            prev=current;
        }
        return  integer;
    }
}