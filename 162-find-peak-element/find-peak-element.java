class Solution {
    public int findPeakElement(int[] arr) {
         int low = 1, high = arr.length - 2, mid = 0;
        int maximum = Integer.MIN_VALUE;
        int index = -1;
        if (arr.length == 1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1]) return mid;

            if (arr[mid + 1] > arr[mid]) low = mid + 1;

            else if (arr[mid - 1] > arr[mid]) high = mid - 1;
        }
        return -1;
    }
}