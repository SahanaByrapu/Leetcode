class Solution {
    public int numUniqueEmails(String[] emails) {
        
        int index=0;
        HashSet<String> hset = new LinkedHashSet();
        for (String email:emails){
             String []arr=email.split("@");
             index=arr[0].indexOf("+");
             if(index>0)
              arr[0]=arr[0].substring(0,index);
             arr[0]=arr[0].replaceAll("\\.","");
             hset.add(arr[0]+"@"+arr[1]);
        }
        
        return hset.size();
    }
}