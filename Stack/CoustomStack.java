public class CoustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    
    public CoustomStack(){
        this(DEFAULT_SIZE);
    }
    
    public CoustomStack(int size){
        this.data = new int[size];
    }
    
    public int push(int value){
        if(isFull()){
            System.out.println("Stack is full. Can't push element in the stack.");
            return -1;
        }
        ptr++;
        data[ptr] = value;
        System.out.println(data[ptr]);
        return value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty. Can't pop element from the stack.");
            return -1;
        }
        int popData = data[ptr];
        ptr--;
        return popData;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int topElement = data[ptr];
        
        return topElement;
    }

    public boolean isFull(){
        if(ptr == data.length-1){
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        if(ptr == -1){
            return true;
        }
        return false;
    }

    

}
