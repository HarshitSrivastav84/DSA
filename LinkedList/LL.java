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

    // To insert at particular index
    public void insert(int val, int index) {
        Node newNode = new Node(val);
        Node temp = head;
        int onIndex = 0;
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Illegal index");
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        while (onIndex < index - 1) {
            onIndex++;
            temp = temp.next;
        }
        Node nextAddress = temp.next;
        temp.next = newNode;
        newNode.next = nextAddress;
        size++;
        return;
    }

    // To insert a new node at the end of the linked list
    public void insertLast(int val) {
        Node newNode = new Node(val);

        // If tail pointer is not present then we have to traverse
        // Node temp = head;
        // while(temp.next != null){
        // temp = temp.next;
        // }

        if (tail == null) {
            System.out.println("List is empty");
            System.out.println("Inserting as the first element");
            insertFirst(val);
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        size++;
    }

    // To delete the first element
    public int deleteFirst() {
        int val = head.value;
        if(head == null){
            System.out.println("List is empty, can't delete");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // To delete at particular index
    public int delete(int index){
        Node temp = head;
        if(index<0 || index>=size){
            System.out.println("Illegal index");
            return -1;
        }
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        if(temp.next == tail){
            tail = temp;
        }
        size--;
        return val;
    }

    // To delete at last index
    public int deleteLast(){
        int val = tail.value;
        Node temp = head;
        for(int i=1; i<size-1; i++){
            temp = temp.next;
        }
        temp.next = null;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // To print size
    public void printSize() {
        System.out.println("The number of elements are: " + size);
    }
}