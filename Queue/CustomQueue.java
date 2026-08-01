public class CustomQueue {
    private int data[];
    private static final int DEFAULT_SIZE = 5;

    int end = -1;
    
    CustomQueue(){
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size){
        this.data = new int[size];
    }

    public void insert(int item){
        if(isFull()){
            return;
        }
        else if(end == -1){
            end++;
            data[end] = item;
            return;
        }
        end++;
        data[end] = item;
    }

    public int delete() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removeItem = data[0];
        for(int i=1; i<data.length; i++){
            data[i-1] = data[i];
        }
        end--;
        return removeItem;
    }

    public void display(){
        if(isEmpty()){
            return;
        }
        for(int i=0; i<=end; i++){
            System.out.println(data[i] + " ");
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int atLast = data[end];
        return atLast;
    }

    public boolean isFull(){
        if(end == data.length-1){
            System.out.println("Queue is full");
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(end == -1){
            System.out.println("Queue is empty");
            return true;
        }
        return false;
    }
}
