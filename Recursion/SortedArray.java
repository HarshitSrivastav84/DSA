public class SortedArray {
    public static void main(String[] args){
        int arr[] = {1,2,4,4,9,12};
        System.out.println(sorted(arr, 0));
    }
    public static boolean sorted(int arr[], int i){
        if(i == arr.length-2){
            return true;
        }
        if(arr[i] <= arr[i+1]){
            return sorted(arr, i+1);
        }
        return false;
    }
}
