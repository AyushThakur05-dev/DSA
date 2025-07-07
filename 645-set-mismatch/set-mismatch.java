class Solution {
    public int[] findErrorNums(int[] arr) {
         int repeating=-1 , missing=-1;
        int[] hasharray=new int[arr.length+1];
        for (int i = 0;i<arr.length;i++){
            hasharray[arr[i]]++;
        }
        for (int i =1;i<hasharray.length;i++){
            if (hasharray[i]==0)missing=i;
            if (hasharray[i]==2)repeating=i;
        }
        int[] result={repeating,missing};
        return result;
    }
    
}
       