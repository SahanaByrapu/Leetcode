/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
   
    int people;
    
    public int findCelebrity(int n) {
        
        people=n;
        int celebrity=0;
        for(int i=0;i<people;i++)
        {
            if(knows(celebrity,i))
                celebrity=i;
        }
        
        if(isCelebrity(celebrity))
            return celebrity;
        
        return -1;
        
    }
    
    boolean isCelebrity(int celebrity)
    {
        for(int j=0;j<people;j++)
        {
            if(celebrity==j) continue;
            if(knows(celebrity,j) || !knows(j,celebrity)) return false;
        }
        
        return true;
    }
}