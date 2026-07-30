import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class stackExamples {
    public static void main(String[] args){
        // Stack<Integer> s = new Stack<>();
        // s.push(34);
        // s.push(45);
        // s.push(2);
        // s.push(9);
        // s.push(18);

        // int del = s.pop();
        // System.out.println(del);
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());


        // Queue<Integer> q = new LinkedList<>();
        // q.add(3);
        // q.add(5);
        // q.add(19);
        // q.add(1);
        // q.add(6);

        // System.out.println(q.peek());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());


        Deque<Integer> d = new ArrayDeque<>();  // Used in trees
        d.add(89);
        d.addLast(78);
        d.removeFirst();
    }
}
