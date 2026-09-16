import java.util.Stack;

class NextGreaterElement{
  public static void main(String[] args){
    int arr[] = {1,3,2,1,8,6,3,4};
    int res[] = check(arr);
    for(int i=0; i<res.length; i++){
      System.out.print(res[i] + " ");
    }
  }
  public static int[] check(int arr[]){
    Stack<Integer> st = new Stack<>();
    int res[] = new int[arr.length];
    res[arr.length-1] = -1;
    st.push(arr[arr.length-1]);

    for(int i=res.length-2; i>=0; i--){
      while(st.size() >= 0){
        if(st.size() == 0){
          st.push(arr[i]);
          res[i] = -1;
          break; 
        }
        if(arr[i] < st.peek()){
          res[i] = st.peek();
          st.push(arr[i]);
          break;
        }
        else if(arr[i] > st.peek()){
          st.pop();
        }
      }
    }

    return res;
  }
} 