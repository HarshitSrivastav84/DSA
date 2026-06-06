import java.util.Scanner;
public class squareAndSort18 extends inheritArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();       
        int arr[] = new int[n];
        int arr2[] = new int[n];

        createArray(arr);
        createArray(arr2);
        int k = 0; // Points to arr2

        int i=0; // Points left
        int j=arr.length-1; // Points right

        while(i < j){
            if(Math.abs(arr[i]) < Math.abs(arr[j])){
                arr2[k++] = arr[j] * arr[j];
                j--;
            }
            else if(Math.abs(arr[i]) > Math.abs(arr[j])){
                arr2[k++] = arr[i] * arr[i];
                i++;
            }
            // else if(Math.abs(arr[i]) == Math.abs(arr[j])){
            //     arr2[k--] = arr[i] * arr[i];
            //     i++;
            //     j--;
            // }
        }
        printArray(arr2);
        sc.close();
    }
}
