public class binarySearch {
    public static void main(String[] args){
        int arr[] = {1,3,4,7,22,34,45,55,67};
        int low = 0;
        int high = arr.length-1;
        int key = 7;

        int mid = low + high / 2;

        while(low <= high){
            if(key == arr[mid]){
                // System.out.println("Element found at index: " + i);
                System.out.println("Element found");
                return;
            }
            else if(key < arr[mid]){
                high = mid - 1;
                mid = low + high / 2;

                // elementIdx(arr[], key, 0, mid-1);
            }
            else{
                low = mid + 1;
                mid = low + high / 2;
            }
        }
    }
    // public static int elementIdx(arr[], int key){}
}
