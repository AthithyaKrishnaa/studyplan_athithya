// add, remove, search, iterate, sort list
package collections;
import java.util.*;
class sett{
    public static void main(String[] args){
        // hash set 
        
        HashSet<Integer> set = new HashSet<>();
        System.out.println("HashSet :");
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(99);
        set.add(2);
        
        set.remove(Integer.valueOf(20));
        
        System.out.println(set.contains(10));
        
        for(int i: set){
            System.out.print(i+" ");
        }
        System.out.println();
        
        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println();

        // hash set 
        
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        System.out.println("Linked HashSet :");
        set2.add(30);
        set2.add(20);
        set2.add(10);
        
        set2.remove(Integer.valueOf(20));
        
        System.out.println(set2.contains(10));
        
        for(int i: set2){
            System.out.print(i+" ");
        }
        System.out.println();
        
        ArrayList<Integer> arr2 = new ArrayList<>(set2);
        Collections.sort(arr2);
        System.out.println(arr2);
        System.out.println();
        
        // tree set
        
        System.out.println("Tree Set :");
        
        TreeSet<Integer> set3 = new TreeSet<>();
        
        set3.add(30);
        set3.add(20);
        set3.add(10);
        set3.add(99);
        set3.add(2);
        
        set3.remove(Integer.valueOf(20));
        
        System.out.println(set3.contains(10));
        
        for(int i: set3){
            System.out.print(i+" ");
        }
        System.out.println();
        
        //Collections.sort(set3);
        System.out.println(set3);
        
    }
    
}