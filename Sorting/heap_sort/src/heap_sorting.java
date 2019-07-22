public class heap_sorting {

    public void Sort(int[]arr){

        int n = arr.length;
        // create max heap tree
        for (int i = n / 2 -1; i >= 0; i--)
            heapify(arr, n, i);

        // heap max
        for (int i = n -1; i >= 0; i--) {
            // swap first(parent) element with i
            swap(arr, i, 0);
            // heap max
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[]arr, int heapSize, int i){
        // create parent and left/right children
        int parentNDX = i;
        int leftChildNDX  = i * 2 + 1;
        int rightChildNDX = i * 2 + 2;

        /* parent must be largest value*/
        // check if the left child less then the parent
        if (leftChildNDX < heapSize && arr[leftChildNDX] > arr[parentNDX])
            parentNDX = leftChildNDX;
        // check if the right child less then the parent
        if (rightChildNDX < heapSize && arr[rightChildNDX] > arr[parentNDX])
            parentNDX = rightChildNDX;

        // check if the parent changed
        if (parentNDX != i) {
            swap(arr, parentNDX, i);
            heapify(arr, heapSize, parentNDX);
        }
    }

    // swap two values
    private void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
