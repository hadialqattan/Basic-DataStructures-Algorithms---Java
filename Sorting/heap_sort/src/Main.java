public class Main {
    public static void main(String[] args) {
        // array before heap sort
        int[] arr = {5,6,8,7,4,9,3,2,1,0};
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        // sorting
        heap_sorting HeapSorting = new heap_sorting();
        HeapSorting.Sort(arr);
        // array after heap sort
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
