package collections.map;

// put, remove, search, iterate
import java.util.*;
class treemap{
    public static void main(String[] args){
        
        TreeMap<Integer,String> tm = new TreeMap<>();
        // put
        tm.put(5,"e");
        tm.put(4,"d");
        tm.put(3,"c");
        tm.put(2,"b");
        tm.put(1,"a");
        System.out.println(tm);
        // Remove
        tm.remove(Integer.valueOf(2));
        tm.remove(2);
        System.out.println(tm);
        // Search
        System.out.println(tm.containsKey(5));
        System.out.println(tm.containsValue("d"));
        // Iterate
        for(Map.Entry<Integer, String> e: tm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        // Sort
        System.out.println("Tree map is already sorted");
        // Access
        System.out.println(tm.get(1));
        // Update
        tm.put(1,"aaa");
        System.out.println(tm);
        // Size
        System.out.println(tm.size());
        // Check Empty
        System.out.println(tm.isEmpty());
        // Clear
        tm.clear();
        System.out.println(tm);
        System.out.println(tm.isEmpty());

    }
    
}

