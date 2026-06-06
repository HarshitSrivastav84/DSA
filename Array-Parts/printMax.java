import java.util.Scanner;
public class printMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
        sc.close();
    }
}
