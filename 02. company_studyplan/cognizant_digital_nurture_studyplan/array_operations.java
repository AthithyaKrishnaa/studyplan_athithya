import java.util.Arrays;

class array_operations {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};
        // 1. length
        System.out.println("1. length: " + arr.length);
        // 2. Access element
        System.out.println("2. arr[2]: " + arr[2]);
        // 3. Modify element
        arr[2] = 100;
        System.out.println("3. Modify arr[2]: " + Arrays.toString(arr));
        // 4. Print array
        System.out.println("4. Arrays.toString(): " + Arrays.toString(arr));
        // 5. Sort
        Arrays.sort(arr);
        System.out.println("5. sort(): " + Arrays.toString(arr));
        // 6. Binary Search (Array must be sorted)
        System.out.println("6. binarySearch(9): " + Arrays.binarySearch(arr, 9));
        // 7. Fill
        int[] a = new int[5];
        Arrays.fill(a, 7);
        System.out.println("7. fill(): " + Arrays.toString(a));
        // 8. Copy Of
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("8. copyOf(): " + Arrays.toString(copy));
        // 9. Copy Of Range
        int[] range = Arrays.copyOfRange(arr, 1, 4);
        System.out.println("9. copyOfRange(): " + Arrays.toString(range));
        // 10. Equals
        int[] x = {1,2,3};
        int[] y = {1,2,3};
        System.out.println("10. equals(): " + Arrays.equals(x, y));
        // 11. Compare
        System.out.println("11. compare(): " + Arrays.compare(x, y));
        // 12. Mismatch
        int[] z = {1,2,5};
        System.out.println("12. mismatch(): " + Arrays.mismatch(x, z));
        // 13. Clone
        int[] clone = arr.clone();
        System.out.println("13. clone(): " + Arrays.toString(clone));
        // 14. Deep To String (2D Array)
        int[][] matrix = {
                {1,2},
                {3,4}
        };
        System.out.println("14. deepToString(): " + Arrays.deepToString(matrix));
        // 15. Loop using for
        System.out.print("15. for loop: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 16. Enhanced for loop
        System.out.print("16. for-each: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        // 17. 2D Array Traversal
        System.out.println("17. 2D Array:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}