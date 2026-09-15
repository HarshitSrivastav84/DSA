import java.util.*;

class BalancedBrackets {
  public static void main(String[] args) {
    Stack<Character> st = new Stack<>();

    String str = ")(())()";
    int n = str.length();

    for (int i = 0; i < n; i++) {
      char ch = str.charAt(i);
      if (ch == '(') {
        st.push(ch);
      }
      else{
        if(st.size() == 0){
          System.out.println("Unbalanced brackets");
          return;
        }
        else if(st.peek() == '('){
          st.pop();
        }
      }
    }
    if(st.size() == 0){
      System.out.println("Balanced brackets");
    }
    else{
      System.out.println("Unbalanced brackets");
    }
  }
}