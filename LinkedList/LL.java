public class LL {

    private Node head;
    private Node tail;

    private int size;

    // 
    public LL(){
        this.size = 0;
    }



    class Node{
        private int value;
        private Node next;

        // Constructor for Node class
        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}