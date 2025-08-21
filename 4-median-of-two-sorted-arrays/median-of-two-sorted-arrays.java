class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
         int n=arr1.length;
        int m=arr2.length;
        if (m<n){
            return findMedianSortedArrays(arr2,arr1);
        }
        int totallength=n+m , half=(totallength)/2;
       
        int low=0,high=n,mid=0,min=0,max=0;

        while (low<=high){
            mid=(low+high)/2;
            int cut2 = half - mid;
           int l1 = (mid == 0) ? Integer.MIN_VALUE : arr1[mid - 1];
            int r1 = (mid == n) ? Integer.MAX_VALUE : arr1[mid];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r2 = (cut2 == m) ? Integer.MAX_VALUE : arr2[cut2];
            if (l1>r2)high=mid-1;//means l1 is gretaer than r2 , means we have to remove that value of l1 and get  any value beofre it.so it can be done by decreasing mid from 2 to 1 , so it will take only one element from arr1
            else if (l2>r1)low=mid+1;//if l2 is gretaer tha r1 , means our mid requires to be  more from 2 to 3 or more by adjusting low=mid+1;
            else{
                max=Math.max(l1,l2);
                min=Math.min(r1,r2);
                break;
            }

        }
        if (totallength%2==1)
            return min;
        return (double) (max+min)/2;
    }
}