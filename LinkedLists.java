public class LinkedLists{
  Node head;
  class Node{
    String data;
    Node next;

    Node(String data){
      this.data = data;
      this.next = null;
    }
  }

  // adding Node in the front
  public void addFront(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }
  // adding Node at the end
  public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    Node currNode = head;
    while(currNode.next != null ){
      currNode = currNode.next;
    }

    currNode.next = newNode;
    
  }

  public void print(){
    if(head == null){
      System.out.println("This is an empty list");
    }

    Node currNode = head;
    while(currNode != null){
      System.out.print(currNode.data + "-->");
      currNode = currNode.next;
    }
    
    System.out.println("NULL");
    
  }

  public static void main(String args[]){
    LinkedLists list1 = new LinkedLists();
    list1.addFront("is");
    list1.addLast("a");
    list1.addFront("This");
    list1.addLast("list");
    list1.print();
  }
  
  
}