class Solution {
    public int redOrGreen(String s) {
        // code here
        char[] arr=s.toCharArray();
        int R=0,G=0;
        for(char c:arr){
            if(c=='R')
                R++;
            else 
                G++;
        }
        return s.length()-Math.max(R,G);
    }
}