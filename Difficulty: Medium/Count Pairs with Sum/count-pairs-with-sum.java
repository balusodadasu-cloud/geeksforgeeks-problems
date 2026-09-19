class Solution {
    int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
                 int count=0;
                 for(int i:arr){
                     count+=hm.getOrDefault(target-i,0);
                     hm.put(i,hm.getOrDefault(i,0)+1);
                 }
                 return count;
    }
}