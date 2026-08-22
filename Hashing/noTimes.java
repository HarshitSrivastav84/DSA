import java.util.Scanner;

class noTimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // For storing
        int hash[] = new int[13];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] += 1;
        }

        // For fetching
        System.out.println("Enter the no. to check");
        int x = sc.nextInt();
        int num = hash[x];
        System.out.println(num);
    }
}