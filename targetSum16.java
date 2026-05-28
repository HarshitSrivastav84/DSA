import java.util.Scanner;
public class targetSum16 extends inheritArray {

    public static void targetSum(int arr[], int requiredSum){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == requiredSum){
                    System.out.println("The pair is: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        System.out.print("Enter the required sum: ");
        int requiredSum = sc.nextInt();

        targetSum(arr, requiredSum);

        sc.close();
    }
}
