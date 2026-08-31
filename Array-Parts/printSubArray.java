public class printSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        printSubArray(arr);
    }

    private static void printSubArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for (int k = 1; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("sum = " + sum);
            }
        }
    }
}