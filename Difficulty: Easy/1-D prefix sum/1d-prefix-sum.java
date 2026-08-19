class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // coinde here
        int n=arr.length;
        ArrayList<Integer> l=new ArrayList<>();
        int[] a=new int[n];
        a[0]=arr[0];
        for(int i=1;i<n;i++)
         {
             a[i]=arr[i]+a[i-1];
         }
         for(int i:a){
           l.add(i);
         }
        return l;   
    }
}