import java.util.Scanner;
public class inheritArray {

    // To print array
    public static void printArray(int arr[]){
        System.out.print("Array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // To create a n array
    public static void createArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }
}
