class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int n=arr.length , m=arr[0].length;
          if (n==1 && m==1){
            if (arr[0][0]==target)
                return true;
            else return false;
        }
        int low=0 , high = (n*m)-1 , mid=0;
        int rows=-1,column=-1;
        while (low<=high){
            mid=(low+high)/2;
            rows=mid/m;column=mid%m;
            if (arr[rows][column]==target)return true;
            else if(arr[rows][column]<target)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}