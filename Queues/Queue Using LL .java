public class Queue {
	
	//Define the data members
     private Node front;
    private Node rear;
   private int size;

	public Queue() {
		//Implement the Constructor
        this.front = null;
        this.rear = null;
        this.size = 0;
	}
	public int getSize() { 
		//Implement the getSize() function
        return this.size;
    }
    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return this.size == 0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        this.size += 1;
        Node newNode = new Node(data);
        
        if(front == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }
        
        this.rear.next = newNode;
        this.rear = newNode;
        
    }


    public int dequeue() {
    	//Implement the dequeue()functio
       if(this.isEmpty()) {
           return -1;
       }
        
        int ans = this.front.data;
        this.front = this.front.next;
        this.size -= 1;
        return ans;
    }


    public int front() {
    	//Implement the front() function
        if(this.isEmpty()) {
            return -1;
        }
        
        return this.front.data;
    }
}
