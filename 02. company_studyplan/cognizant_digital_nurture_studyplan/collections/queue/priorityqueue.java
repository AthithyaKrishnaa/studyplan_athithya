package collections.queue;

// add, remove, search, iterate
import java.util.*;
class priorityqueue{
    public static void main(String[] args){
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // add
        pq.add(5);
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        System.out.println(pq);
        // Remove
        pq.remove(Integer.valueOf(2));
        pq.remove(2);
        System.out.println(pq);
        // Search
        System.out.println(pq.contains(5));
        // Iterate
        for(int i: pq){
            System.out.print(i+" ");
        }
        System.out.println();
        // Sort
        pq.add(2);
        pq.add(47);
        ArrayList<Integer> arr = new ArrayList<>(pq);
        Collections.sort(arr);
        System.out.println("Sorted :"+arr);
        // Access
        System.out.println(pq.peek());
        // Update
        System.out.println("update not supported in pq");
        // Size
        System.out.println(pq.size());
        // Check Empty
        System.out.println(pq.isEmpty());
        // Clear
        pq.clear();
        System.out.println(pq);
        System.out.println(pq.isEmpty());

    }
    
}


