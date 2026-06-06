import java.util.Scanner;
public class multipleCheck17 extends inheritArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        System.out.print("Enter how many numbers to check: ");
        int x = sc.nextInt();

        int found = 0;
        while(x > 0){
            x--;
            System.out.print("Enter the number to check: ");
            int a = sc.nextInt();
            for(int i=0; i<arr.length; i++){
                if(arr[i] == a){
                    found = 1;
                    break;
                }
                else{
                    found = 0;
                }
            }
            if(found == 1){
                System.out.println("Yes, number is present in the array.");
            }
            else if(found == 0){
                System.out.println("No, number is not present in the array.");
            }
        }
        sc.close();
    }
}
