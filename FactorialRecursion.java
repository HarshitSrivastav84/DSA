public class FactorialRecursion {
  static int count = 0;
  public static void main(String[] args){
    ways(4);
    System.out.println(count);
  }
  
  private static void ways(int n, int count){
    if(n == 0 || n == 1){
      count++;
      return;
    }
    ways(n-1, count+1);
    ways(n-2, count+1);
  }
}
