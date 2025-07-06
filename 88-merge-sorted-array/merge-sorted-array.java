class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
         
       
        int right=0;
        int left=n-1;
        while (left>=0 && right<m){
            if (arr1[left]>=arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;right++;
            }
            else break;;

        }
         for (int i = n ; i< n+m ; i++){
            arr1[i]=arr2[i-n];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}