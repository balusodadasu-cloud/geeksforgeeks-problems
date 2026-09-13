class Solution {
    public static boolean checkPangram(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
                for(int i=0; i<s.length(); i++){
                    char c = Character.toLowerCase(s.charAt(i));
                    if(c >= 'a' && c <= 'z')
                        set.add(c);
                }
                if(set.size() == 26){
                    return true;
                }
                return false;
    }
}