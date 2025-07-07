class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int repeat = -1;
        int missing = -1;
        int xorarr = 0;
        int xorton = 0;
        for (int i = 1; i <= n; i++) {
            xorton = xorton ^ i;
        }
        for (int i = 0; i < n; i++) {
            xorton = xorton ^ arr[i];
        }
        int xor = xorarr ^ xorton;
        int number = (xor & ~(xor - 1));
        //creating two groups
        int one = 0;
        int zero = 0;
        //comapring bits of array elements
        for (int i = 0; i < n; i++) {
            if ((arr[i] & number) != 0) {
                one = one ^ arr[i];
            } else
                zero = zero ^ arr[i];
        }
        // now 1 to n
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) one = one ^ i;
            else zero = zero ^ i;
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == one) count++;
        }
        if (count == 2)
           return new int[]{one,zero};
        return new int[]{zero,one};
    }
    
}
       