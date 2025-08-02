class Solution {
     static int divresult(int[] arr, int tester) {
        double div = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            div = (double) arr[i] / tester;
            sum = sum + Math.ceil(div);
        }
        return (int) sum;
    }
    public int smallestDivisor(int[] arr, int threshold) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int low =1, high = max, mid = 0, call = 0, result = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            call = divresult(arr, mid);
            if  (call <= threshold) {
                high = mid - 1;
                result=mid;
            }
            else  {
                low=mid+1;
            }
        }
        return result;
    }
}