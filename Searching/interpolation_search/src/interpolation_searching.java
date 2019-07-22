public class interpolation_searching {

    public void Search(int[] arr, int searching_for){
        // set tracker
        int high = arr.length -1, low = 0, mid = low + (((high-low) / (arr[high]-arr[low]))*(searching_for - arr[low]));
        // searching
        while (low <= high){
            // check if number is found
            if(arr[mid] == searching_for){
                System.out.println("Number is found!");
                return;
            }
            // div the searching length to have
            else if(arr[mid] > searching_for){
                high = mid -1;
            }else{
                low = mid +1;
            }
            mid = low + (((high-low) / (arr[high]-arr[low]))*(searching_for - arr[low]));
        }
        System.out.println("Number isn't found!");
    }



}
