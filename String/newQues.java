public class newQues {

  private static void solve(String str, String ans){
    if(str.length() == 0){
      System.out.println(ans);
      return;
    }
  }
  public static void main(String[] args){
    String str = "abc";
    solve(str.substring(1), ans + str.charAt(0));
    solve(str.substring(1), ans);
  }
}
