class Solution {
    static String encryptString(String S) {
        // code here
        StringBuilder ans=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
            char ch=S.charAt(i);
            int count=0;
            while(i>=0 && ch==S.charAt(i)){
                 count++;
                 i--;
            }
                 i++;
            String hex=Integer.toHexString(count);
                   ans.append(hex);
                   ans.append(ch);
               }
               return ans.toString();
    }
};