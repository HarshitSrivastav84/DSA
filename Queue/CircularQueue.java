public class CircularQueue {
    protected int arr[];
    private static final int DEFAULT_SIZE = 10;

    int size = 0;
    int front = 0;
    int end = -1;

    CircularQueue() {
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        this.arr = new int[size];
    }

    public void insertCircular(int value) {
        if (isFull()) {
            return;
        }
        end++;
        arr[end] = value;

        // For making the queue circular and connect end with front
        end = end % arr.length;
        size++;
    }

    public int removeCircular(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int removeData = arr[front];
        front++;
        front = front % arr.length;
        size--;
        return removeData;
    }

    public int frontCircular(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontData = arr[front];
        return frontData;
    }

    public void displayCircular(){
        for(int i=front; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

}
