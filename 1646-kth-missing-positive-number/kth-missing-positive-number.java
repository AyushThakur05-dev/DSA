class Solution {
    public int findKthPositive(int[] arr, int num) {
         for (int i =0 ; i < arr.length ; i++){
            if (arr[i]<=num)num++;
            else break;
        }
        return num;
    }
}