class Solution {
    public static void utility(String s) {
        // code here
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2==0)
              System.out.print(ch);
        }
    }
}