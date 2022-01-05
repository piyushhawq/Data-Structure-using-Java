import java.util.LinkedList;
import java.util.Queue;
public class Solution {

    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.size() <= 1) {
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            queue.add((int) Math.floor(Math.random() * (99 - 10 + 1) + 10));
        }

        System.out.println(queue.toString());
        reverseQueue(queue);
        System.out.println(queue.toString());

    }
}
