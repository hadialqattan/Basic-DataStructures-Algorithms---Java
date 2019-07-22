public class Main {
    public static void main(String[] args) {
        // initialize new array
        int[] arr = new int[1000001];
        for (int i = 0; i <= 1000000; i++) {
            arr[i] = i;
        }
        // linear search
        linear_searching LinearSearching = new linear_searching();
        LinearSearching.Search(arr, 652);
    }
}
