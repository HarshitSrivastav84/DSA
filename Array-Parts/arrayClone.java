import java.util.Scanner;
public class arrayClone extends inheritArray {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int newArr[] = new int[size];

        createArray(newArr);
        printArray(newArr);

        sc.close();
    }
}
