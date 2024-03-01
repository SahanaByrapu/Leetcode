class Solution {
     //Depth-First search
    Map<Character, ArrayList<Character>> reverseAdjList= new HashMap<>();
    Map<Character,Boolean> visited= new HashMap<>();
    StringBuilder sb =new StringBuilder();
    public String alienOrder(String[] words) {
    
    //step 0: adding unique letters into reverserAdjList as keys

    for(String word:words)
    {
        for(char c:word.toCharArray())
            reverseAdjList.put(c,new ArrayList<Character>());
        
    }

    //step 1: Find all edges that are adjacent and add to reverseAdjList
    for(int i=0;i<words.length-1;i++)
    {
        String word1=words[i];
        String word2=words[i+1];

        //check that word2 is not a prefix of word1
        if(word1.length()>word2.length() && word1.startsWith(word2))
          return "";

        //Find the first non-match and insert corresponding relation
        for(int j=0;j<Math.min(word1.length(),word2.length());j++)
        {
            if(word1.charAt(j)!=word2.charAt(j))
               {
                  reverseAdjList.get(word2.charAt(j)).add(word1.charAt(j));
                  break;
               } 

        }


    }

    

    //step 2: depth-first search
    for(Character ch:reverseAdjList.keySet())
    {
        boolean result=DFS(ch);
        if(!result) return "";
    }

    return sb.toString();
    
    }

    public boolean DFS(Character ch)
    {
        if(visited.containsKey(ch))
           return visited.get(ch);

        visited.put(ch,false);

        for(Character next:reverseAdjList.get(ch))
            {
                boolean result= DFS(next);
                if(!result) return false;
            }

        visited.put(ch,true);

        sb.append(ch);

        return true;

    }
    //Breadth-First search
    /*    
    //step 0: create datastructure and find all unique letters
    HashMap<Character,ArrayList<Character>> adjList = new HashMap();
    Map<Character,Integer> count=new HashMap(); 
    for (String word : words)
    {
       for(char c: word.toCharArray())
           {
               count.put(c,0);
               adjList.put(c,new ArrayList<Character>());
           }
    }

    //step 1: Find all edges
    for(int i=0;i<words.length-1;i++)
    {
       String word1= words[i];
       String word2= words[i+1];

       if(word1.length() > word2.length() && word1.startsWith(word2))
             return "";
        
       for(int j=0;j<Math.min(word1.length(),word2.length());j++)
       {
           if(word1.charAt(j)!=word2.charAt(j))
           {
               adjList.get(word1.charAt(j)).add(word2.charAt(j));
               count.put(word2.charAt(j),count.get(word2.charAt(j))+1);
               break;
           }
       }
     }

    //step 2 : Breadth-First search

    StringBuilder sb =new StringBuilder();
    Queue<Character> queue=new LinkedList();

    for(Character c:count.keySet())
    {
        if(count.get(c).equals(0))
            queue.add(c);
    }

    while(!queue.isEmpty())
    {
        Character ch=queue.remove();
        sb.append(ch);
        for(Character adj:adjList.get(ch))
        { 
            count.put(adj,count.get(adj)-1);
            if(count.get(adj).equals(0))
               queue.add(adj);
        }

    }

    if(sb.length() < count.size())
       return "";*/

    

    
}