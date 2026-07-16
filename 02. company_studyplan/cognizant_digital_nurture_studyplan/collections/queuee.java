// add, remove, search, iterate
import java.util.*;
class queuee{
    public static void main(String[] args){
        // Queue - priority queue, deque
        
        // priority queue
        System.out.println("Priority Queue :");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // add
        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        // remove
        pq.remove(2);
        // search
        System.out.println(pq.contains(3));
        // iterate
        for(int i: pq){
            System.out.print(i+" ");
        }
        System.out.println();
        // sort
        ArrayList<Integer> arr = new ArrayList<>(pq);
        Collections.sort(arr);
        System.out.println(pq);
        System.out.println(arr);
        System.out.println();
        
        // deque
        System.out.println("Deque :");
        Deque<Integer> dq = new ArrayDeque<>();
        // add
        dq.add(4);
        dq.add(2);
        dq.add(3);
        dq.add(1);
        // remove
        dq.remove(2);
        // search
        System.out.println(dq.contains(3));
        // iterate
        for(int i: dq){
            System.out.print(i+" ");
        }
        System.out.println();
        // sort
        ArrayList<Integer> arr2 = new ArrayList<>(dq);
        Collections.sort(arr2);
        System.out.println(dq);
        System.out.println(arr);
        
    }
    
}
