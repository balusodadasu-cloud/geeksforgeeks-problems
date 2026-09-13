class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if (s1.length() != s2.length() || s1.length() < 2) return false;

                String left = s1.substring(2) + s1.substring(0, 2);
                String right = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);

                return left.equals(s2) || right.equals(s2);
    }
};