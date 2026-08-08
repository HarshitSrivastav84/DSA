public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int element = search(arr, target, 0, arr.length - 1);
        System.out.println("Element found at index: " + element);
    }
    public static int search(int arr[], int target, int start, int end){

        if(start > end){
            System.out.println("Element not found");
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }

        else if(target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }

        else if(target > arr[mid]){
            return search(arr, target, mid + 1, end);
        }
        return -1;
    }
}