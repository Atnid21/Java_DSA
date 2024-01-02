import java.util.*;

public class Learn_PriorityQueue {
    public static void main(String[] args) {

        // this is min heap
        Queue<Integer> pq = new PriorityQueue<>();
        // this is max heap
        // Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(23);
        pq.offer(30);
        pq.offer(15);
        // here min heap is getting implemented
        // smallest element will be on top
        System.out.println(pq);
        // will remove first element
        pq.poll();
        System.out.println(pq);
        // next element to poll()
        System.out.println(pq.peek());

    }
}
