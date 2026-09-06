class Solution {
    int isSame(String s) {
        // code here
        int len=0;
        int num=0;
        char[]arr=s.toCharArray();
         for(char c:arr)
            {
                if(c>='a')
                  len++;
                else if(c>='0'&&c<='9')
                   num=(num*10)+(c-'0');
            }
        return len==num?1:0;
    }
}