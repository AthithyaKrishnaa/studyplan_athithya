package array_strings_eh;
import java.util.Arrays;

class array_operations {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        // 1. Find the total number of elements.
        System.out.println(arr.length);
        // 2. Display the third element.
        System.out.println(arr[2]);
        // 3. Change the third element to 100.
        arr[2]=100;
        System.out.println(Arrays.toString(arr));
        // 4. Print the complete array.
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        // 5. Arrange the elements in ascending order.
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 6. Locate the position of 9 (array should already be ordered).
        System.out.println(Arrays.binarySearch(arr,9));
        // 7. Create a new array of size 5 and assign the same value to every element.
        int[] arr2 = new int[5];
        Arrays.fill(arr2,7);
        System.out.println(Arrays.toString(arr2));
        // 8. Create an exact copy of the current array.
        int[] copy = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copy));
        // 9. Copy only the elements from index 1 up to (but not including) index 4.
        int[] range = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(range));
        // 10. Check whether two arrays contain identical elements.
        int[] x = {1,2,3};
        int[] y = {1,2,3};
        System.out.println(Arrays.equals(x,y));
        // 11. Compare the two arrays lexicographically.
        System.out.println(Arrays.compare(x,y));
        // 12. Find the first index where these two arrays differ.
        int[] z = {1,2,5};
        System.out.println(Arrays.mismatch(x,z));
        // 13. Create another array using cloning.
        int[] clone = arr.clone();
        System.out.println(Arrays.toString(clone));
        // 14. Display a 2D array in a readable format.
        int[][] matrix = {
                {1,2},
                {3,4}
        };
        System.out.println(Arrays.deepToString(matrix));
        // 15. Print every element using a traditional for loop.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // 16. Print every element using an enhanced for loop.
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // 17. Traverse the 2D array and print each element.
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }

    }
}
