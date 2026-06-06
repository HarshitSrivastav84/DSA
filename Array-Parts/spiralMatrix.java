import java.util.Scanner;

public class spiralMatrix extends inherit2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        create2dArray(arr, r, c);

        spiralElements(arr, r, c);

        sc.close();
    }

    public static void spiralElements(int arr[][], int r, int c) {
        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // top row
            for (int i = leftCol; i <= rightCol; i++) {
                System.out.print(arr[topRow][i] + " ");
            }
            topRow++;
            // right column
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(arr[i][rightCol] + " ");
            }
            rightCol--;
            // bottom row
            for (int i = rightCol; i >= leftCol; i--) {
                System.out.print(arr[bottomRow][i] + " ");
            }
            bottomRow--;
            // left column
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(arr[i][leftCol] + " ");
            }
            leftCol++;
        }
    }
}
