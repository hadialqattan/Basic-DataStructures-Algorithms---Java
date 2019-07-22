public class bubble_sorting {

    public void Sort(int[] arr){
        int unsorted_len = arr.length;
        // iterate over unsorted elements
        for(int i = unsorted_len; i > 0; i-- ){
            // sort elements
            for(int x = 0; x < i - 1; x ++){
                // check for minimum index value
                if (arr[x] > arr[x+1]){
                    swap(arr, x, x+1);
                }
            }
        }
    }

    // swap two element
    private void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
