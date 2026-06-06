public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    class Node {
        private int value;
        private Node next;

        // Constructor for Node class
        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // To insert a new node at the beginning of the linked list
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // To display the elements of the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println();
    }

    // To insert a new node at the end of the linked list
    public void insertLast(int val) {
        Node newNode = new Node(val);

        // If tail pointer is not present then we have to traverse
        // Node temp = head;
        // while(temp.next != null){
        // temp = temp.next;
        // }

        if(tail == null){
            System.out.println("List is empty");
            System.out.println("Insert some value first");
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    // To print size
    public void printSize(){
        System.out.println("The number of elements are: " + size);
    }
}