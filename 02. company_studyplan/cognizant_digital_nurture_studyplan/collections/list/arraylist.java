package collections.list;
import java.util.*;
class arraylist{
    public static void main(String[] args){
        
        ArrayList<Integer> arr = new ArrayList<>();
        // Add
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        // Remove
        arr.remove(Integer.valueOf(2));
        arr.remove(2);
        System.out.println(arr);
        // Search
        boolean res = arr.contains(5);
        System.out.println(res);
        // Iterate
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // Sort
        Collections.sort(arr);
        System.out.println(arr);
        // Access
        System.out.println(arr.get(1));
        // Update
        arr.set(1,44);
        System.out.println(arr);
        // Size
        System.out.println(arr.size());
        // Check Empty
        System.out.println(arr.isEmpty());
        // Clear
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.isEmpty());

    }
    
}
