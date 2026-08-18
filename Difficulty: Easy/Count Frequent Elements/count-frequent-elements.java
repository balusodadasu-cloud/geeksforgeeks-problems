class Solution {
    public int countOccurence(int[] arr, int k) {
        // code here
        int n=arr.length;
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr)
          m.put(i,m.getOrDefault(i,0)+1);
        
        int d=n/k;
        int c=0;
        for(int i:m.keySet()){
          if(m.get(i)>d)
               c++;
        } 
        return c;
    }
}