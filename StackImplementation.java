import java.util.Stack;

import java.util.Iterator;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        //inserting element into the stack
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1);
        //deleting an element from the stack
        s1.pop();
        System.out.println(s1);
        //peek operation
        System.out.println(s1.peek());
        //checking if the stack in empty
        boolean status = s1.empty();
        System.out.println(status);
        //searching for an item in a stack
        int index_found = s1.search(3);
        System.out.print(index_found);
        //how to iterate over a stack
        Iterator it = s1.iterator();
        while(it.hasNext()) {
            
        }
    }
}
