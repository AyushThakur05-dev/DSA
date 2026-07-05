class Solution {
    public int maxValidPairSum(int[] nums, int k) {

        int n = nums.length;

        int maxElement = nums[0];
        int maxSum = Integer.MIN_VALUE;

        for (int j = k; j < n; j++) {

            // Include the newly valid element
            maxElement = Math.max(maxElement, nums[j - k]);

            // Calculate best possible sum for this j
            maxSum = Math.max(maxSum, maxElement + nums[j]);
        }

        return maxSum;
    }
}