public class SumDigits {
    public static void main(String[] args){
        System.out.println(sumOfDigits(123874));
    }

    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        int x = n % 10;
        n = n / 10;
        return x + sumOfDigits(n);
    }
}
