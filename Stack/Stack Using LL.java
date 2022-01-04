public class Stack 
{
    private  Node head;
    private int size;

    public Stack() 
    {
        head = null;
        size }

    public int getSize() { 

        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        //         if(size == 0) 
        //             throw new StackEmptyException();

        //Implement the pop() function
        if(size==0){	//if size 0 then return -1
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(size==0){	//if size 0 then return -1
            return -1;
        }
        return head.data;
    }
}
