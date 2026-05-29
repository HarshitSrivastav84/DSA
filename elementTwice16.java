import java.util.Scanner;

public class elementTwice16 extends inheritArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        // To find the element that occurs once
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            int x = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (x == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("The element that occurs once is: " + x);
            }
        }
        sc.close();
    }
}
