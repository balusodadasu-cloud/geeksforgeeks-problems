class Solution {
    int unvisitedLeaves(int arr[], int k) {
        // code here
      boolean[] v=new boolean[k+1];
      for(int i:arr)
      {
          for(int j=i;j<=k;j=j+i)
          {
              v[j]=true;
          }
      }
      int c=0;
      for(int i=1;i<=k;i++)
      {
          if(!v[i])
            c++;
      }
      return c;
    }
}