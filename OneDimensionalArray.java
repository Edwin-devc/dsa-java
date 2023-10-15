public class OneDimensionalArray {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}