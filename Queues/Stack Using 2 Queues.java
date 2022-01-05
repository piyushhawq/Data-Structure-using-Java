import java.util.LinkedList;
import java.util.Queue;
public class Stack {

    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;

    public Stack() {
        //Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int getSize() { 
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.size() == 0;
    }

    public void push(int element) {
        //Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        //Implement the pop() function

        if (q1.isEmpty())
            return -1;
        while(q1.size()>1) {
            q2.add(q1.poll());
        }
        int temp = (int)q1.poll();
        Queue ts = q1;
        q1 = q2;
        q2 = ts;
        return temp;
    }

    public int top() {
        //Implement the top() function
        if (q1.isEmpty())
            return -1;
        while(q1.size()>1) {
            q2.add(q1.poll());
        }
        int temp = (int)q1.peek();
        q2.add(q1.poll());
        Queue ts = q1;
        q1 = q2;
        q2 = ts;
        return temp;
    }

}
