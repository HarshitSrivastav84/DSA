import java.util.Scanner;
public class secondLargest16 extends inheritArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        int largest = 0;
        int secondLargest = 0;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(largest > arr[i]){
                largest = largest;
                secondLargest = secondLargest;
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}
