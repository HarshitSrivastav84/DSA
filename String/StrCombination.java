public class StrCombination {
  public static void main(String[] args){
    String str = "abc";
    solve(str,"");
  }

  public static void solve(String str, string ans){
    if(str.length() == 0){
      System.out.println(ans);;
      return;
    }
    for(int i=0; i<str.length(); i++){
      solve(str.substring(0, i) + str.substring(i + 1), ans + str);
    }
  }
}

