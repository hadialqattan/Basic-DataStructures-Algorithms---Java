public class Main {

    public static void main(String[] args) {
        // array before selection sort
        int[] arr = {5,6,8,7,4,9,3,2,1,0};
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        // sorting
        selection_sorting SelectionSorting = new selection_sorting();
        SelectionSorting.Sort(arr);
        // array after selection sort
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
