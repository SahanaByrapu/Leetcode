/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    HashMap<Node,Node> visited=new HashMap<>();

    public Node cloneGraph(Node node) {
        
        if(node==null)
         return node;

        //DEPTH_FIRST_SEARCH
        /*if(visited.containsKey(node))
            return visited.get(node);
        
        Node cloneNode = new Node(node.val,new ArrayList());
        visited.put(node,cloneNode);

        for (Node adj :node.neighbors)
          cloneNode.neighbors.add(cloneGraph(adj));
    
        return cloneNode;*/

        //BREADTH_FIRST_SEARCH
        LinkedList<Node> queue=new LinkedList();
        queue.add(node);

        Node cloneNode=new Node(node.val,new ArrayList());
        visited.put(node,cloneNode);

        while(!queue.isEmpty()) 
        {
           Node n=queue.remove();
           for(Node adj:n.neighbors)
           {
               if(!visited.containsKey(adj))
                {
                  visited.put(adj,new Node(adj.val,new ArrayList()));
                  queue.add(adj);
                }

                visited.get(n).neighbors.add(visited.get(adj));
           }
        }
        
        return visited.get(node);

    }
}