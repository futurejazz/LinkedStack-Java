public class StackMain {
    public static void main(String[] args) {
        // note: using the interface as the data type for s.
        Stack<Integer> s =  new LinkedStack<Integer>();
        try{
            s.push(5);
            s.push(9);
            s.push(3);
            s.push(s.pop() + s.pop());
            System.out.println(s.peek());
        }
        catch(Exception e) { System.out.print("An exception was thrown"); 
        }

    }
}