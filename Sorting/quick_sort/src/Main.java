public class Main {

    public static void main(String[] args) {
        // array before quick sort
        int[] arr = {5,6,8,7,4,9,3,2,1};
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        // sorting
        quick_sorting QuickSorting = new quick_sorting();
        QuickSorting.Sort(arr);
        // array after quick sort
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
