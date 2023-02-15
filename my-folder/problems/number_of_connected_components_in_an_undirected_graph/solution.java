class Solution {
    public int countComponents(int n, int[][] edges) {

     List<List<Integer>> adjlist= new ArrayList<List<Integer>>();
     for(int i=0;i<n;i++)
        adjlist.add(new ArrayList<>());
    
     for(int[]edge:edges)
     {
         adjlist.get(edge[0]).add(edge[1]);
         adjlist.get(edge[1]).add(edge[0]);
     }
     
     int[]visited=new int[n];
     Stack<Integer> stack = new Stack();
   
     int components=0;     

     for(int i=0;i<n;i++)
     {
       
       if(visited[i]==0)
       {
            stack.push(i);
            visited[i]=1;
            components++;
            System.out.println("Hello components!"+components);
            while(!stack.isEmpty())
             {
              int node=stack.pop();
              System.out.println("Hello!"+node);
              for(int neighbor:adjlist.get(node))
                { if(visited[neighbor]==0)
                     {
                    stack.push(neighbor);
                    visited[neighbor]=1; 
                    }
            
                }
         
            }
       }
        
     }

     return components;
    }
}