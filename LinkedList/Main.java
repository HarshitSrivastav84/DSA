public class Main{
    public static void main(String args[]){
        LL first = new LL(); 
        LL second = new LL(); 

        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(5);
        // list1.display();

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        // second.display();


        LL ans = new LL();
        ans.merge(first, second);

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