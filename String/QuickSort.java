public class QuickSort {
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];   
        int i = low;            

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                // arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // move pivot into its correct position
        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        quicksort(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}