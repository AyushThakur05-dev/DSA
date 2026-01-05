class Solution {
    public int beautySum(String str) {
           int beauty = 0;
        for (int i = 0; i < str.length(); i++) {
            int[] ch = new int[26];   // 👈 int, not char

            for (int j = i; j < str.length(); j++) {
                ch[str.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (ch[k] > 0) {
                        max = Math.max(max, ch[k]);
                        min = Math.min(min, ch[k]);
                    }
                }
                beauty += max - min;

            }

        }
        return beauty;
    }
}