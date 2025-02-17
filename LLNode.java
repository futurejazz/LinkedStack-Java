public class LLNode<T> {
/* Implements a node for use in a linked list;
 * Each node has a data field and a link to another node
 */

	private LLNode<T> link;
   private T data;

   public LLNode(T item) { 
      data = item; 
      link = null; 
   }

   public LLNode<T> getLink(){
      // return the node this node links to
      return link;
   }

   public void setLink(LLNode<T> link){
      // link this node to the given node
      this.link=link;
   }

   public T getData(){
      return data;
   }

   public void setData(T item){
      this.data = item;
   }
}