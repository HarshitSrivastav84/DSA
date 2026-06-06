import java.util.Scanner;
public class searchElement {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int element = -1;
        System.out.println("Enter the element to search");
        int searchElement = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == searchElement){
                System.out.println("Element is at index: " +i);
                element = 1;
            }
        }
        if(element == -1){
            System.out.println("-1");
        }
        sc.close();
    }
}
