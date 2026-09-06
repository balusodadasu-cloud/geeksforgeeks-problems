class Solution {
    String removeVowels(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";
        for(char ch : vowels.toCharArray()){
                    set.add(ch);
         }
        for(int i = 0 ; i < s.length() ; i++){

            if(!set.contains(s.charAt(i))){

                sb.append(s.charAt(i));
                    }
                }
                return sb.toString();
    }
}