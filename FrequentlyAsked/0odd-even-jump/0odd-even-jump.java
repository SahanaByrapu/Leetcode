/**

There is no way I'd have figured this out in an interview. Even after reading through some of the answers I couldn't understand the intuition 
initially. However it's not that hard.

Essentially for every item in the array we need to check if it's possible to jump to the end successfully. How do we do that?

The brute force way would be to try jumping from each item and see how far we can get. That will be an O(n^2) algorithm though it's trivial. 
Looks like we can use DP to make the algorithm much faster.

We can use bottom-up DP pattern to determine if a successful jump is possible from an index, in constant time. The intution/algorithm goes like 
this-

1. Let's call an odd jump which involves jumping to the next higher (or equal) index from current as a high jump
2. Similarly we'll call an even jump as low jump
3. If we can make a successful high jump from current index then we can reach the end if it's possible to do a low jump from the new index 
	to end
4. If we can make a successful low jump from current index then we can reach the end if it's possible to do a high jump from the new index 
	to end
5. 3 and 4 may look very similar but there is a key difference. 
6. #3's location is a good location by itself. This is because high jumps are odd so in #3 we'll make an odd jump (first jump) followed by 
	an even jump (second jump) to reach the end.
7. #4's location is not a good location by itself, but any location that can make an odd number of jumps to reach #4 is a good location. 
	(This is why we store both high and low jump outcomes)
8. We can always reach the end if we start from end so the starting number is 1
9. We then go back from the end in a bottom up manner and determine (and store) if it's possible to do a successful high and low jump 
	from each index to end. Everytime we can do a successful high jump we increment counter
10. In order to determine if a high/low jump is possible we'll need to find the closest larger/smaller number (That comes after the index). 
	This can be acgieved in o(log(n)) time by using Java's TreeMap (which is a red black BST implementation)

NOTE: The trick is building the jump feasibility arrays bottom up.

**/
class Solution {
    public int oddEvenJumps(int[] arr) {
       
        
         
        TreeMap<Integer, Integer> tmap = new TreeMap();
        
        boolean [] high=new boolean[arr.length];
        boolean [] low=new boolean[arr.length];
        
        
        tmap.put(arr[arr.length-1],arr.length-1);
        
        high[arr.length-1]=true;
        low[arr.length-1]=true;
        
        int jumps=1;
        for(int i=arr.length-2;i>=0;i--)
        {
            
            Map.Entry<Integer, Integer> nextlargest=tmap.ceilingEntry(arr[i]);
            Map.Entry<Integer, Integer> nextlowest=tmap.floorEntry(arr[i]);
            
            high[i]=(nextlargest!=null)? low[(int)nextlargest.getValue()]:false;
           
            low[i]=(nextlowest!=null)? high[(int)nextlowest.getValue()]:false;
            
            if(high[i])
               jumps++;
            
            //System.out.println(jumps);
            tmap.put(arr[i],i);
        }
        
        return jumps;
        
            
    }
}