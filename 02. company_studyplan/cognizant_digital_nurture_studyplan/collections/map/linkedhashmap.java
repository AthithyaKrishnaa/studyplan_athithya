package collections.map;

// put, remove, search, iterate
import java.util.*;
class linkedhashmap{
    public static void main(String[] args){
        
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        // put
        lhm.put(5,"e");
        lhm.put(4,"d");
        lhm.put(3,"c");
        lhm.put(2,"b");
        lhm.put(1,"a");
        System.out.println(lhm);
        // Remove
        lhm.remove(Integer.valueOf(2));
        lhm.remove(2);
        System.out.println(lhm);
        // Search
        System.out.println(lhm.containsKey(5));
        System.out.println(lhm.containsValue("d"));
        // Iterate
        for(Map.Entry<Integer, String> e: lhm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        // Sort
        TreeMap<Integer, String> tm = new TreeMap<>(lhm);
        System.out.println("Sorted :"+tm);
        // Access
        System.out.println(lhm.get(1));
        // Update
        lhm.put(1,"aaa");
        System.out.println(lhm);
        // Size
        System.out.println(lhm.size());
        // Check Empty
        System.out.println(lhm.isEmpty());
        // Clear
        lhm.clear();
        System.out.println(lhm);
        System.out.println(lhm.isEmpty());

    }
    
}
