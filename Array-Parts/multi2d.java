import java.util.Scanner;

public class multi2d extends inherit2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the first array : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        create2dArray(arr1, r1, c1);

        System.out.println("Enter the number of rows and columns for the second array : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        create2dArray(arr2, r2, c2);

        System.out.println("First array  ");
        print2dArray(arr1, r1, c1);

        System.out.println("Second array : ");
        print2dArray(arr2, r2, c2);
        
        multi2d(arr1, arr2, r1, c1, r2, c2);
        sc.close();
    }

    public static void multi2d(int arr1[][], int arr2[][], int r1, int c1, int r2, int c2) {
        int multi[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    if (c1 != r2) {
                        System.out.println("Multiplication is not possible");
                        break;
                    } else {
                        multi[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        }
        System.out.println("Multiplication of the two arrays : ");
        print2dArray(multi, r1, c2);
    }
}