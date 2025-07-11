class Solution {
    public int findMin(int[] arr) {
        int low = 0, high = arr.length - 1, mid = 0;
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            mid = (low + high) / 2;
            
            if (arr[low]  <= arr[high]) {
                min = Math.min(min, arr[low]);
                break;
            }
             if (arr[low] > arr[mid]) {
                min = Math.min(min, arr[mid]);
                high = mid - 1;

            } else if (arr[mid] > arr[high]) {
                low = mid + 1;
            }
            
             if(arr[low]>=arr[mid]&&arr[mid]<=arr[high]){
                min=Math.min(min,arr[mid]);
                break;
            }
           


        }
        return min;
    }
}