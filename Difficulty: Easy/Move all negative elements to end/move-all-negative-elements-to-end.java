class Solution {
    public void segregateElements(int[] a) {
        // code here
        int n=a.length;
        int m=0;
        int[] t=new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]>=0)
             {
                t[m]=a[i];
                 m++;
             }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
             {
                t[m]=a[i];
                 m++;
             }
        }
        for(int i=0;i<n;i++)
        {
            a[i]=t[i];
        }
    }
}