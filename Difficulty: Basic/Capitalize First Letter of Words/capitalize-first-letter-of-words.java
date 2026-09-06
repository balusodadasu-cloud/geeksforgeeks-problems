class Solution {
    public String convert(String s) {
        // code here
        String[] a=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(String i:a)
        {
            sb.append(i.substring(0,1).toUpperCase()+i.substring(1)+" ");
        }
        return sb.toString();
    }
};