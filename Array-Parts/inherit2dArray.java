import java.util.Scanner;

public class inherit2dArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        create2dArray(arr, r, c);
        print2dArray(arr, r, c);
    }

    // To take input in 2d array
    public static void create2dArray(int arr[][], int r, int c) {
        Scanner sc = new Scanner(System.in);

        // To take input in 2d array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the element at " + i + " " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // To print the 2d array
    public static void print2dArray(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // To transpose the 2d array in same array
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