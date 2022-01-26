import java.util.*;
public class PQ {
    
    public ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}
		boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
        return heap.size();
		// Implement the getSize() function here
	}

	int getMax(){
		if (isEmpty()) {
			// Throw an exception
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}
    
    

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}
    
    

	int removeMax(){
        
        	if(isEmpty()){
           	return Integer.MIN_VALUE;
        }
        
        int removed=heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentIndex=0;
        int leftChildIndex=2 * parentIndex  +  1;
        int rightChildIndex=2*parentIndex+2;
        
        while(leftChildIndex < heap.size()){
            int minIndex=parentIndex;
            if(heap.get(leftChildIndex) > heap.get(minIndex)){
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<heap.size() && (heap.get(rightChildIndex)) > heap.get(minIndex)){
                minIndex=rightChildIndex;
            }
            
            if(minIndex==parentIndex){
                break;
            }
            int temp=heap.get(minIndex);
            heap.set(minIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            parentIndex=minIndex;
            leftChildIndex=2 * parentIndex  +  1;
            rightChildIndex=2*parentIndex+2;
        }
        return removed;
    }
}
// class PriorityQueueException extends Exception {

// }
