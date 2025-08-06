class Solution {
     static int calculate(int[] arr, int num) {
        int sum = 0, students = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= num) {
                sum += arr[i];
            } else {
                students++;
                sum = arr[i];
            }
        }
        return students;
    }
    public int splitArray(int[] arr, int k) {
          int n = arr.length;
        if (k > n) {
            return -1;
        }
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max, high = sum, mid = 0, call = 0, result = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            call = calculate(arr, mid);
            if (call <= k) {
                result = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return result;
    }
}