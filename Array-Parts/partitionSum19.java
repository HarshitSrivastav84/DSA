import java.util.Scanner;
public class partitionSum19 extends inheritArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        createArray(arr);   

        int leftSum = arr[0];
        int rightSum = arr[arr.length - 1];
        int i = 1; // Points left
        int j = arr.length - 2; // Points right
        while(i < j){
            if(leftSum < rightSum){
                leftSum = leftSum + arr[i];
                i++;
            }
            else if(leftSum > rightSum){
                rightSum = rightSum + arr[j--];
            }
            else if(leftSum == rightSum){
                System.out.println("The array can be partitioned into two parts with equal sum at index: " + i);
                break;
            }
        }
    }
}