public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        /*StringBuilder sb =new StringBuilder();

        for(String s :strs)
        {
            sb.append('#');
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();*/

        StringBuilder encoded = new StringBuilder();
        for (String str : strs) 
            encoded.append(str.length()).append("#").append(str);
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        List<String> ans=new ArrayList();
        StringBuilder sb;
        int endIndex=0;

        while (endIndex != s.length()) {
            int colonIndex = s.indexOf("#", endIndex);
            int wordLength = Integer.parseInt(s.substring(endIndex, colonIndex)); 
            endIndex = colonIndex + 1 + wordLength;
            ans.add(s.substring(colonIndex + 1, endIndex));
        }
       
       return ans;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));