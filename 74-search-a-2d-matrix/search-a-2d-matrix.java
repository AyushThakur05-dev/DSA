class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int n=arr.length , m=arr[0].length ,  row=-1;
        if (n==1 && m==1){
            if (arr[0][0]==target)
                return true;
            else return false;
        }
        for (int i=0;i<n;i++){
            if (arr[i][0]<=target && arr[i][m-1]>=target){
                row=i;
            }
        }
        if (row==-1)return false;
        int low=0,high=arr[row].length,mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if (arr[row][mid]==target)return true;
            else if (arr[row][mid]<target) {
                low=mid+1;
            }
            else high=mid-1;
        }
        return false;
    }
}