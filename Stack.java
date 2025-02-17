
/* Defines the operations that all implementing classes must provide. */
public interface Stack<T> {
   
        /* Returns true if and only if the stack is empty 
        */
        public boolean isEmpty();

        /* Removes and returns the top element of the stack.
        Throws StackUnderflowException if the stack is empty. 
        */
        public T pop() throws StackUnderflowException;

        /* Returns the top element of the stack, but does not remove it. 
        Throws a StackUnderflowException if stack is empty. 
        */
        public T peek() throws StackUnderflowException;

        /* Adds the element onto the stack.
        */ 
        public void push(T element);

}
