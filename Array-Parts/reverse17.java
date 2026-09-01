import java.util.Scanner;
public class reverse17 extends inheritArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        System.out.println("Array before reversing:");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();


        // byte b = (byte) 520;
        // byte a = 15;
        // System.out.println(a+b);
    }
}
