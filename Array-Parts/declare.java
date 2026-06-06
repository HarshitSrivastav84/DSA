import java.util.Scanner;
public class declare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
