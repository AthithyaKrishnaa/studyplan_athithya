package collections.map;

// put, remove, search, iterate
import java.util.*;
class hashmap{
    public static void main(String[] args){
        
        HashMap<Integer,String> hm = new HashMap<>();
        // put
        hm.put(5,"e");
        hm.put(4,"d");
        hm.put(3,"c");
        hm.put(2,"b");
        hm.put(1,"a");
        System.out.println(hm);
        // Remove
        hm.remove(Integer.valueOf(2));
        hm.remove(2);
        System.out.println(hm);
        // Search
        System.out.println(hm.containsKey(5));
        System.out.println(hm.containsValue("d"));
        // Iterate
        for(Map.Entry<Integer, String> e: hm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        // Sort
        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        System.out.println(tm);
        // Access
        System.out.println(hm.get(1));
        // Update
        hm.put(1,"aaa");
        System.out.println(hm);
        // Size
        System.out.println(hm.size());
        // Check Empty
        System.out.println(hm.isEmpty());
        // Clear
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());

    }
    
}

