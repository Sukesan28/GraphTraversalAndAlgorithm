import java.util.*;

class Pair{
    String node;
    int dst;

    Pair(String n,int d){
        this.node=n;
        this.dst=d;
    }
}

class Graph10{
    Map <String,List<Pair>> adj=new HashMap<>();
    public void addElement(String u,String v,int w){
        adj.putIfAbsent(u,new ArrayList<>());
        adj.putIfAbsent(v,new ArrayList<>());

        adj.get(u).add(new Pair(v,w));
        adj.get(v).add(new Pair(u,w));
    }

    public void dijkstra(String source){
        Map <String,Integer> distance=new HashMap<>();
        PriorityQueue <Pair> pq=new PriorityQueue<>((a,b) -> a.dst-b.dst);
        for(String node:adj.keySet()){
            distance.put(node,Integer.MAX_VALUE);
        }
        distance.put(source,0);
        pq.offer(new Pair(source,0));
        while(!pq.isEmpty()){
            Pair current =pq.poll();
            String node=current.node;
            //int weight=current.dst;

            for(Pair nei : adj.get(node)){
                String neighbour=nei.node;
                int dst=nei.dst;

                if (distance.get(node) + dst < distance.get(neighbour)) {
                    distance.put(neighbour, distance.get(node) + dst);
                    pq.offer(new Pair(neighbour, distance.get(neighbour)));
                }
            }
        }
        System.out.println ("From source A to : ");
        for (Map.Entry<String, Integer> res : distance.entrySet()) {
            System.out.println(res.getKey() + " -> " + res.getValue());
        }
    }
}
class DijkstraAlgorithmUsingMap{
    public static void main(String[] args){
        Graph10 g=new Graph10();
        g.addElement("A","B",2);
        g.addElement("A","C",3);
        g.addElement("C","D",5);
        g.addElement("C","E",6);
        g.addElement("B","D",4);
        g.addElement("D","E",7);
        g.addElement("B","C",1);

        g.dijkstra("D");
    }
}