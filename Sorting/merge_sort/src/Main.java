public class Main {
    public static void main(String[] args) {
        // array before merge sort
        int[] arr = {5,6,8,7,4,9,3,2,1,0};
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        // sorting
        merge_sorting MergeSorting = new merge_sorting();
        MergeSorting.Sort(arr);
        // array after merge sort
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
