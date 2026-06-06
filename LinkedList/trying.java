import java.util.LinkedList;
public class trying {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        System.out.println(list);
        System.out.println("Reversed List:");
        // Note: LinkedList does not have a built-in reverse method
        // You would need to implement this or use Collections.reverse()
    }
}