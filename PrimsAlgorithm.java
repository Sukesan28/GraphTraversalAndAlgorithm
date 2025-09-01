import java.util.*;

class Node{
    int vertex;
    int weight;

    Node (int v,int w){
        vertex=v;
        weight=w;
    }
}

class Graph6{

    List<List< Node >> adj=new ArrayList<>();

    Graph6(int v){
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addElement(int u,int v,int w){
        adj.get(u).add(new Node(v,w));
        adj.get(v).add(new Node(u,w));
    }

    public void ShortestPath(int vertex){

        PriorityQueue <Node> key = new PriorityQueue<>((a,b) -> a.weight -b.weight);
        boolean []visited=new boolean[vertex];

        key.offer(new Node(0,0));
        int totalWeight=0;

        while(!key.isEmpty()){
            Node current=key.poll();

            int v=current.vertex;
            int w=current.weight;

            if(visited[v]){
                continue;
            }

            visited[v] = true;
            totalWeight = totalWeight + w;

            for(Node neighbour : adj.get(v)){

                int curVertex=neighbour.vertex;
                int curWeight=neighbour.weight;

                if(!visited[curVertex]){
                    key.offer(new Node(curVertex,curWeight));
                }

            }


        }
        System.out.println("The Minimum Weight of the Graph : "+totalWeight);
    }
}
public class PrimsAlgorithm {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Vertex : ");
        int vertex=sc.nextInt();
        Graph6 g=new Graph6(vertex);

        while(true){
            System.out.print("Enter the starting Node : ");
            int u =sc.nextInt();
            System.out.print("Enter the Ending Node : ");
            int v =sc.nextInt();
            System.out.print("Enter the Weight of Node : ");
            int w =sc.nextInt();

            if(u == -1 || v == -1 || w == -1){
                break;
            }
            g.addElement(u,v,w);
        }

        g.ShortestPath(vertex);
    }
}
