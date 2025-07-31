class Solution {
    static long CeilingValue(int[] arr ,  long mid ){
        double div=0;
        long sum=0;
        for (int i=0;i<arr.length;i++){
            div=(double)arr[i]/mid;
            sum=sum+(int)(Math.ceil(div));
        }
        return sum;
    }
    public int minEatingSpeed(int[] arr, int hours) {
         int max=arr[0];
        for (int c : arr){
            max=Math.max(max,c);
        }
        long low=1,high=max,mid=0,answer=0,result=0;
        while (low<=high){
            mid=(low+high)/2;
            answer=CeilingValue(arr,mid);
            if (answer>hours)low=mid+1;
            else if (answer<=hours) {
                result=mid;
                high=mid-1;
            }
        }
        return (int)result;
    }
}