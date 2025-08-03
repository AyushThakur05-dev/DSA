class Solution {
    static int packagecheck(int[] arr, int weight) {
        int day = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > weight) {
                day++;
                sum = 0;
                sum = sum + arr[i];
            }
        }
        day++;
        return day;
    }

    public int shipWithinDays(int[] arr, int days) {
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int result = 0;
        int low = max, high = (int) sum, mid = 0, call = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            call = packagecheck(arr, mid);
            if (call <= days) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}