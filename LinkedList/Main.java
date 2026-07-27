public class Main{
    public static void main(String args[]){
        
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();

        list.reverseList(null);

        list.display();

        // list1.insert(24, 4);
        // list1.insert(42, 2);
        // list1.display();
        
        // System.out.println("Deleted value is: " + list1.deleteFirst());
        // list1.display();
        
        // System.out.println("Deleted value is: " + list1.deleteLast());
        // list1.display();
        
        // System.out.println("Deleted value is: " + list1.delete(-1));
        // list1.display();
        

        // System.out.println("After removing the duplicates element the list is");
        // list1.removeDuplicates();
        // list1.display();

        // list1.printSize();
    }
}