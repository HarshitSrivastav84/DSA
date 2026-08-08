public class ReverseNum {

    // Can be done by passing single argument in the method.
    //  static int newNum = 0;

    public static void main(String[] args){
        System.out.println(reverse(123874, 0));
    }

    public static int reverse(int n, int newNum){
        if(n == 0){
            return newNum;
        }
        int x = n % 10;
        n = n / 10;
        newNum = newNum * 10 + x;
        return reverse(n, newNum);
        // return reverse(n/10, newNum*10 + x);
    }
}
