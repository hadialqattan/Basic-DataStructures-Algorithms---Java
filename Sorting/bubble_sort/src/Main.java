public class Main {

    public static void main(String[] args) {
        // array before bubble sort
        int[] arr = {5,6,8,7,4,9,3,2,1,0};
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        // sorting
        bubble_sorting BubbleSorting = new bubble_sorting();
        BubbleSorting.Sort(arr);
        // array after bubble sort
        for (int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
