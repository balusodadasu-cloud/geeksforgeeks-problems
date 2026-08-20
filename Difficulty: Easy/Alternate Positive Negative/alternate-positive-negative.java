class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> N=new ArrayList<>();
        for(int s:arr)
        {
            if(s>=0)
             p.add(s);
            else 
             N.add(s);
        }
        int i=0,j=0,n=0;
        while(j<p.size() && n<N.size())
        {
            arr.set(i++,p.get(j++));
            arr.set(i++,N.get(n++));
        }
        while(j<p.size())
          arr.set(i++,p.get(j++));
          
        while(n<N.size())
           arr.set(i++,N.get(n++));
        
    }
}