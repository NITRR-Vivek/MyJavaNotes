import java.util.*;

public class Queues {
    public static void main(String[] args) {
        LinkedListQueue();
        ArrayDeque();
        PriorityQueNatural();
        PriorityQueReverse();
    }

    public static void LinkedListQueue() {
        Queue<Integer> que1 = new LinkedList<Integer>();
        que1.offer(10);
        que1.add(20);
        que1.offer(15);
        que1.add(50);
        System.out.println("Queue = " + que1);
        que1.remove();
        que1.poll();
        System.out.println("Queue after polls =" + que1);
        System.out.println("Queue Peek = " + que1.peek());
    }

    public static void ArrayDeque() {
        Deque<Integer> adq = new ArrayDeque<Integer>();
        adq.offer(10);
        adq.offer(20);
        adq.offerFirst(30);
        adq.offerLast(40);
        adq.add(50);
        System.out.println("ArrayDeque = " + adq);
        adq.poll();
        adq.pollLast();
        System.out.println("ArrayDequeue after polls = " + adq);

    }

    public static void PriorityQueNatural() {
        PriorityQueue<Integer> pqn = new PriorityQueue<>();
        pqn.offer(12);
        pqn.offer(3);
        pqn.offer(4);
        pqn.add(2);
        System.out.println("PriorityQueueNatural = " + pqn);

    }

    public static void PriorityQueReverse() {
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(12);
        pqr.offer(3);
        pqr.offer(4);
        pqr.add(2);
        System.out.println("PriorityQueueNatural = " + pqr);

    }
}