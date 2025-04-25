class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        String s = str[0];

        for (int i = 1; i < str.length; i++) {
            while (!str[i].startsWith(s)) {
                s = s.substring(0, s.length() - 1);
                if (s.isEmpty()) return "";
            }
        }

        return s;
    }
}
