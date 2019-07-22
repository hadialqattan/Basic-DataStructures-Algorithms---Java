public class linear_searching {

    // linear search
    public void Search(int[] arr, int searching_for){
        int n = arr.length;
        // iterate over array element
        for (int i = 0; i < n; i++) {
            // check if element is found
            if (arr[i] == searching_for){
                System.out.println("Number is found!");
                return;
            }
        }
        System.out.println("Number isn't found!");
        return;
    }

}
