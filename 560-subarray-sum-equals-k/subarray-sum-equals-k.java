class Solution {
    public int subarraySum(int[] arr, int k) {
       int n = arr.length;
        int rem = 0, sum = 0, count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));
        for (int j = 0; j < n; j++) {
           sum=prefix[j];
           if (sum==k)count++;

           rem =sum-k;
           if (hm.containsKey(rem)){
               count=count+hm.get(rem);
           }
           
             hm.put(sum,hm.getOrDefault(sum,0)+1);
           
        }
        return count;
    }
}