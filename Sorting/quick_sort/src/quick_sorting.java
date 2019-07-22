public class quick_sorting {

    public void Sort(int[] arr){
        int n = arr.length;
        // check if the array length longer then 1
        if (n <= 1)return;
        // start quick sorting
        quick_sorting(arr, 0, n -1);
    }

    private void quick_sorting(int[]arr, int low, int high){
        // set pointers and calculate pivot
        int l = low, h = high, pivot = (h+l) /2;
        // set lower then pivot value in the left and greater then pivot in the right
        while (l <= h){
            // find element less then pivot
            while (arr[l] < arr[pivot])
                l++;
            // find element greater then pivot
            while (arr[h] > arr[pivot])
                h--;
            // check if the pointers if in the same index and swap these values
            if (l <= h){
                swap(arr, l++, h--);
            }
            // check if low pointer less then high
            if (l < high)
                quick_sorting(arr, l, high);
            // check if high pointer greater then low
            if (low < h)
                quick_sorting(arr, low, h);
        }
    }

    // swap two elements
    private void swap(int[] arr, int high, int low){
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low] = temp;
    }

}
