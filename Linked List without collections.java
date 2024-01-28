
public class Main{
Node head;
private int size;
Main(){
    this.size=0;
}

      class Node{
          
          
          String data;
          Node next;
          
          Node(String data){
              this.data = data;
              this.next=null;
              size++;
          }
      }
      
      public  void addFirst(String data){
          Node newNode = new Node(data);
          if(head==null){
              head = newNode;
              return;
          }
          newNode.next =head;
          head= newNode;
      }
      
      public  void addLast(String data){
          Node newNode = new Node(data);
          if(head==null){
              head= newNode;
              return;
          }
          Node currNode = head;
          while(currNode.next != null){
              currNode= currNode.next;
          }
          currNode.next= newNode;
      }
      
      public void deleteFirst(){
          if(head==null){
              System.out.println("Empty LinkedList");
              return;
          }
          size--;
          head=head.next;
      }
      
      public void deleteLast(){
          if(head==null){
            System.out.println("Empty LinkedList");  
            return;
          }
          size--;
          if(head.next==null){
              System.out.println("Single node");
              head=null;
              return;
          }
          Node secondLast = head;
          Node lastNode = head.next;
          
          while(lastNode.next !=null){
              secondLast=secondLast.next;
              lastNode= lastNode.next;
          }
          secondLast.next=null;
          
      }
      
      public  void printList(){
          Node currNode = head;
          while(currNode != null){
              System.out.print(currNode.data + "->");
              currNode= currNode.next;
          }
          System.out.print("Null");
      }
      
      public int getSize(){
          return size;
      }
      
	public static void main(String[] args) {
		Main list = new Main();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		System.out.println("");
		list.addLast("list");
		list.printList();
		System.out.println("");
		list.addFirst("this");
		list.printList();
		System.out.println("");
		list.deleteFirst();
		list.printList();
		System.out.println("");
		list.deleteLast();
		list.printList();
		System.out.println("");
		System.out.println(list.getSize());
	}
}
