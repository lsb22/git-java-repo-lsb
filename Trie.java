public class Main{
 static class Node{
   Node arr[];
   boolean eow;

   Node(){
     arr = new Node[26];
     for(int i=0;i<arr.length;i++){
       arr[i] = null;
     }

   }
  }
  static Node root = new Node();
  //root node is considered as empty because it doesn't represent any alphabet unlike other nodes but it does hold a node in its array which specifies an alphabet 
  
  public static void insert(String word){
    Node curr = root;// curr 1st points to root node, then to other nodes that will be created in the array     
    for(int i=0;i<word.length();i++){
       int idx = word.charAt(i) - 'a';
       if(curr.arr[idx] == null){
           curr.arr[idx] = new Node();
       }
       if(i == word.length()-1){
         curr.arr[idx].eow = true;
       }
       curr = curr.arr[idx];
     }
   
  }

  public static boolean search(String word){
    Node curr = root;
    for(int i=0;i<word.length();i++){
      int idx = word.charAt(i) - 'a';
      if(curr.arr[idx] == null){
        return false;
      }
      if(i == word.length()-1 && curr.arr[idx].eow == false){
        return false;
      }
      curr = curr.arr[idx];
    }
    return true;
  }

  public static boolean wordBreak(String key){
    if(key.length() == 0){
      return true;
    }
    for(int i=1;i<=key.length();i++){
      String one = key.substring(0,i);
      String two = key.substring(i);
      if(search(one) && wordBreak(two)){
        return true;
      }

    }

    return false;
    
    
  }
  public static boolean startsWith(String prefix){
     Node curr = root;
    for(int i=0;i<prefix.length();i++){
      int idx = prefix.charAt(i) - 'a';
      if(curr.arr[idx] == null) return false;
      curr = curr.arr[idx];
    }
     return true;
  }
  public static void main(String args[]){
    //String words[] = {"the","a","there","their","any","ant"};
    String words[] = {"i","like","sam","samsung","mobile"};
    for(String str: words){
      insert(str);
    }
    String prefix = "aam";
    System.out.println(startsWith(prefix));

    /*String key = "ilikesamsungh";
    System.out.println(wordBreak(key));*/
    /*System.out.println(search("the"));
    System.out.println(search("ant"));
    System.out.println(search("their"));
    System.out.println(search("an"));*/



  }
}
/*
public class MyClass {
    public static void main(String args[]) {
      List<Long> list1 = Collections.nCopies(5,10L);
      System.out.println(list1);
      Object x = list1.get(0);
      System.out.println(x.getClass().getName());
      Class xyz = x.getClass();
      System.out.println(xyz.getName());
      
    }
}*/