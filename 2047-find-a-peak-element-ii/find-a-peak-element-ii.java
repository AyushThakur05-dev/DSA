class Solution {
    public int[] findPeakGrid(int[][] arr) {
        int n=arr.length , m=arr[0].length;
        int[] result=new int[2];
        int left=-1,right=-1,up=-1,down=-1;
        for (int i =0 ; i< n ; i++){
            for (int j =0 ; j<m ; j++){
                up = (i>0) ? arr[i-1][j] : Integer.MIN_VALUE;
                down = (i<(n-1)) ? arr[i+1][j] : Integer.MIN_VALUE;
                left = (j>0) ? arr[i][j-1] : Integer.MIN_VALUE;
                right = (j<(m-1)) ? arr[i][j+1] : Integer.MIN_VALUE;
                if (arr[i][j]>up && arr[i][j]>down && arr[i][j]>left && arr[i][j]>right){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}