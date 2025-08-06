class Solution {
    static int mindistance(int[] arr, int middistance) {
        int count = 1, lastdistance = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastdistance >= middistance) {
                count++;
                lastdistance = arr[i];
            }
        }
        return count;
    }
    public int maxDistance(int[] arr, int k) {
         Arrays.sort(arr);
        int low = 1, high = arr[arr.length - 1] - arr[0], mid=0, call=0, result = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            call = mindistance(arr, mid);
            if (call < k) high = mid - 1;
            else {
                low = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}