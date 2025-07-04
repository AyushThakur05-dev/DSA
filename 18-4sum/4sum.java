class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
         List<List<Integer>> result = new ArrayList<>();
       HashSet<Long> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    long sum = arr[i] + arr[j] ;
                    sum+=arr[k];
                    long rem = target - sum;
                    if (hs.contains(rem)) {
                        List<Integer> al = Arrays.asList(arr[i], arr[j], arr[k], (int)rem);
                        al.sort(null);
                        if (!result.contains(al)) {
                            result.add(al);
                        }
                    } hs.add((long)arr[k]);

                }
                hs.clear();
            }
        }
        return result;
    }
}