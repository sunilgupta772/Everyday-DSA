class Solution {
    public int compress(char[] chars) {
        int k = 0;
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[k++] = chars[i - 1];
                if (count > 1) {
                    String str = String.valueOf(count);

                    for (int j = 0; j < str.length(); j++) {
                        chars[k++] = str.charAt(j);
                    }
                }
                count = 1;
            }
        }
        return k;
    }
}