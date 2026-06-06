import java.util.Scanner;

public class prefixSum19 extends inheritArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int prefixSum[] = new int[n];

        createArray(arr);
        
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<=i; j++){
        //         sum += arr[j];
        //     }
        //     prefixSum[i] = sum;
        //     sum = 0; // Reset sum for next iteration
        // }


        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }        

        printArray(arr);
        printArray(prefixSum);
        sc.close();
    }
}
