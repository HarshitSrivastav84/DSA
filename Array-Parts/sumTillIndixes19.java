import java.util.Scanner;
public class sumTillIndixes19 extends inheritArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        createArray(arr);

        System.out.println("Enter the index up to which you want to calculate the sum: ");
        int index = sc.nextInt();

        int sum = 0;
        if(index >= 0 && index < arr.length){
            for(int i=0; i<=index; i++){
                sum += arr[i];
            }
            System.out.print("The sum of elements from index 0 to " + index + " is: " + sum);
        }
        else{
            System.out.println("Invalid index. Please enter an index between 0 and " + (arr.length - 1));
        }
        sc.close();
    }
}
