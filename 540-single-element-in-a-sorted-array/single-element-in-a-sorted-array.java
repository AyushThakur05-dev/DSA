class Solution {
    public int singleNonDuplicate(int[] arr) {
         int low=1,high= arr.length-2,mid=0;
        int ans=-1;
        int tracker=0;
        if (arr.length==1){
                return arr[0];
            } 
        while (low<=high){
            mid=(low+high)/2;
            ans=arr[mid];
             if (arr[tracker]!=arr[low] || arr[arr.length-1-tracker]!=arr[high]){
                if (arr[tracker]!=arr[low]){
                    ans=arr[tracker];
                    break;
                }
                if (arr[arr.length-1-tracker]!=arr[high]){
                    ans=arr[arr.length-1-tracker];
                    break;
                }
                break;
            } else if (arr[tracker]==arr[low] || arr[arr.length-1-tracker]==arr[high]) {
                if (arr[tracker]==arr[low]){
                    low=low+2;
                }
                if (arr[arr.length-1-tracker]==arr[high]){
                    high=high-2;
                }
                tracker=tracker+2;

            }
        }
        return ans;
    }
    
}