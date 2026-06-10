public class circularLL {

    private Node head;
    private Node tail;
    private int size;

    public circularLL() {
        this.size = 0;
    }

    // To display size of the list
    public void printSize(){
        System.out.println();
        System.out.println("The number of element in the list are: " + size);
    }

    class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }

    // To display the list
    public void display() {
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print(temp.value);
        temp = temp.next;
        while (temp != head) {
            System.out.print(" -> " + temp.value);
            temp = temp.next;
        }
        System.out.print(" == ");
        System.out.print(head.value);
        System.out.println();
    }

    // To insert at the start of the list
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null || tail == null) {
            head = tail = newNode;
            tail.next = head;
            size++;
            return;
        }
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
        size++;
    }

    // To insert at any particular index
    public void insert(int val, int index){
        Node newNode = new Node(val);
        if(index<0 || index>=size){
            System.out.println("Illegal index");
            return;
        }
        Node temp = head;
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == (size-1)){
            insertLast(val);
            return;
        }
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // To insert at the end of the list
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            insertFirst(val);
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
    }
    
    // To delete from start
    public int deleteFirst(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return -1;
        }
        int val = head.value;
        if(head == tail){
            head = tail = null;
            size--;
            return val;
        }
        temp = temp.next;
        tail.next = temp;
        head = temp;
        size--;
        return val;
    }

    // To delete from end
    public int deleteLast(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return -1;
        }
        int val = tail.value;
        if(head == tail){
            temp = head;
            head = tail = null;
            size--;
            return temp.value;
        }
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
        return val;
    }

    // To delete from a particular index
    public int delete(int index){
        Node temp = head;
        if(index<0 || index>size-1){
            System.out.println("Illegal index");
            return -1;
        }
        if(index == 0){
            deleteFirst();
            return head.value;
        }
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        int val = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return val;
    }
}
