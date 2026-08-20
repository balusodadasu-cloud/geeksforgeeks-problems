class Solution {
    public boolean isPerfect(int[] a) {
        // code here
        int n=a.length;
        int s=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
             {
                 if(s>1)
                   return false;
                   s=1;
             }
             else if(a[i]==a[i+1])
             {
                 if(s==2)
                   continue;
                   s=2;
             }
             else
               s=3;
        }
        return true;
    }
}
