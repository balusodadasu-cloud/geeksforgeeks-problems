class Solution {
    public String modify(String s) {
        // code here
        char[] sb=s.toCharArray();
               int left=0;
               int rigth=s.length()-1;
               while(left<rigth)
                {
                 while(left<rigth && sb[left]!='a' && sb[left]!='e' && sb[left]!='i' && sb[left]!='o' && sb[left]!='u')
                  {
                    left++;
                   }
                 while(left<rigth&& sb[rigth]!='a' && sb[rigth]!='e' && sb[rigth]!='i' && sb[rigth]!='o' && sb[rigth]!='u')
                  {
                      rigth--;
                  }
                  {
                    char t=sb[left];
                    sb[left]=sb[rigth];
                    sb[rigth]=t;
                      left++;
                      rigth--;
                 }
                }
               return new String(sb); 
            
    }
}