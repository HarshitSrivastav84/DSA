public class LabLL {
  Node head;
  Node tail;
}

// private LabLL(){
//   this.size = 0;
// }

class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("END");
  }
}


