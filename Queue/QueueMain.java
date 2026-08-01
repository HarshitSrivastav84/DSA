public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue q = new CustomQueue(5);

        q.insert(2);
        q.insert(4);
        q.insert(6);
        q.insert(8);
        q.insert(10);
        q.display();
        System.out.println("Element deleted from the queue is: " + q.delete());
        System.out.println("Element deleted from the queue is: " + q.delete());
        System.out.println("Element deleted from the queue is: " + q.delete());
        System.out.println("Element deleted from the queue is: " + q.delete());
        System.out.println("Element deleted from the queue is: " + q.delete());
        q.insert(12);
        q.insert(14);
        q.display();
        System.out.println("Element at the last of the queue is: " + q.peek());
        System.out.println("Element deleted from the queue is: " + q.delete());
        System.out.println("Element deleted from the queue is: " + q.delete());

    }
}
