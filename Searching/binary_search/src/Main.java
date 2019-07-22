public class Main {
    public static void main(String[] args) {
        // initialize new array
        int[] arr = new int[1000001];
        for (int i = 0; i <= 1000000; i++) {
            arr[i] = i;
        }
        // binary search
        binary_searching BinarySearching = new binary_searching();
        BinarySearching.Search(arr, 652);
    }
}
