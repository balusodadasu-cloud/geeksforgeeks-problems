class Solution {
    public int minTime(int[] a, int[] b) {
        // code here
        int n=a.length;
        int min1=0;
        int min2=0;
        for(int i=0;i<n;i++)
        {
            if((i+1)%2==0){
              min1+=a[i];
              min2+=b[i];
            }
            else
            {
                min1+=b[i];
                min2+=a[i];
            }
        }
        if(min1<min2){
            return min1;
        }
        return min2;
    }
}