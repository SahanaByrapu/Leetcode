class Solution {
    public boolean validTree(int n, int[][] edges) {

    List<List<Integer>> adjList =new ArrayList<List<Integer>>();


    for(int i=0;i<n;i++)
        adjList.add(new ArrayList<>());

    for(int []edge:edges)
    {
        adjList.get(edge[0]).add(edge[1]);
        adjList.get(edge[1]).add(edge[0]);
    }

    HashMap<Integer,Integer> parent = new HashMap<>();
    parent.put(0,-1);
    Stack<Integer> stack =new Stack<>();
    stack.push(0);

    while(!stack.isEmpty())
    {
        int element=stack.pop();

       for(int neighbor:adjList.get(element))
       {

           if(parent.get(element)==neighbor)
             continue;

           if(parent.containsKey(neighbor))
              return false;


          stack.push(neighbor);
          parent.put(neighbor,element);
       }
         
    }

     return parent.size()==n;

    }
}