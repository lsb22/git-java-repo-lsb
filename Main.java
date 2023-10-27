import java.util.*;
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    int wt;

    
   public Edge(int s,int d,int w){
      src = s;
      dest = d;
      wt = w;
   }

  }

  public static void build(ArrayList<Edge> gr[]){
    for(int i=0;i<gr.length;i++){
      gr[i] = new ArrayList<Edge>();
    }

    gr[0].add(new Edge(0,2,2));
    gr[1].add(new Edge(1,2,6));
    gr[1].add(new Edge(1,3,4));
    gr[2].add(new Edge(2,0,2));
    gr[2].add(new Edge(2,1,6));
    gr[2].add(new Edge(2,3,3));
    gr[3].add(new Edge(3,1,4));
    gr[3].add(new Edge(3,2,3));
  }

  public static  void main(String args[]){
   int v = 4;

    ArrayList<Edge> graph[] = new ArrayList[v];
    build(graph);
    for(int i=0;i<graph[2].size();i++){//printing neighbour's of 2
      Edge eg = graph[2].get(i);
      System.out.println(eg.dest + " -->"+ eg.wt);
    }
      
  }
}*/

//bfs,dfs,print all paths
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    //int wt;

    public Edge(int s,int d){
      src = s;
      dest = d;
      //wt = w;
    }
  }

  public static void build(ArrayList<Edge> arr[]){
    for(int i=0;i<arr.length;i++){
      arr[i] = new ArrayList<Edge>();
    }

    arr[0].add(new Edge(0,1));
    arr[0].add(new Edge(0,2));
    
    arr[1].add(new Edge(1,0));
    arr[1].add(new Edge(1,3));
    
    arr[2].add(new Edge(2,0));
    arr[2].add(new Edge(2,4));
    
    arr[3].add(new Edge(3,1));
    arr[3].add(new Edge(3,4));
    arr[3].add(new Edge(3,5));
    
    arr[4].add(new Edge(4,2));
    arr[4].add(new Edge(4,3));
    arr[4].add(new Edge(4,5));
    
    arr[5].add(new Edge(5,3));
    arr[5].add(new Edge(5,4));
    arr[5].add(new Edge(5,6));
    
    arr[6].add(new Edge(6,5));
  }

  public static void bfs(ArrayList<Edge> arr[],int v){
    Queue<Integer> q = new LinkedList<>();
    boolean[] check = new boolean[v];
    q.add(0);

    while(!q.isEmpty()){
      int num = q.remove();
      if(check[num] == false){
        System.out.print(num+" ");
        check[num] = true;
        for(int i=0;i<arr[num].size();i++){
          Edge e = arr[num].get(i);
          q.add(e.dest);
        }
      }
    }

  }
  public static void dfs(ArrayList<Edge> g[],int nb,boolean vis[]){
    System.out.print(nb+" ");
    vis[nb] = true;
    for(int i=0;i<g[nb].size();i++){
      Edge e = g[nb].get(i);
      if(vis[e.dest] == false) dfs(g,e.dest,vis);
    }
  }

  public static void printPaths(ArrayList<Edge> g[],boolean[] vis,int curr,int dt,String str){
    if(curr == dt){
      System.out.println(str);
      return;
    }
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(!vis[e.dest]){
        vis[curr] = true;
        printPaths(g,vis,e.dest,dt,str+e.dest);
        vis[curr] = false;
      }
    }
  }
  public static void main(String args[]){
    int v = 7;
    
    ArrayList<Edge> arr[] = new ArrayList[v];
    build(arr);
    //for(int i=0;i<arr[3].size();i++){
     //Edge e =  arr[3].get(i);
     //System.out.println(e.dest);
     //bfs(arr,v);
    //dfs(arr,0,new boolean[v]);
    printPaths(arr,new boolean[v],0,5,"0");

    }
  }

*/
// for disconnected graphs
/*
public class Main{
  static class Edge{
    int src;
    int dst;
    public Edge(int s,int d){
      this.src = s;
      this.dst = d;
    }
  }
  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }
    g[0].add(new Edge(0,1));
    g[1].add(new Edge(1,0));
    g[1].add(new Edge(1,2));
    g[2].add(new Edge(2,1));
    g[3].add(new Edge(3,4));
    g[4].add(new Edge(4,3));
  }

  public static void dfs(ArrayList<Edge> g[],boolean vis[],int st){
    Queue<Integer> q = new LinkedList<>();
    q.add(st);
    while(!q.isEmpty()){
      int num = q.remove();
      if(vis[num] == false){
        System.out.print(num+" ");
        vis[num] = true;
        for(int i=0;i<g[num].size();i++){
          Edge e = g[num].get(i);
          q.add(e.dst);
        }
      }
    }
  }

  public static void main(String args[]){
    int v = 5;
    ArrayList<Edge> graph[] = new ArrayList[v];
    build(graph);
    boolean vis[] = new boolean[v];
    for(int i=0;i<v;i++){
      if(vis[i] == false) dfs(graph,vis,i);
    }
  }
}*/

// graph using 2d array with cycle detection
/*
public class Main{
  public static boolean circPath(int[][] g,boolean[] vis,int curr){
    vis[curr] = true;
     for(int i=0;i<g[curr].length;i++){
       int dt = g[curr][i];
       if(dt == -1) continue;
       if(!vis[dt]){
         if(circPath(g,vis,dt)) return true;
       }else{
         return true;
       }
     }
    vis[curr] = false;
    return false;
  }
  public static void main(String args[]){
    int[][] graph = new int[4][2];
    graph[0][0] = 2;
    graph[0][1] = -1;
    graph[1][0] = 0;
    graph[1][1] = -1;
    graph[2][0] = 3;
    graph[2][1] = -1;
    graph[3][0] = -1;
    graph[3][1] = -1;
    System.out.println(circPath(graph,new boolean[graph.length],0));
  }
}
*/
//cycle detection in directed and undirected graph
/*
public class Main{
  static class Edge{
    int src;
    int dest;

    public Edge(int s,int d){
      src = s;
      dest = d;
    }
  }
  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<>();
    }
    g[0].add(new Edge(0,1));
    g[0].add(new Edge(0,4));
    g[1].add(new Edge(1,0));
    g[1].add(new Edge(1,4));
    g[1].add(new Edge(1,2));
    g[2].add(new Edge(2,1));
    g[2].add(new Edge(2,3));
    g[3].add(new Edge(3,2));
    g[4].add(new Edge(4,0));
    g[4].add(new Edge(4,1));
    g[4].add(new Edge(4,5));
      
    //g[0].add(new Edge(0,1));
    //g[0].add(new Edge(0,2));
    //g[1].add(new Edge(1,3));
    //g[2].add(new Edge(2,1));
    //g[2].add(new Edge(2,3));
    //g[3].add(new Edge(3,4));
    //g[4].add(new Edge(4,2));
  }
  public static boolean findCycle(ArrayList<Edge> g[],boolean[] vis,int curr){
    vis[curr] = true;
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(!vis[e.dest]){
        if(findCycle(g, vis, e.dest)) return true;
      }else{
        return true;
      }
    }
    vis[curr] = false;
    return false;
  }
  public static boolean is_cycle(ArrayList<Edge> g[],boolean[] vis,int curr,int par){
       vis[curr] =true;
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(vis[e.dest] == true && par != e.dest) return true;
      if(!vis[e.dest]){
        if(is_cycle(g,vis,e.dest,curr)) return true;
      }
    }
    return false;
  }


  public static void main(String args[]){
    int v = 6;
    ArrayList<Edge> graph[] = new ArrayList[v];
    build(graph);
  //  /*boolean vis[] = new boolean[v];
    //for(int i=0;i<v;i++){
    //  if(!vis[i]){
      //  if(findCycle(graph,vis,i)){
       //   System.out.println("true");
         // break;
       // }
    //  }
  //  }
     System.out.println(is_cycle(graph,new boolean[v],0,-1));
  }
}
*/

//topological sort
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    public Edge(int s ,int d){
      src = s;
      dest = d;        
    }
  }
  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<>();
    }
    g[5].add(new Edge(5,0));
    g[5].add(new Edge(5,2));
    g[2].add(new Edge(2,3));
    g[3].add(new Edge(3,1));
    g[4].add(new Edge(4,0));
    g[4].add(new Edge(4,1));
  }
  public static void topSort(ArrayList<Edge> g[],boolean vis[],int curr,Stack<Integer> st){
    vis[curr] = true;
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(!vis[e.dest]) topSort(g,vis,e.dest,st);
    }

    st.push(curr);

  }
  public static void main(String args[]){
    int v = 6;
    ArrayList<Edge> graph[] = new ArrayList[v];
    Stack<Integer> st= new Stack<>();
    build(graph);
    boolean[] vis = new boolean[v];
    for(int i=0;i<v;i++){
      if(!vis[i]) topSort(graph,vis,i,st);
    }
    while(!st.isEmpty()){
      System.out.print(st.pop()+" ");
    }

  }
}*/

//Dijkstra's algorithm 
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s,int d,int w){
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  static class Pair implements Comparable<Pair>{
    int node;
    int dist;
    public Pair(int n,int d){
      node = n;
      dist = d;
    }
    public int compareTo(Pair that){
       return this.dist-that.dist;
    }
  }

  public static void dijkstra(ArrayList<Edge> g[],int dist[],boolean vis[]){
    PriorityQueue<Pair> q = new PriorityQueue<>();
    q.add(new Pair(0,0));
    while(!q.isEmpty()){
      Pair curr = q.remove();
      if(!vis[curr.node]){
        vis[curr.node] = true;
        for(int i=0;i<g[curr.node].size();i++){
          Edge e = g[curr.node].get(i);
          int u = e.src;
          int v = e.dest;
          if(dist[v] > dist[u] + e.wt){
            dist[v] = dist[u] + e.wt;
          }
          q.add(new Pair(v,dist[v]));

        }
      }
    }

    for(int i : dist){
      System.out.print(i+" ");
    }

  }
  
  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }
    g[0].add(new Edge(0,1,2));
    g[0].add(new Edge(0,2,4));
    g[1].add(new Edge(1,2,1));
    g[1].add(new Edge(1,3,7));
    g[2].add(new Edge(2,4,3));
    g[3].add(new Edge(3,5,1));
    g[4].add(new Edge(4,3,2));
    g[4].add(new Edge(4,5,5));
  }

  public static void main(String args[]){
    int v = 6;
    ArrayList<Edge> graph[] = new ArrayList[v];
     build(graph);
     boolean vis[] = new boolean[v];
     int dist[] = new int[v];
     for(int i=0;i<v;i++){
       if(i!=0){
         dist[i] = Integer.MAX_VALUE;
       }
     }
     dijkstra(graph, dist, vis);

  }
}*/
// Bellman Ford algorithm 
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s,int d,int w){
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }
    g[0].add(new Edge(0,1,2));
    g[0].add(new Edge(0,2,4));
    g[1].add(new Edge(1,2,-4));
    g[2].add(new Edge(2,3,2));
    g[3].add(new Edge(3,4,4));
    //g[4].add(new Edge(4,1,-1));
    //g[4].add(new Edge(4,1,-10)); --> for negative weight cycle
  }

  public static void bfg(ArrayList<Edge> g[],int src,int V){
    int d[] = new int[V];
    for(int i=0;i<d.length;i++){
      if(i!=src) d[i] = Integer.MAX_VALUE;
    }
    for(int i=0;i<V-1;i++){
      for(int j=0;j<V;j++){
        for(int k=0;k<g[j].size();k++){
          Edge e = g[j].get(k);
          int u = e.src;
          int v = e.dest;
          if(d[u]!=Integer.MAX_VALUE && d[v]>d[u]+e.wt){
            d[v]= d[u]+e.wt;
          }
        }
      }
    }

    //for detecting negative weight cycles
    for(int i=0;i<V;i++){
      for(int j=0;j<g[i].size();j++){
        Edge e = g[i].get(j);
        if(d[e.src] != Integer.MAX_VALUE && d[e.dest] > d[e.src] + e.wt){
           System.out.println("Detected Negative Weight Cycle"); 
          return;
        }
      }
    }

    for(int i=0;i<d.length;i++){
      System.out.print(d[i]+" ");
      }
  }

  public static void main(String args[]){
    int v = 5;
    ArrayList<Edge> graph[] = new ArrayList[v];
    build(graph);
    bfg(graph,0,v);
  }

}
*/
//Minimum spanning tree
/*
public class Main{
  static class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s,int d,int w){
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }
    g[0].add(new Edge(0,1,10));
    g[0].add(new Edge(0,2,15));
    g[0].add(new Edge(0,3,30));
    g[1].add(new Edge(1,0,10));
    g[1].add(new Edge(1,3,40));
    g[2].add(new Edge(2,0,15));
    g[2].add(new Edge(2,3,50));
    g[3].add(new Edge(3,0,30));
    g[3].add(new Edge(3,1,40));
    g[3].add(new Edge(3,2,50));

  }

  static class Pair implements Comparable<Pair>{
    int node;
    int dt;

    public Pair(int n,int d){
      node = n;
      dt = d;
    }

    public int compareTo(Pair other){
       return this.dt - other.dt;
    }
  }

  public static void mst(ArrayList<Edge> g[],int src,int V){
    boolean[] vis = new boolean[V];
    int sum = 0;
    PriorityQueue<Pair> q = new PriorityQueue<>();
    q.add(new Pair(src,0));
    while(!q.isEmpty()){
      Pair curr = q.remove();
      if(!vis[curr.node]){
        vis[curr.node] = true;
        sum += curr.dt;
        for(int i=0;i<g[curr.node].size();i++){
          Edge e = g[curr.node].get(i);
          if(!vis[e.dest]){
            q.add(new Pair(e.dest,e.wt));
          }
        }
      }
    }
    System.out.println("MST : "+sum);

  }


  public static void main(String args[]){
    int V = 4;
    ArrayList<Edge> graph[] = new ArrayList[V];
    build(graph);
    mst(graph,0,V);
  

  }
}
*/
//kosaraju's Algorithm
/*
public class Main{
  static class Edge{
    int src;
    int dest;

    public Edge(int s,int d){
      this.src = s;
      this.dest = d;
    }
  }

  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }
    g[0].add(new Edge(0,2));
    g[0].add(new Edge(0,3));
    g[2].add(new Edge(2,1));
    g[1].add(new Edge(1,0));
    g[3].add(new Edge(3,4));
        
  }
  public static void topo(ArrayList<Edge> g[],Stack<Integer> s,boolean[] vis,int curr){
    vis[curr] = true;
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(!vis[e.dest]){
        topo(g,s,vis,e.dest);
      }
    }
 
    s.push(curr);
  }

  public static void dfs(ArrayList<Edge> g[],int curr,boolean[] vis){
    vis[curr] = true;
    System.out.print(curr+" ");
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(!vis[e.dest]){
        dfs(g,e.dest,vis);
      }
    }
  }

  public static void kosaAlgo(ArrayList<Edge> g[],int V){
    Stack<Integer> s = new Stack<>();
    boolean[] vis = new boolean[V];
    for(int i=0;i<V;i++){
      if(!vis[i]){
        topo(g,s,vis,i);
      }
    }

    ArrayList<Edge> trans[] = new ArrayList[V];
    for(int i=0;i<V;i++){
      trans[i] = new ArrayList<Edge>();
      vis[i] = false;
    }

    for(int i=0;i<V;i++){
      for(int j=0;j<g[i].size();j++){
        Edge e = g[i].get(j);
        trans[e.dest].add(new Edge(e.dest,e.src));
      }
    }
    for(int i=0;i<V;i++){
      int curr = s.pop();
      if(!vis[curr]){
        dfs(trans,curr,vis);
        System.out.println();
      }
    }
  }


  public static void main(String args[]){
    int V = 5;
    ArrayList<Edge> graph[] = new ArrayList[V];
    build(graph);
    kosaAlgo(graph, V);
  }
}*/
//bridge in graphs or Tarjan's algorithm
public class Main{
  static class Edge{
    int src;
    int dest;
    public Edge(int s,int d){
      src = s;
      dest = d;
    }
  }

  public static void build(ArrayList<Edge> g[]){
    for(int i=0;i<g.length;i++){
      g[i] = new ArrayList<Edge>();
    }

    g[0].add(new Edge(0,1));
    g[0].add(new Edge(0,2));
    g[0].add(new Edge(0,3));
    g[1].add(new Edge(1,0));
    g[1].add(new Edge(1,2));
    g[2].add(new Edge(2,0));
    g[2].add(new Edge(2,1));
    g[3].add(new Edge(3,0));
    g[3].add(new Edge(3,4));
    //g[3].add(new Edge(3,5));
    g[4].add(new Edge(4,3));
    //g[4].add(new Edge(4,5));
    //g[5].add(new Edge(5,3));
    //g[5].add(new Edge(5,4));

  }

  public static void dfs(ArrayList<Edge> g[],boolean[] vis,int[] dt,int[] lt,int curr,int par,int time){
    vis[curr] = true;
    dt[curr] = lt[curr] = ++time;
    for(int i=0;i<g[curr].size();i++){
      Edge e = g[curr].get(i);
      if(e.dest == par) continue;
      else if(!vis[e.dest]){
        dfs(g,vis,dt,lt,e.dest,curr,time);
        lt[curr] = Math.min(lt[curr],lt[e.dest]);
        if(dt[curr] < lt[e.dest]) System.out.println("Bridge is: "+curr+"----"+e.dest);//bridge condition
      }else{
        lt[curr] = Math.min(lt[curr],dt[e.dest]);
      }

    }

  }

  public static void tar(ArrayList<Edge> g[],int V) {
    int[] dt = new int[V];
    int[] lt = new int[V];
    boolean[] vis = new boolean[V];
    int time = 0;
    for(int i=0;i<V;i++){
      if(!vis[i]){
        dfs(g,vis,dt,lt,i,-1,time);
      }
    }
  }
  public static void main(String args[]){
    int V = 55;
    ArrayList<Edge> graph[] = new ArrayList[V];
    build(graph);
    tar(graph,V);
  }
}