import java.util.Scanner;
public class evenAtStart18 extends inheritArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        int i=0; // Points left
        int j=arr.length-1; // Points right
        while(i < j){
            if(arr[i] % 2 == 0){
                i++;
            }
            else if(arr[i] % 2 != 0){
                if(arr[j] % 2 != 0){
                    j--;
                }
                else if(arr[j] % 2 == 0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                    j--;
                }
            }
        }
        printArray(arr);
        sc.close();
    }
}
