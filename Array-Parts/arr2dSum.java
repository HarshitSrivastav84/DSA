import java.util.Scanner;

public class arr2dSum extends inherit2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr1[][] = new int [r][c];
        create2dArray(arr1, r, c);

        int arr2[][] = new int [r][c];
        create2dArray(arr2, r, c);

        System.out.println("First Array : ");
        print2dArray(arr1, r, c);
        
        System.out.println("Second Array : ");
        print2dArray(arr2, r, c);

        int sum[][] = new int [r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of the two arrays : ");
        print2dArray(sum, r, c);
        sc.close();
    }
}

    

