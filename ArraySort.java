import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = new int[] {2, 7, 4, 3, 10, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
