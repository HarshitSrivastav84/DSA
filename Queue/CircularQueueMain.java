public class CircularQueueMain {
    public static void main(String[] args){
        CircularQueue queue = new CircularQueue(5);
        queue.insertCircular(1);
        queue.insertCircular(2);
        queue.insertCircular(3);
        queue.insertCircular(4);
        queue.insertCircular(5);

        queue.displayCircular();

        System.out.println("Element at the front is: " + queue.frontCircular());
        
        System.out.println("Element removed is: " + queue.removeCircular());
        System.out.println("Element removed is: " + queue.removeCircular());
        System.out.println("Element removed is: " + queue.removeCircular());
        System.out.println("Element removed is: " + queue.removeCircular());
        System.out.println("Element removed is: " + queue.removeCircular());
    }
}
