import java.util.Scanner;

public class LinearAndBinary {

    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                return i;
            }
        }
        int index = -1;
        System.out.println("Key not found");
        return index;
    }

    public static void BinarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.print("Key found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        System.out.print("Key not found");
    }

        public static int RecursiveLinearSearch(int[] arr, int idx, int key) {
            if(idx >= arr.length){ 
                return -1;
            }
            if (arr[idx] == key){
                 return idx;
            }
            return RecursiveLinearSearch(arr, idx + 1, key);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Linear Search and 2 for Binary Search: ");
        int choice = sc.nextInt();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key to be searched: ");
        int key = sc.nextInt();

        switch (choice) {
            case 1:
                LinearSearch(arr, key);
                break;

            case 2:
                BinarySearch(arr, key);
                break;
            
            case 3:
                RecursiveLinearSearch(arr, 0, key);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
