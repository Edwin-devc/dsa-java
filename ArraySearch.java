public class ArraySearch {
    public static int search (int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {2, 7, 4, 3, 10, 8, 9};
        int index_found = search(arr, 9);
        if (index_found == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: "+ index_found);
        }
        
    }
}
