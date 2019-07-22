public class selection_sorting {

    // sorting
    public void Sort(int[] arr){
        int minimum_index, n = arr.length;
        // iterate over array elements and sort them
        for (int i = 0; i < n; i++) {
            // find minimum value index
            minimum_index = minimum_index_value(arr, i);
            // swap current index with minimum value index
            swap(arr, i, minimum_index);
        }
    }

    // find minimum index value
    private int minimum_index_value(int[] arr, int first_index){
        int minimum_index = first_index, n = arr.length;
        for (int i = first_index; i < n; i++) {
            // check for minimum index value
            if (arr[minimum_index] > arr[i]) {
                minimum_index = i;
            }
        }
        return minimum_index;
    }

    // swap two value
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
