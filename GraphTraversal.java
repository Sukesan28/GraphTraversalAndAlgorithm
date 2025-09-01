import java.util.*;

class Graph1{

    ArrayList<ArrayList<Integer>> list=new ArrayList<>();

    Graph1(int v){
        for(int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
    }

    public void addElement(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }

    public void BreadthFirstSearch(int v){
        Queue <Integer> q=new LinkedList<>();
        boolean []Visited =new boolean[list.size()];
        q.add(v);
        Visited[v]=true;
        while(!q.isEmpty()){
            int vertex=q.poll();
            System.out.print(vertex +" ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av=list.get(vertex).get(i);
                if(!Visited[av]){
                    q.add(av);
                    Visited[av]=true;
                }
            }
        }
    }

    public void DFS(int v){
        Stack <Integer> res=new Stack<>();
        boolean []Visited=new boolean[list.size()];
        res.push(v);
        Visited[v]=true;
        while(!res.isEmpty()){
            int vertex=res.pop();
            System.out.print(vertex +" ");
            for(int i=0;i<list.get(vertex).size();i++){
                int av=list.get(vertex).get(i);
                if(!Visited[av]){
                    res.push(av);
                    Visited[av]=true;
                }
            }
        }
    }
}

public class GraphTraversal {
    public static void main(String[] args){
        int v=5;
        Graph1 g=new Graph1(v);
        g.addElement(0,1);
        g.addElement(0,3);
        g.addElement(1,2);
        g.addElement(1,3);
        g.addElement(3,4);
        g.addElement(2,4);
        System.out.print("Print the BFS : ");
        g.BreadthFirstSearch(0);
        System.out.print("\nPrint the DFS : ");
        g.DFS(0);
    }
}
