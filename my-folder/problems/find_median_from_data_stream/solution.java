class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int x) {
        if(maxHeap.size() == 0){
            maxHeap.offer(x);
            return;
        }
        //if left size is greater side
        //then there is two possibility if element want to go in left side or right side
        if(maxHeap.size() - minHeap.size() == 1){
            if(x > maxHeap.peek()) // wants to go in right no problem
                    minHeap.offer(x);
            else{ // wants to go in left then problem hi problem
                minHeap.offer(maxHeap.poll());
                maxHeap.offer(x);
            }
        }
        else{
            //both heaps are of equal size
            if(x < maxHeap.peek()){
                maxHeap.offer(x);
            }
            else{
                minHeap.offer(x);
                maxHeap.offer(minHeap.poll());
            }
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()){
            return (maxHeap.peek() + minHeap.peek())/2.0d;
        }
        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */