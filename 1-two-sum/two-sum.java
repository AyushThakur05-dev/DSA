class Solution {
    public int[] twoSum(int[] arr, int target) {
       HashMap<Integer, Integer> hm = new HashMap<>();
        int[] indexes = new int[2];
        for (int j = 0; j < arr.length; j++) {
            int rem = target - arr[j];
            if (hm.containsKey(rem)) {
                indexes[0] = hm.get(rem);
                indexes[1] = j;

            }
            if (!hm.containsKey(rem)) {
                hm.put(arr[j], j);
            }
        }
        return indexes;
    }
}