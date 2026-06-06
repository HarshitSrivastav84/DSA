import java.util.Scanner;
public class sortZeros18 extends inheritArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);


        // Sorting 0's and 1's in the array
        // int count = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] == 0){
        //         count++;
        //     }
        // }
        // for(int j=0; j<arr.length; j++){
        //     if(count>0){
        //         arr[j] = 0;
        //         count--;
        //     }else{
        //         arr[j] = 1;
        //     }
        // }
        // printArray(arr);


        // Alternative method to sort 0's and 1's in the array
        int i=0; // Points left
        int j=arr.length-1; // Points right

        while( i < j){
            if(arr[i] == 0){
                i++;
            }else if(arr[i] == 1){
                if(arr[j] == 1){
                    j--;
                }else if(arr[j] == 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        printArray(arr);
        sc.close();
    }
}
