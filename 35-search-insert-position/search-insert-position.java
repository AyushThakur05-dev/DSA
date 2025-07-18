class Solution {
    public int searchInsert(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int ans=arr.length;
        while(low<=high){
            mid=(low+high)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {

                ans=mid;
                high = mid - 1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
}