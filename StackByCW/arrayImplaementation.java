public class arrayImplaementation {
  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(4);
    st.push(5);
    st.push(1);
    st.display();
    st.pop();
    System.out.println(st.peek());
    System.out.println(st.size());
    st.pop();
    st.display();
    st.pop();
  }

  public static class Stack{
    private int arr[] = new int[5];
    private int idx = 0;        // Also tells the size
    void push(int x){
      arr[idx] = x;
      idx++;
    }

    int peek(){
      if(idx == 0){
        System.out.println("Stack is empty!");
        return -1;
      }
      return arr[idx-1];
    }

    int pop(){
      if(idx == 0){
        System.out.println("Stack is empty!");
        return -1;
      }
      idx--;
      int top = arr[idx];
      arr[idx] = 0;
      return top;
    }

    void display(){
      for(int i=0; i<=idx-1; i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    int size(){
      return idx;
    }

    boolean isEmpty(){
      if(idx == 0) return true;
      return false;
    }

    boolean isFull(){
      if(idx == arr.length) return true;
      return false;
    }

  }
}
