package collections.set;

// add, remove, search, iterate
import java.util.*;
class Main{
    public static void main(String[] args){
        
        LinkedHashSet<Integer> sett = new LinkedHashSet<>();
        // Add
        sett.add(5);
        sett.add(4);
        sett.add(3);
        sett.add(2);
        sett.add(1);
        System.out.println(sett);
        // Remove
        sett.remove(Integer.valueOf(2));
        sett.remove(2);
        System.out.println(sett);
        // Search
        boolean res = sett.contains(5);
        System.out.println(res);
        // Iterate
        for(int i: sett){
            System.out.print(i+" ");
        }
        System.out.println();
        // Sort
        ArrayList<Integer> arr = new ArrayList<>(sett);
        Collections.sort(arr);
        System.out.println(arr);
        // Access
        System.out.println("no access in linked hash set");
        // Update
        System.out.println("no update in linked hash set");
        // Size
        System.out.println(sett.size());
        // Check Empty
        System.out.println(sett.isEmpty());
        // Clear
        sett.clear();
        System.out.println(sett);
        System.out.println(sett.isEmpty());

    }
    
}

