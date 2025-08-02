class Solution {
     static int possibility(int[] arr , int day,int k){
        int count =0,total=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=day)count++;
            else {
                total=total+(count/k);
                count=0;
            }
        }total=total+(count/k);
        count=0;
        return total;
    }
    public int minDays(int[] arr, int m, int k) {
         //IMPOSSIBLE CASE
        int n=arr.length;
        long check=(long)m*k;
        if (n<check){
            return -1;
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int result=-1;
        int low = min, high = max, mid = 0, call = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            call = possibility(arr, mid, k);
            if (call < m) low = mid + 1;
            else if (call >= m) {
                high = mid - 1;
                result=mid;
            }

        }
        return result;
    }
}