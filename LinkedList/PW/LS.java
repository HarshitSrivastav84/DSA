
public class LS {

    public static int LinearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key found at index: " + i);
                return i;
            }
        }
        int index = -1;
        System.out.println("Key not found");
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {11,22,33,77,55,1,34,89,76};

        int index = LinearSearch(arr, 4);
        
    }
}
