class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
                int i=0;
                while(i<s.length())
                {
                    char ch=s.charAt(i);
                    int c=0;
                    while(i<s.length() && s.charAt(i)==ch)
                    {
                        c++;
                        i++;
                    }
                sb.append(ch);
                sb.append(c);
                }

                return sb.toString();
    }
}