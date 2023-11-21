import java.util.*;
/*

//PriorityQueue
public class Main {
  public static void main(String[] args) {
    //Queue<Double> q = new LinkedList<>();
    Queue<Double> q = new PriorityQueue<>(Collections.reverseOrder());
    q.offer(9.5);
    q.offer(8.5);
    q.offer(10.0);
    q.offer(9.0);
    q.offer(8.0);
    while(!q.isEmpty()){
      System.out.print(q.poll()+ "-->");
    }
    System.out.print("Null");
  }
}*/

class MaxHeap{
     int arr[];
     int MaxSize;
     int HeapSize;

  public MaxHeap(int size){
     MaxSize = size;
     arr = new int[size];
     HeapSize = 0;
  }


  public int parent(int i){
     return (i-1)/2;
  }
  public int leftChild(int val){
    return (2*val)+1;
  }
  public int rightChild(int val){
    return (2*val)+2;
  }

  public int getMax(){//max element
    return arr[0];
  }

  public int curSize(){
    return HeapSize;
  }

  public void heapify(int val,int size){
     int lc = leftChild(val);// lc is an index
     int rc = rightChild(val);// rc is an index
  
     int largest = val;

     if(lc<size && arr[lc] > arr[val]){
       largest = lc;
     }
     if(rc<size && arr[rc] > arr[val]){
       largest = rc;
     }

     while(largest != val){
       int temp = arr[val];
       arr[val] = arr[largest];
       arr[largest] = temp;
       heapify(largest,HeapSize);
       largest = val;
     }
  }


  public void removeMax(){
    if(HeapSize <= 0) {
      System.out.println("Heap is Empty!!!");
      return;
    }else if(HeapSize == 1){
      HeapSize--;
      return;
    }
    int root = arr[0];
    arr[0] = arr[HeapSize-1];
    HeapSize -= 1;
    heapify(0,HeapSize);
  }

  public void increaseVal(int key,int value){
      arr[key] = value;
      while(key != 0 && arr[parent(key)] < arr[key]){
         int temp = arr[parent(key)];
         arr[parent(key)] = arr[key];
         arr[key] = temp;
         key = parent(key);

      }
  }

  public void delete(int key){//key is the index
     increaseVal(key,Integer.MAX_VALUE);
     removeMax();
  }


 public void insert(int val){
      if(HeapSize == MaxSize){
        System.out.println("Heap if full!!!");
        return;
      }
      HeapSize += 1;
      int i = HeapSize-1;
      arr[i] = val;
      //System.out.println(arr[i]);
        
      while(i != 0 && arr[parent(i)] < arr[i]){/* cheking whether parent's value is less than its child*/
         int temp = arr[parent(i)];
         arr[parent(i)] = arr[i];
         arr[i] = temp;
         i = parent(i);/* Because parent(i.e parent node) can also have it's own parent(i.e parent node) */
      }
   }

  public int[] sort(int len,int[] arr){
    len--;
    for(int i=len;i>=0;i--){
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(0,--len);
    }
    return arr; //System.out.println(Arrays.toString(arr));
  }

  public void execute(){
    MaxHeap hp = new MaxHeap(6);
    hp.insert(3);
    hp.insert(10);
    hp.insert(12);
    hp.insert(8);
    hp.insert(2);
    hp.insert(14);
    //hp.delete(0);
    
    //System.out.println(hp.arr[3]);
    //System.out.println(Arrays.toString(hp.arr));
    //System.out.println(Arrays.toString(hp.sort(hp.HeapSize,hp.arr)));


    
  }
  
}

public class Main{
  public static void main(String args[]){
    MaxHeap hp = new MaxHeap(6);
    hp.execute();
  }
      }