import java.util.*;

class Node8 {
    String vertex;
    int weight;

    Node8(String vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

class Graph11 {
    Map<String, List<Node8>> adj = new HashMap<>();

    public void addElement(String u, String v, int w) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(new Node8(v, w));

        //adj.get(v).add(new Node8(u, w));
    }

    public void bellman(String start) {
        Map<String, Integer> distance = new HashMap<>();
        for (String node : adj.keySet()) {
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put(start, 0);

        for (int i = 0; i < adj.size()- 1; i++) {
            for (String u : adj.keySet()) {
                for (Node8 nei : adj.get(u)) {
                    if (distance.get(u) != Integer.MAX_VALUE &&
                            distance.get(u) + nei.weight < distance.get(nei.vertex)) {
                        distance.put(nei.vertex, distance.get(u) + nei.weight);
                    }
                }
            }
        }
        System.out.println("The Negative Weight Are : ");,
        for (Map.Entry<String, Integer> res : distance.entrySet()) {
            if(res.getValue() < 0){
                System.out.println(start +" -> "+res.getKey() + " : " + res.getValue());
            }

        }
    }
}

class BellmanFordAlgorithm {
    public static void main(String[] args) {
        Graph11 g = new Graph11();
        g.addElement("A", "B", -2);
        g.addElement("A", "D", 3);

        g.addElement("B", "C", 1);
        g.addElement("B", "D", 4);
        g.addElement("B", "E", -1);
        g.addElement("C", "E", 2);


        g.bellman("A");
    }
}
