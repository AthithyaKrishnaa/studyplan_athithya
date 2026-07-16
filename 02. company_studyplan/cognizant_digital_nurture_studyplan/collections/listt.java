// add, remove, search, iterate, sort
package collections;

import java.util.*;
class listt{
    public static void main(String[] args){
        // array list 
        
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Array List :");
        arr.add(30);
        arr.add(20);
        arr.add(10);
        
        arr.remove(Integer.valueOf(20));
        
        System.out.println(arr.contains(10));
        
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println();

        // linked list
        System.out.println("Linked List :");
        
        LinkedList<Integer> arr2 = new LinkedList<>();
        
        arr2.add(30);
        arr2.add(20);
        arr2.add(10);
        
        arr2.remove(Integer.valueOf(20));
        
        System.out.println(arr2.contains(10));
        
        for(int i: arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(arr2);
        System.out.println(arr2);
    }
    
}