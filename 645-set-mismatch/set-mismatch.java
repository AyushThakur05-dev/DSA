class Solution {
    public int[] findErrorNums(int[] arr) {
         int repeat=-1,absent=-1;
        int n= arr.length;
        int count=0;
        for (int i = 1;i<=n ; i++){
            for (int j = 0 ; j< n ; j ++){
                if (i==arr[j])count++;
            }
            if (count==2)repeat=i;
            else if (count==0)absent=i;
            count=0;

        }int[] result={repeat,absent};
        return result;
    }
}