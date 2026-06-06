public class Main{
    public static void main(String args[]){
        LL list1 = new LL(); 

        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(1);
        list1.display();

        list1.insertLast(4);
        list1.insertLast(5);
        list1.display();
        
        list1.printSize();
    }
}