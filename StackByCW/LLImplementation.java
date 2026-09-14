import java.util.Stack;

public class LLImplementation {
  public static void main(String[] args) {
    LLStack st = new LLStack();
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

  public static class Node{   // User defined data types
    int val;
    Node next;
    
    Node(int val){
      this.val = val;
    }
  }

  public static class LLStack{  // User defined data structure
    private Node head = null;
    private int size = 0;

    void push(int x){
      Node temp = new Node(x);
      // temp.next = null;
      temp.next = head;
      head = temp;
      size++;
    }

    void display(){
      
    }

    void displayRev(){
      Node temp = head;
      while(temp != null){
        System.out.print(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }

    int size(){       // Getter
      return size;
    }

    int pop(){
      if(head == null){
        System.out.println("Stack is empty!");
        return -1;
      }
      int temp = head.val;
      head = head.next;
      size--;
      return temp;
    }

    int peek(){
      if(head == null){
        System.out.println("Stack is empty!");
        return -1;
      }
      return head.val;
    }

    boolean isEmpty(){
      if(size == 0) return true;
      return false;
    }
  }
}
