class Solution {
    public int[] getFloorAndCeil(int x, int[] a) {
        // code here
        int n=a.length;
        Arrays.sort(a);
        int f=-1;
        int c=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && c==-1)
               c=a[i];
        
        if(a[i]<=x)
          f=a[i];
        }
        return new int[]{f,c};  
    }
}
