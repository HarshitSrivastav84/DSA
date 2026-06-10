public class circularLLMain {
    public static void main(String args[]){
        
        circularLL list1 = new circularLL();
        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        // list1.display();

        list1.insertLast(4);
        list1.insertLast(5);
        // list1.insertLast(6);
        // list1.insertLast(7);
        list1.display();

        System.out.println("Deleted value is: " + list1.delete(2));
        list1.display();
        System.out.println("Deleted value is: " + list1.delete(0));
        list1.display();
        System.out.println("Deleted value is: " + list1.delete(5));
        list1.display();
        System.out.println("Deleted value is: " + list1.delete(2));
        list1.display();

        list1.printSize();

        // list1.insert(11, 2);
        // list1.insert(22, 4);
        // list1.insert(33, 0);
        // list1.display();
        // list1.insert(77, 10);
        // list1.display();
        // list1.insert(77, 9);
        // list1.display();


        // System.out.println("Deleted node is : " + list1.deleteFirst());
        // list1.display();
        // System.out.println("Deleted node is : " + list1.deleteLast());
        // list1.display();
        
    }
}
