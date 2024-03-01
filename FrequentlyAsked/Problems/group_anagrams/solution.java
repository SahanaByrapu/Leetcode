class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length==0)  return new ArrayList();

        int []count=new int[26];
        HashMap<String,ArrayList> ansmap=new HashMap();

        for(String s: strs)
        {
            Arrays.fill(count,0);
            for(Character c:s.toCharArray()) count[c-'a']++;

            StringBuilder sb =new StringBuilder();
            for(int i=0;i<26;i++)
            {
                sb.append('#');
                sb.append(count[i]);
            }

            String r=sb.toString();
            if(!ansmap.containsKey(r)) ansmap.put(r,new ArrayList());
            ansmap.get(r).add(s);

        }

        return new ArrayList(ansmap.values());

    }
}