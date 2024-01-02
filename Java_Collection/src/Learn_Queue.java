import java.util.LinkedList;
import java.util.Queue;

public class Learn_Queue {
    public static void main(String[] args){

        // Queue => FIFO
        // can be implemented by ArrayList, LinkedList , PriorityQueue
        Queue<Integer> queue = new LinkedList<>();
        // offer() -> adds element in queue
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);

        System.out.println(queue);
        // poll() -> removes element from the queue
        System.out.println(queue.poll());

        System.out.println(queue);
        // peek() -> will provide which element is next to remove
        System.out.println(queue.peek());






    }
}
