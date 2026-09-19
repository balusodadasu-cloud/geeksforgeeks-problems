class Solution {
    public ArrayList<Integer> twoSum(int[] a, int t) {
        // code here
        Arrays.sort(a);
        int l=0,r=a.length-1;
        while(l<r)
        {
            int x=a[l]+a[r];
            if(x==t){
ArrayList<Integer> res = new ArrayList<>();
                res.add(l + 1);
                res.add(r + 1);
                return res; 
            }
            else if(x<t)
              l++;
            else 
            {
                r--;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
                res.add(-1);
                res.add(-1);
                return res;
    }
}