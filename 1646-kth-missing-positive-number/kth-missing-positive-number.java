class Solution {
    public int findKthPositive(int[] arr, int k) {
         int low=0,high=arr.length-1,mid=0,cal=0;
        while (low<=high){
            mid=(low+high)/2;
            cal=arr[mid]-(mid+1);
            if (cal<k)low=mid+1;
            else {
                high=mid-1;
            }
        }
        return  high+1+k;
    }
}