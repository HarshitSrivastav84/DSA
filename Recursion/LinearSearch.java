public class LinearSearch {
    public static void main(String[] args){
        int arr[] = {3,2,1,18,9,11};
        System.out.println(LinearSearch(arr, 5, 0));
    }
    public static int LinearSearch(int arr[], int target, int i){
        if(target == arr[i]){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return LinearSearch(arr, target, i+1);
    }
}
