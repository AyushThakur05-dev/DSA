class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n=arr.length , m=arr[0].length;
       int low=0 , high = m-1 , midcolumn=-1;
        int left=-1,right=-1,up=-1,down=-1,index=-1;
        int[] result=new int[2];
        while (low<=high){
            midcolumn=(low+high)/2;
            int  max=Integer.MIN_VALUE;
            for (int i =0 ;i<n ; i++){
                if (arr[i][midcolumn]>=max){
                    max=arr[i][midcolumn];
                    index=i;
                }
            }
            up=(index>0) ? arr[index-1][midcolumn] : Integer.MIN_VALUE;
            down=(index<n-1) ? arr[index+1][midcolumn] : Integer.MIN_VALUE;
            left=(midcolumn>0) ? arr[index][midcolumn-1] : Integer.MIN_VALUE;
            right=(midcolumn<m-1) ? arr[index][midcolumn+1] : Integer.MIN_VALUE;
            if (arr[index][midcolumn]>left && arr[index][midcolumn]>right){
                result[0]=index;
                result[1]=midcolumn;
                break;
            } else if (arr[index][midcolumn]<left) {
                high=midcolumn-1;
            } else if (arr[index][midcolumn]<right) {
                low=midcolumn+1;
            }

        }
        return result;
    }
}