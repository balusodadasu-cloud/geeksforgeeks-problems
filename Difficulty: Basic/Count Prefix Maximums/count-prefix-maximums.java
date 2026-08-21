class Solution {
    public int countElements(int[] arr) {
        // code
        int n=arr.length;
        int max=arr[0];
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max){
             c++;
             max=arr[i];
            }
        }
        return c;
    }
}
