public class Solution {
	
	public static void inplaceHeapSort(int[] arr , int i) {
		
		int childIndex = i;
		
		while(childIndex>0) {
			int parentIndex = (childIndex-1)/2;
			if(arr[childIndex] > arr[parentIndex] ) {
				int temp = arr[childIndex];
				arr[childIndex]= arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex  = parentIndex;
			}
			else {
				break;
			}
		}
	}
	public static int removeMaxFromHeap(int[] input,int size) {
		
		int temp = input[0];
		input[0] = input[size-1];
		
		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2* parentIndex + 2;
		
		while(leftChildIndex < size) {
			
			int maxIndex = parentIndex;
			if(input[leftChildIndex] > input[maxIndex] ) {
				maxIndex = leftChildIndex;
			}
			if( rightChildIndex < size &&  input[rightChildIndex] > input[maxIndex]) {
				maxIndex = rightChildIndex;
			}
			if(maxIndex!=parentIndex) {
				int temp2 = input[maxIndex];
				input[maxIndex] = input[parentIndex];
				input[parentIndex] = temp2;
				parentIndex = maxIndex;
				leftChildIndex = 2 * parentIndex + 1;
				rightChildIndex = 2* parentIndex + 2;
			}
			else {
				break;
			}
			
		}
		
		return temp;
		
		
	}
	public static void inplaceHeapSort(int input[]) {
	
		for(int i=0;i<input.length;i++) {
			inplaceHeapSort(input, i);
		}
		
		for(int i=0;i<input.length;i++) {
			input[ input.length-i-1] = removeMaxFromHeap(input, input.length - i); 
		}
		 for(int i=0;i<input.length/2;i++){
	            int temp = input[i];
	            input[i] = input[input.length - i -1];
	            input[input.length - i -1 ] = temp;
	        }
		
		
	}
	public static void main(String[] args) {
	int[] input = {5,2,1,6,0,9};
	inplaceHeapSort(input);
	for(int i : input) {
		System.out.print(i+" ");
	}
	
	}
}
