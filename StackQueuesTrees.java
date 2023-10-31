import java.util.*;
//Stack from scrath using LinkedLists
/*
 class Main{

  static Node head;

    static class Node{
        int data;
        Node next;

         Node(int num){
            data = num;
            next = null;
        }

    }

      static class Stack{

            public void push(int num){
                Node n1 = new Node(num);
                if(head == null){
                    head = n1;
                }
                n1.next = head;
                head = n1;
            }

            public int pop(){
                int val = head.data;
                head = head.next;
                return val;
            }

            public int peek(){
                return head.data;
            }
        }

        public static void main(String args[]){
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);

            System.out.println(s1.peek());

        }



}
*/
//or
 /*class Link{

   Node head;

     class Node{
        int data;
        Node next;

         Node(int num){
            data = num;
            next = null;
        }

    }

       class Stack{

            public void push(int num){
                Node n1 = new Node(num);
                if(head == null){
                    head = n1;
                }
                n1.next = head;
                head = n1;
            }

            public int pop(){
                int val = head.data;
                head = head.next;
                return val;
            }

            public int peek(){
                return head.data;
            }
        }

        public void tryIt(){
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);

            System.out.println(s1.peek());

        }

}


class Main{
    public static void main(String args[]){
        Link one = new Link();

        one.tryIt();
    }
}
*/

//stack from ArrayList 


/*
class Dsa{
    class Stack{
        ArrayList<String> arr = new ArrayList<>();

        public boolean isEmpty(){
            return arr.size() == 0;
        }

       public void push(String str){
           arr.add(str);
       }

       public String pop(){
           if(isEmpty()){
               return "-1";
           }

           String store = arr.get(arr.size()-1);
           arr.remove(arr.size()-1);
           return store;
       }

       public String peek(){
           if(isEmpty()){
               return "-1";
           }
           return arr.get(arr.size()-1);
       }



    }

    public void print(){
        Stack set = new Stack();
        set.push("one");
        set.push("two");
        set.push("three");
        set.push("four");

       // System.out.println(set.peek());

        while(!set.isEmpty()){
            System.out.println(set.peek());
            set.pop();
        }
    }


}

 class MyClass{
    public static void main(String args[]){
        Dsa d1 = new Dsa();
        d1.print();
    }
  }
*/



//or
//Stack from scrath

 /*class Main{

  static Node head;

    static class Node{
        int data;
        Node next;

         Node(int num){
            data = num;
            next = null;
        }

    }

      static class Stack{

            public void push(int num){
                Node n1 = new Node(num);
                if(head == null){
                    head = n1;
                }
                n1.next = head;
                head = n1;
            }

            public int pop(){
                int val = head.data;
                head = head.next;
                return val;
            }

            public int peek(){
                return head.data;
            }
        }

        public static void main(String args[]){
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);

            System.out.println(s1.peek());

        }



}
*/
//or
 /*class Link{

   Node head;

     class Node{
        int data;
        Node next;

         Node(int num){
            data = num;
            next = null;
        }

    }

       class Stack{

            public void push(int num){
                Node n1 = new Node(num);
                if(head == null){
                    head = n1;
                }
                n1.next = head;
                head = n1;
            }

            public int pop(){
                int val = head.data;
                head = head.next;
                return val;
            }

            public int peek(){
                return head.data;
            }
        }

        public void tryIt(){
            Stack s1 = new Stack();
            s1.push(1);
            s1.push(2);
            s1.push(3);
            s1.push(4);

            System.out.println(s1.peek());

        }

}


class Main{
    public static void main(String args[]){
        Link one = new Link();

        one.tryIt();
    }
}
*/

//stack from ArrayList 

/*

class Dsa{
    class Stack{
        ArrayList<String> arr = new ArrayList<>();

        public boolean isEmpty(){
            return arr.size() == 0;
        }

       public void push(String str){
           arr.add(str);
       }

       public String pop(){
           if(isEmpty()){
               return "-1";
           }

           String store = arr.get(arr.size()-1);
           arr.remove(arr.size()-1);
           return store;
       }

       public String peek(){
           if(isEmpty()){
               return "-1";
           }
           return arr.get(arr.size()-1);
       }



    }

    public void print(){
        Stack set = new Stack();
        set.push("one");
        set.push("two");
        set.push("three");
        set.push("four");

       // System.out.println(set.peek());

        while(!set.isEmpty()){
            System.out.println(set.peek());
            set.pop();
        }
    }


}

 class MyClass{
    public static void main(String args[]){
        Dsa d1 = new Dsa();
        d1.print();
    }
  }
*/



//or

/*class Stack{
        ArrayList<String> arr = new ArrayList<>();

        public boolean isEmpty(){
            return arr.size() == 0;
        }

       public void push(String str){
           arr.add(str);
       }

       public String pop(){
           if(isEmpty()){
               return "-1";
           }

           String store = arr.get(arr.size()-1);
           arr.remove(arr.size()-1);
           return store;
       }

       public String peek(){
           if(isEmpty()){
               return "-1";
           }
           return arr.get(arr.size()-1);
       }

    public void print(){
        Stack set = new Stack();
        set.push("one");
        set.push("two");
        set.push("three");
        set.push("four");

       // System.out.println(set.peek());
       while(!set.isEmpty()){
           System.out.println(set.peek());
           set.pop();
       }
    }

} 

public class Main{
    public static void main(String args[]){
      Stack s1 = new Stack();
      s1.print();

    }
}
*/

//direct method

/*public class Main{
  public static void main(String args[]){
    Stack<Integer> set1 = new Stack<Integer>();
    set1.push(1);
    set1.push(2);
    set1.push(3);
    set1.push(4);
    System.out.println(set1.peek());
  }
}*/

//Queue

// queue from scratch through an array

  /*class Queue{
    int[] arr;
    int Rear = -1;

    Queue(int size){
        arr = new int[size];
    }

    public void add(int data){
        if(Rear == arr.length-1){
            System.out.println("Queue(array) is full");

            return;
        }

        //Rear++;
        arr[++Rear] = data;
    }

    public int remove(){
        if(Rear == -1){
            System.out.println("Queue is empty;nothing to remove");
            return -1;
        }

        int Front = arr[0];// to return the value, I am assigning

        for(int i=0;i<Rear;i++){
            arr[i] = arr[i+1];
        }

        Rear--;

        return Front;
    }

    public int peek(){
        if(Rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[0];
    }

    public void execute(){
        Queue q1 = new Queue(5);

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

       // System.out.println(q1.peek());

           for(int i=0; i<arr.length; i++){
               System.out.println(q1.peek());
               q1.remove();
           }

    }

  }


public class Main{
    public static void main(String args[]){
        Queue q2 = new Queue(5);
        q2.execute();
    }
}
*/

//circular Queue through an array

/*class Queue{
    int arr[];
    int Front = -1;
    int Rear = -1;

    Queue(int size){
        arr = new int[size];
    }

    public void add(int data){
        if((Rear+1)%arr.length == Front){
            System.out.println("Queue if full");
            return;
        }

        if(Front == -1){ //while adding 1st element 
            Front = 0;
        }

        Rear = (Rear+1) % arr.length;
        arr[Rear] = data;
    }

    public int remove(){
        if(Front == -1 && Rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[Front];

        if(Front == Rear){ // when we have a single element
            Front = Rear = -1;
        }else{
            Front = (Front+1) % arr.length;
        }

        return val;
    }

    public int peek(){
        if(Front == -1 && Rear == -1){
            System.out.println("Queue is empty");
            return -1;
     }
     return arr[Front];
   }

   public void execute(){
       Queue q1 = new Queue(5);
       q1.add(1);
       q1.add(2);
       q1.add(3);
       q1.add(4);
       q1.add(5);

      q1.remove();
      q1.remove();
      q1.add(6);
      q1.add(7);

      for(int i=0; i<arr.length;i++){
          System.out.println(q1.peek());
          q1.remove();
      }
   }

}


 public class Main{
    public static void main(String args[]){
        Queue q2 = new Queue(5);
        q2.execute();
    }
}
*/

// queue through LinkedLists

/*class Queue{
    Node head = null;
    Node tail = null;
    class Node{
        int data;
        Node next;

        Node(int info){
            data = info;
            next = null;
        }

    }

    public void add(int info){
        Node newNode = new Node(info);
        if(head == null && tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public int remove(){
        if(head == null && tail == null){
            return -1;
        }

        //for single node

        int val = head.data;

        if(head == tail){
            head = tail = null;
        }

        head = head.next;
        return val;
    }

    public int peek(){
        if(head == null && tail == null){
            return -1;
        }

        return head.data;
    }

    public void execute(){
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(4);
        q1.add(6);

       System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());

        while(head == null){
            System.out.println(q1.peek());
            q1.remove();
        }


  }
}

public class Main{
    public static void main(String args[]){
        Queue q2 = new Queue();
        q2.execute();
    }

}
*/


// queue direct 

/*public class Main{
  public static void main(String atgs[]){
    //Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q1 = new ArrayDeque();
    q1.add(1);
    q1.add(2);
    q1.add(3);
    q1.add(4);

    //System.out.println(q1.peek());
    while(!q1.isEmpty()){
          System.out.println(q1.peek());
     q1.remove();
    }
  }
}*/

//Build Tree from given Preorder Sequence

/* public class Main{
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int info){
     data = info;
     left = null;
     right = null; 

    }
  }

   public static int idx = -1;



    public static Node treeBuild(int arr[]){
      idx++;
      if(arr[idx] == -1){
        return null;
      }
      Node newNode = new Node(arr[idx]);
      newNode.left = treeBuild(arr);
      newNode.right = treeBuild(arr);
      return newNode;

    }

   public static void preorder(Node rootNode){
     if(rootNode == null){
      return;
      }
     System.out.print(rootNode.data + " ");
     preorder(rootNode.left);
     preorder(rootNode.right);

    }

   public static void inorder(Node rootNode){
    if(rootNode == null){
      return;
    }

     inorder(rootNode.left);
     System.out.print(rootNode.data + " ");
     inorder(rootNode.right);

   }

    public static void postorder(Node rootNode){
      if(rootNode == null){
        return;
      }
      postorder(rootNode.left);
      postorder(rootNode.right);
      System.out.print(rootNode.data + " ");
    }

   public static void levelorder(Node rootNode){
     Queue<Node> q1 = new LinkedList<>();
     q1.add(rootNode);
     q1.add(null);

     while(!q1.isEmpty()){
       Node curr = q1.remove();
       if(curr == null){
         System.out.println();
         if(q1.isEmpty()){
           break;
         }else{
           q1.add(null);
         }
       }else{
         System.out.print(curr.data + " ");
         if(curr.left != null){
           q1.add(curr.left);
          }
         if(curr.right != null){
          q1.add(curr.right);
          }
        }
     }
   }

    public static void main(String args[]){
      int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      Node rootNode = treeBuild(arr);
      //preorder(rootNode);
      //inorder(rootNode);
      //postorder(rootNode);
      levelorder(rootNode);


      //System.out.println(rootNode.data);

    }
 }
 */

// Binary Search Tree

/*public class Main{
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int info){
     data = info;
   }
  }


  public static Node build(int val, Node rootNode){
      if(rootNode == null){
        rootNode = new Node(val);
        return rootNode;
      }

      if(val > rootNode.data){
        rootNode.right = build(val, rootNode.right);
      }

     if(val < rootNode.data){
        rootNode.left = build(val, rootNode.left);
      }

     return rootNode;
   }

   public static void inorder(Node rootNode){

      if(rootNode == null){
         return;
        }
       inorder(rootNode.left);
       System.out.print(rootNode.data + " ");
       inorder(rootNode.right);

    }

   public static boolean search(Node rootNode, int value){

     if(rootNode == null){
       return false;
     }

     if(value == rootNode.data){
      return true;
     }

     if(value > rootNode.data){
       return search(rootNode.right, value);
     }else{
       return search(rootNode.left, value);
     }

  }

   public static Node delete(Node rootNode, int value){
      //searching the node
      if(value > rootNode.data){
         rootNode.right = delete(rootNode.right,value);
       }else if(value < rootNode.data){
         rootNode.left = delete(rootNode.left,value);
       }


     else{


     if(rootNode.left == null && rootNode.right == null){ // if it has no child nodes
          return null;
     }

     if(rootNode.right == null){ // if it has a single child
         return rootNode.left;
     }else if(rootNode.left == null){ // if it has a single child
       return rootNode.right;
     }  
       // if it has both child
       Node inSuccessor = findInSuccessor(rootNode.right);
       rootNode.data = inSuccessor.data;
       rootNode.right = delete(rootNode.right,inSuccessor.data);
     }

    return rootNode;


 }

  public static Node findInSuccessor(Node rootNode){
    while(rootNode.left != null){
      rootNode = rootNode.left;
    }
    return rootNode;
  }

  public static void printInRange(Node rootNode,int x,int y){
       if(rootNode == null){
           return;
        }

       if(rootNode.data >= x && rootNode.data <= y){
          printInRange(rootNode.left,x,y);
          System.out.print(rootNode.data + " ");
          printInRange(rootNode.right, x, y);
        }
        else if(rootNode.data > y){
          printInRange(rootNode.left, x, y);
        }
        else{
          printInRange(rootNode.right, x, y);
        }


   }

    public static void main(String args[]){
       int[] values = {8,5,3,1,4,6,10,11,14};
       Node rootNode = null;
      for(int i=0;i<values.length; i++){
        rootNode = build(values[i], rootNode);
      }

      //inorder(rootNode);
     // System.out.println(search(rootNode,10));

      //if(search(rootNode,2)){
      // System.out.println("Given number is found");
      // }else{
      //  System.out.println("Given number can\'t be found");
      //}
      inorder(rootNode);
      System.out.println();

      printInRange(rootNode,4,14);

     // delete(rootNode,5);
     // System.out.println();
     // inorder(rootNode);


   }
}
*/

// HashSet




