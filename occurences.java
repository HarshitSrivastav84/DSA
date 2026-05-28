import java.util.Scanner;

public class occurences extends inheritArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);


        // TO find the occurences
        // System.out.print("Enter the element to find the occurences: ");
        // int element = sc.nextInt();
        // int count = 0;

        // for(int i=0; i<arr.length; i++){
        // if(arr[i] == element){
        // count++;
        // }
        // }
        // System.out.println("The number of occurences of " + element + " is: " +
        // count);


        // To find the last occurences
        // System.out.print("Enter the element to find the last occurence: ");
        // int element = sc.nextInt();
        // int indexIs = -1;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == element) {
        // indexIs = i;
        // }
        // }
        // if(indexIs != -1){
        // System.out.println("The last occurence of " + element + " is at index: " +
        // indexIs);
        // }
        // else{
        // System.out.println("Element does not exist in the array");
        // }


        // To find the sorted array or not
        int sorted = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] <= arr[i + 1]) {
                sorted = 1;
            } else {
                sorted = 0;
                break;
            }
        }
        if (sorted == 1) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }


        sc.close();
    }
}