import java.util.Scanner;

public class BS {

    public static void BinarySearch(int arr[], int key){
        int low = 0; 
        int high = arr.length - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                System.out.print("Key found at index: " + mid);
                return;
            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
        }
        System.out.print("Key not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to be searched: ");
        int key = sc.nextInt();
        BinarySearch(arr, key);
    }
}
