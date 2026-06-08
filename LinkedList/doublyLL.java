public class doublyLL {

    private Node head;
    private Node tail;
    private int size;

    public doublyLL() {
        this.size = 0;
    }

    public void printSize() {
        System.out.print("Number of element in the list are: " + size);
    }

    class Node {
        private int value;
        private Node next;
        private Node prev;

        // Constructor for node class
        private Node(int val) {
            this.value = val;
        }

        private Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }

        // private Node(int val, Node prev){
        // this.value = val;
        // this.prev = prev;
        // }
        private Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    // To display the list
    public void display() {
        Node temp = head;
        System.out.print("Start <- ");
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    // Insert at start
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.value = val;
        newNode.prev = null;
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Inserting at a particular index
    public void insert(int val, int index) {
        Node newNode = new Node(val);
        Node temp = head;
        if (index < 0 || index > size) {
            System.out.println("Illegal index");
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp.next.prev;
        temp.next = newNode;
        newNode.prev = temp;
        size++;
    }

    // Insert at last
    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    // Deleting from start
    public int deleteStart(){
        int val = head.value;
        if(head == null){
            System.out.println("List is empty");
        }
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // Deleting from last node
    public int deleteLast() {
        int val = tail.value;
        if(tail == null){
            System.out.println("List is empty");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
}