import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        createPascalsTriangle(arr, n);
        sc.close();
    }

    public static void createPascalsTriangle(int arr[][], int n){
        arr[0][0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j ==0 || j == i){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
