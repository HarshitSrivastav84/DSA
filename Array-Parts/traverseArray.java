public class traverseArray {
    public static void main(String[] args) {

        int arr[] = {2,3,5,7,9};
        
        // for, foreach, while

        //  1: for loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2: foreach loop
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();

        // 3: while loop
        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
