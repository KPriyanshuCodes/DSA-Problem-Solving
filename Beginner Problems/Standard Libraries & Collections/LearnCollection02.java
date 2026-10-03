import java.util.*;

public class LearnCollection02 {
    static void main(String[] args) {

        //QUEUE
        Queue<Integer>queue=new LinkedList<>();
        queue.add(10);
        queue.add(20); //if the task is successful return true otherwise throw exception
        queue.offer(30);
        queue.offer(40); //if the task is successful return true otherwise return false

        System.out.println(queue);

        System.out.println(queue.element()); //return the head of the queue if queue is empty throws exception

        System.out.println(queue.peek()); //return the head of the queue if queue is empty return null

        System.out.println(queue.remove()); //remove and return the head of the queue if queue is empty throws exception

        System.out.println(queue.poll()); //remove and return the head of the queue if queue is empty return null

        System.out.println(queue);

        Queue<Integer>queue1=new ArrayDeque<>();


        //PRIORITY QUEUE
        Queue<Integer>pq1=new PriorityQueue<>();  //min heap
        // default behaviour -> Integers -> less value -> high priority
        pq1.offer(40);
        pq1.offer(30);
        pq1.offer(10);
        pq1.offer(20);

        System.out.println(pq1);
        System.out.println(pq1.poll());
        System.out.println(pq1);

        Queue<Integer>pq2=new PriorityQueue<>((a,b)->b-a);  //max heap
        // Integers -> high value -> high priority
        pq2.offer(40);
        pq2.offer(30);
        pq2.offer(10);
        pq2.offer(20);

        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);


        //HASHSET
        //stores only unique values
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();

        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(4);
        System.out.println(set2);

        System.out.println(set1.containsAll(set2)); //check that set1 contains all elements of set2

        set1.retainAll(set2); // save common elements in set1
        System.out.println(set1);

        Set<Integer>st1=new LinkedHashSet<>(); //order are preserved
        st1.add(10);
        st1.add(40);
        st1.add(30);
        System.out.println(st1);


        Set<Integer>st2=new TreeSet<>(); //order are always sorted
        st2.add(10);
        st2.add(40);
        st2.add(30);
        System.out.println(st2);
    }
}
