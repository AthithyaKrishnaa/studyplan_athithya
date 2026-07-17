package collections.queue;

// add, remove, search, iterate
import java.util.*;
class dequee{
    public static void main(String[] args){
        
        Deque<Integer> dq = new ArrayDeque<>();
        // add
        dq.add(5);
        dq.add(4);
        dq.add(3);
        dq.add(2);
        dq.add(1);
        System.out.println(dq);
        // Remove
        dq.remove(Integer.valueOf(2));
        dq.remove(2);
        System.out.println(dq);
        // Search
        System.out.println(dq.contains(5));
        // Iterate
        for(int i: dq){
            System.out.print(i+" ");
        }
        System.out.println();
        // Sort
        dq.add(2);
        dq.add(47);
        ArrayList<Integer> arr = new ArrayList<>(dq);
        Collections.sort(arr);
        System.out.println("Sorted :"+arr);
        // Access
        System.out.println(dq.peek());
        // Update
        System.out.println("update not supported in dq");
        // Size
        System.out.println(dq.size());
        // Check Empty
        System.out.println(dq.isEmpty());
        // Clear
        dq.clear();
        System.out.println(dq);
        System.out.println(dq.isEmpty());

    }
    
}


