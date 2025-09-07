class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int n=arr.length,m=arr[0].length;
        int countcolumn=m-1,countrow=n-1,row=0,column=m-1;
        while (countcolumn>=0 && countrow>=0){
            if (arr[row][column]==target)
                return true;
            else if (arr[row][column]<target) {
                row++;
                countrow--;
            }
            else {
                column--;
                countcolumn--;
            }

        }
        return false;
    }
}