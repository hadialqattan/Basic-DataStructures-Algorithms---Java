public class merge_sorting {

    public void Sort(int[] arr){
        split(arr, arr.length);
    }

    private static void split(int[] arr, int n){
        // check for single array
        if(n < 2)
            return;
        // create right and left sub array
        int mid = n /2;
        int[] right = new int[mid];
        int[] left = new int[n - mid];
        // fill the arraies
        for (int i = 0; i < mid; i++){
            right[i] = arr[i];
        }
        for (int i = mid; i < n; i++){
            left[i - mid] = arr[i];
        }
        // continue in splitting
        split(right, mid);
        split(left, n - mid);
        // merge
        merge(arr, right, left, mid, n - mid);
    }

    private static void merge(int[] arr, int[] right, int[] left, int rightlen, int leftlen){
        // create tracker
        int r = 0, l = 0, m = 0;
        // merge with sorting
        while (r < rightlen && l < leftlen){
            if(right[r] < left[l]){
                arr[m++] = right[r++];
            }else{
                arr[m++] = left[l++];
            }
        }
        // fill right over elements
        while (r < rightlen){
            arr[m++] = right[r++];
        }
        // fill left over elements
        while (l < leftlen){
            arr[m++] = left[l++];
        }
    }

}
