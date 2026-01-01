class Solution {
    public String frequencySort(String s) {
          Map<Character,Integer> mp=new HashMap<>();
        for (int i = 0 ; i<s.length() ; i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
                (a,b)->b.getValue()-a.getValue()
        );
        pq.addAll(mp.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            Map.Entry<Character,Integer> entry = pq.poll();//this will poll in char , int format
            //now applying on that specific character appearing no of times and add to string builder
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
    }
}