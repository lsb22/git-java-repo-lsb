import java.util.*;

//import java.util.HashSet;
//import java.util.Iterator;
/*public class Main {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);

   // System.out.println(set);
    //set.remove(2);
    System.out.println(set);

   // System.out.println(set.contains(2));
   // System.out.println(set.size());

    Iterator tony = set.iterator();
    //System.out.println(tony.next());

    while(tony.hasNext())
       System.out.println(tony.next());
  }
}*/

// HashMap

/*public class Main{
  public static void main(String args[]){
    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("INDIA",130);
    hm.put("UK",50);
    hm.put("USA", 70);

    //System.out.println(hm);
    hm.put("USA", 80);

    System.out.println(hm.containsKey("INDIA"));
    System.out.println(hm.get("INDIA"));

    for(Map.Entry<String,Integer> element : hm.entrySet()){
      System.out.print(element.getKey() + " = ");
      System.out.println(element.getValue());
    }

    Set<String> keys = hm.keySet();

    for(String info : keys){
      System.out.println(info + " --> " + hm.get(info));
    }



  }
}*/

//generics

/*class Print<T>{
  T object;

  Print(T value){
     this.object = value;
  }

  public void execute(){
    System.out.println(this.object);
  }
}

public class Main{
  public static void main(String args[]){
    Print<String> p1 = new Print<>("LSB");
    Print<Integer> p2 = new Print<>(100);
    p1.execute();
    p2.execute();
  }
}*/

/*
public class Main{
  private static <T,L> void print(T value,L info){//generic method
      // here I <T,L> have been included after static to indicate that T and L written in parameter are generics
      System.out.print(value+" ");
      System.out.println(info);
  }

  private static void print2(List<?> l1){
     System.out.println(l1);
  }
  public static void main(String args[]){
    print(123,"bye");
    print("Hello",55);
    print('$',"Namaste");

    List<Integer> l1 = new ArrayList<>();
    l1.add(111);
    print2(l1);
  }


}
*/
//HashMap internal implementation

/*public class Main{
  static class HashMap<K,V>{
    private class Node{
      K key;
      V value;

      public Node(K keys,V values){
         key = keys;
         value = values;
       }
    }

    private LinkedList<Node> buckArr[];
    private int n;//no of nodes
    private int N;// size of the array

    @SuppressWarnings("unchecked")
    public HashMap(){
      this.N = 4;
      buckArr = new LinkedList[N];

      for(int i=0;i<buckArr.length;i++){
        buckArr[i] = new LinkedList<>();
        }

    }

    private int biGiver(K key){
      int bi = key.hashCode();
      return Math.abs(bi) % N;
    }

    private int diGiver(K key,int bi){
       LinkedList<Node> ll = buckArr[bi];

      for(int i=0;i<ll.size();i++){
        if(ll.get(i).key == key){
            return i;
         }
      }
      return -1;
    }
     @SuppressWarnings("unchecked")
    private void rehash(){
      LinkedList<Node> oldBuck[] = buckArr;

      buckArr = new LinkedList[N*2];

      for(int i=0;i<buckArr.length;i++){
        buckArr[i] = new LinkedList<>();
      }

      for(int i=0;i<oldBuck.length;i++){
        LinkedList<Node> ll = oldBuck[i];

        for(int j=0;j<ll.size();j++){
          Node node = ll.get(j);
          put(node.key,node.value);

        }
      }

    }

    public void put(K key, V value){
      int bi = biGiver(key); //bi--> bucket index
      int di = diGiver(key,bi); // di--> data index

      if(di == -1){
        buckArr[bi].add(new Node(key,value));
        n++;
      }else{
       Node node = buckArr[bi].get(di);
       node.value = value;

      }

      double lambda = (double) n/N;
      if(lambda > 2.0){
        rehash();
      }
    }

    public V get(K key){
      int bi = biGiver(key);
      int di = diGiver(key, bi);

      if(di == -1){
        return null;
      }else{
        Node node = buckArr[bi].get(di);
        return node.value;
      }
    }

    public V remove(K key){
        int bi = biGiver(key);
        int di = diGiver(key, bi);

        if(di == -1) return null;
        else{
          Node node = buckArr[bi].remove(di);
          n--;
          return node.value;
        }

    }

    public boolean contains(K key){
      int bi = biGiver(key);
      int di = diGiver(key, bi);

      if(di == -1) return false;
      else return true;
    }

    public boolean isEmpty(){
      return n==0;
    }

    public ArrayList<K> keySet(){
      ArrayList<K> keys = new ArrayList<>();

      for(int i=0;i<buckArr.length;i++){
        LinkedList<Node> ll = buckArr[i];
          for(int j=0;j<ll.size();j++){
             Node node = ll.get(j);
             keys.add(node.key);
          }
       }
      return keys;
    }

  }
  public static void main(String args[]){
    HashMap<String,Integer> hm = new HashMap<>();
    hm.put("India",1000);
    hm.put("China",800);
    hm.put("Usa",700);
    ArrayList<String> arr = hm.keySet();
    for(int i=0;i<arr.size();i++){
      System.out.println(arr.get(i) + " : " + hm.get(arr.get(i)));
    }

    hm.remove("China");
    System.out.println(hm.get("India"));
    System.out.println(hm.contains("China"));
  }


}

*/

/*public class Main{
    public static void main(String args[]){
       // String str = "ab CD ef gh";
       // String str = "ab::CD::ef:gh";
       // String str = "a:bC:De:fg:h";
        String s = " Hi hello bye ";
       // String store[] = str.split(":",3);
       for(String cont : s.split(" ")) System.out.println(cont);


       for(String cont : s.trim().split(" ")){
           System.out.println(cont);
         }

       // System.out.println(Arrays.toString(store));
    }
}
*/
/*

public class Main {
    public static void main(String args[]) {
      String s = " Hello Hi       Bye   ";
      String arr[] = s.trim().split(" ");
      //System.out.print(Arrays.toString(arr));
      String str = "";
      int i = arr.length-1;

      while(i>=0){
          if(arr[i] == " "){
              i--;
          }else{
              str = str + arr[i--];

          }
      }

      System.out.println(str);
    }
}

 */

class Val{
  Integer x;
  public Val(Integer i){
    this.x = i;
  }
  public void print(){
    System.out.println(x);
  }
}


public class Main{
  public static void main(String args[]){
    Val v = new Val(23);
    v.print();

  }
}
