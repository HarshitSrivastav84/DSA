public class Main{
    public static void main(String args[]){
        LL list1 = new LL(); 

        list1.insertFirst(12);
        list1.insertFirst(22);
        list1.insertFirst(13);
        // list1.display();

        list1.insertLast(4);
        list1.insertLast(64);
        list1.insertLast(7);
        // list1.display();

        list1.insert(24, 4);
        list1.insert(42, 2);
        list1.display();

        System.out.println("Deleted value is: " + list1.deleteFirst());
        list1.display();

        System.out.println("Deleted value is: " + list1.deleteLast());
        list1.display();

        System.out.println("Deleted value is: " + list1.delete(-1));
        list1.display();

        list1.printSize();
    }
}