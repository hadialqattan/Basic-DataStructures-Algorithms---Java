public class binary_searching {

    public void Search(int[] arr, int searching_for){
        // set tracker
        int max = arr.length -1, min = 0, mid = (max + min) /2;
        // searching
        while (min <= max){
            // check if number is found
            if(arr[mid] == searching_for){
                System.out.println("Number is found!");
                return;
            }
            // div the searching length to have
            else if(arr[mid] > searching_for){
                max = mid -1;
            }else{
                min = mid +1;
            }
            mid = (max + min) /2;
        }
        System.out.println("Number isn't found!");
    }

}
