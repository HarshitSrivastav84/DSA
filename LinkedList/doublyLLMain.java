public class doublyLLMain {
    public static void main(String args[]){

        doublyLL list1 = new doublyLL();

        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        // list1.display();

        list1.insertLast(4);
        list1.insertLast(5);
        list1.display();

        list1.insert(11, 0);        
        list1.insert(22, 4);    
        list1.insert(33, 7);
        list1.display();

        System.out.println("Deleted element is: " + list1.deleteLast());
        list1.display();
        
        System.out.println("Deleted element is: " + list1.deleteStart());
        list1.display();

        list1.printSize();
    }
}
