public class LinkedStack<T> implements Stack<T>{
   /* This class implements a Stack with a linked list. */
   
   private LLNode<T> head;	// head of linked list, also stack top pointer
   
   public LinkedStack() { 
      head = null; 
   }
   
   public boolean isEmpty() {
   // return true if stack is empty, false otherwise
   	return (head == null);
   }
   
   public void push(T element) {
   // push an element to the stack
      LLNode<T> node = new LLNode<T>(element);
      node.setLink(this.head);
      this.head = node;
   }
   
   public T peek() throws StackUnderflowException {
      // return the head element of the stack without removing it
      if (head == null){
         return null;
      }
      T element = this.head.getData();
      return element;
   }
   
   public T pop() throws StackUnderflowException {
      // Removes head element from the stack and returns it
      // It throws StackUnderflowException if stack is empty

      T element = this.head.getData();
      if (this.head.getLink() == null){
         this.head = null;
      }
      else {
         this.head = this.head.getLink();
      }
      return element;
   }

}