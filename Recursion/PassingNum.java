public class PassingNum {
    public static void main(String[] args){
        fun(5);
    }

    public static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);

        // Passes n first in the function and then decrements it.
        // fun(n--);

        // Decrements n first and then passes it in the function.
        fun(--n);
    }
}
