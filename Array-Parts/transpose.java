import java.util.Scanner;
public class transpose extends inherit2dArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the array : ");
        int r = sc.nextInt();       
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        create2dArray(arr, r, c);
        System.out.println("Original Array:");
        print2dArray(arr, r, c);
        
        int transpose[][] = new int[c][r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed Array:");
        print2dArray(transpose, c, r);
        sc.close();
    }
}