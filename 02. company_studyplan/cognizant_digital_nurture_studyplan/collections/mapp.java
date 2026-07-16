// add, remove, search, iterate
package collections;
import java.util.*;
class mapp{
    public static void main(String[] args){
        // Map - hashmap, linked hashmap, treemap
        
        // hashmap
        System.out.println("Hash Map :");
        HashMap<Integer, String> map = new HashMap<>();
        // add
        map.put(4,"d");
        map.put(2,"b");
        map.put(3,"caaaa");
        map.put(1,"a");
        // remove
        map.remove(2);
        // search
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("a"));
        // iterate
        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        // sort
        TreeMap<Integer, String> map_sorted = new TreeMap<>(map);
        System.out.println(map);
        System.out.println(map_sorted);
        System.out.println();
        
        //linked hash map
        System.out.println("Linked Hash Map :");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        
        lhm.put(3,"c");
        lhm.put(1,"a");
        lhm.put(2,"b");
        lhm.put(4,"d");
        
        lhm.remove(2);
        
        System.out.println(lhm.containsKey(3));
        System.out.println(lhm.containsValue("d"));
        
        for(Map.Entry<Integer, String> e : lhm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        System.out.println(lhm);
        TreeMap<Integer, String> lhm_sorted = new TreeMap<>(lhm);
        System.out.println(lhm_sorted);
        System.out.println();
        
        // tree map
        System.out.println("Tree Map :");
        TreeMap<Integer, String> tm = new TreeMap<>();
        
        tm.put(3,"c");
        tm.put(1,"a");
        tm.put(2,"b");
        tm.put(4,"d");
        
        tm.remove(2);
        
        System.out.println(tm.containsKey(3));
        System.out.println(tm.containsValue("d"));
        
        for(Map.Entry<Integer, String> e : tm.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        System.out.println(tm);
    }
    
}
