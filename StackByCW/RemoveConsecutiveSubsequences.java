import java.util.Stack;

public class RemoveConsecutiveSubsequences {
  public static void main(String[] args) {
    int arr[] = {1,2,2,3,10,10,4,4,4,5,7,7,2};
    int res[] = remove(arr);
    for(int i=0; i<res.length; i++){
      System.out.print(res[i] + " ");
    }
  }

  public static int[] remove(int arr[]){
    Stack<Integer> st = new Stack<>();

    for(int i=0; i<arr.length; i++){
      if(st.size() == 0){
        st.push(arr[i]);
      }
      else if(st.peek() != arr[i]){
        st.push(arr[i]);
      }
      else if(arr[i] == st.peek()){
        if(arr[i] == arr[i+1]){

        }
        else if( i == arr.length-1 || arr[i] != arr[i+1]){
          st.pop();
        }
      }
    }
    int res[] = new int[st.size()];
    for(int j=res.length-1; j>=0; j--){
      res[j] = st.pop();
    }
    return res;
  }
}
