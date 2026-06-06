import java.util.Scanner;

public class inplaceTranspose extends inherit2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        create2dArray(arr, r, c);
        System.out.println("Original Array:");
        print2dArray(arr, r, c);

        inplaceTranspose(arr, r, c);
        System.out.println("Transposed Array:");
        print2dArray(arr, c, r);
        sc.close();
    }

    public static void inplaceTranspose(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
