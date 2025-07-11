class Solution {
    public boolean search(int[] arr, int target) {
         int low = 0, high = arr.length-1, mid = 0;
         
        while (low <= high) {
            //first checking which part is sorted
            mid = (low + high) / 2;
             if (arr[low]==arr[mid] && arr[mid]==arr[high]){
                if (arr[mid]==target){
                    return true;
                }
                low++;
                high--;
            }
            else if (arr[low] <= arr[mid]) {
                //means left half  is sorted array
                if (arr[low] <= target && target <= arr[mid]) {
                    if (arr[mid] == target) {
                        return true;
                    }
                    high = mid - 1;
                } else low = mid + 1;

            } else if (arr[mid] <= arr[high]) {
                //means right half is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    if (arr[mid] == target) {
                        return true;
                    }
                    low = mid + 1;
                } else high = mid - 1;
            }

        }
        return false;
    }
}