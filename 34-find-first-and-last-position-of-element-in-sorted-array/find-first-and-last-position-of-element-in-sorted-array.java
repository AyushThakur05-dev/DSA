class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lower(nums, target);
        int last = upper(nums, target) - 1;

        // If first is out of bounds or not equal to target, target is not present
        if (first >= nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }

    // Lower Bound: First index where arr[i] >= target
    static int lower(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Upper Bound: First index where arr[i] > target
    static int upper(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
