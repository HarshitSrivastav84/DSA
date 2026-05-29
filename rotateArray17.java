import java.util.Scanner;
public class rotateArray17 extends inheritArray{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        System.out.print("Enter the no. of times you want to rotate the array: ");
        int r = sc.nextInt();

        // For clockwise rotation
        // for(int i=0; i<r; i++){
        //     int temp = arr[0];
        //     for(int j=0; j<arr.length-1; j++){
        //         arr[j] = arr[j+1];
        //     }
        //     arr[arr.length-1] = temp;
        // }


        // For anti-clockwise rotation
        for(int i=0; i<r; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }


        System.out.println("Array after rotation:");
        printArray(arr);
        
        sc.close();
    }
}
