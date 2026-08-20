class Solution {
    public static void zigZag(int[] a) {
        // code here
        int n=a.length;
        for(int i=0;i<n-1;i++) {
            if (i%2==0) {
                if(a[i]>a[i+1]) 
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            } 
            else {
                if(a[i]<a[i+1])
                {
                    int t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
    }
}
