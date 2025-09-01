# 🚀 Graph Algorithms in Java  

## 📌 Project Overview  
This repository contains implementations of fundamental **graph algorithms** in Java.  
Each algorithm is explained with:  

- Its **logic / working idea**  
- **Time complexity** (Best, Average, Worst case)  
- **Space complexity**  
- Real-world **intuition** for better understanding  

---

## 🔗 Algorithms Implemented  

### 1️⃣ Graph Traversal (BFS & DFS)  
**Logic / Idea:**  
- **BFS (Breadth First Search):** Explores neighbors level by level using a queue.  
- **DFS (Depth First Search):** Explores as deep as possible using recursion/stack before backtracking.  

**Complexity:**  
- Time: **O(V + E)** (V = vertices, E = edges)  
- Space: **O(V)**  

---

### 2️⃣ Dijkstra’s Algorithm  
**Logic / Idea:**  
- Finds the **shortest path** from a source to all vertices in a weighted graph (no negative weights).  
- Uses a **priority queue** to pick the minimum distance vertex.  

**Complexity:**  
- Time: **O((V + E) log V)** using Min-Heap (PriorityQueue)  
- Space: **O(V)**  

---

### 3️⃣ Bellman-Ford Algorithm  
**Logic / Idea:**  
- Computes shortest paths from a source vertex to all other vertices.  
- Works with **negative weights**, unlike Dijkstra.  
- Repeatedly relaxes all edges (V-1) times.  

**Complexity:**  
- Time: **O(V × E)**  
- Space: **O(V)**  

---

### 4️⃣ Prim’s Algorithm  
**Logic / Idea:**  
- Builds a **Minimum Spanning Tree (MST)** by expanding the cheapest edge from the already built tree.  
- Greedy approach using a **priority queue**.  

**Complexity:**  
- Time: **O((V + E) log V)** using Min-Heap  
- Space: **O(V + E)**  

---

### 5️⃣ Kruskal’s Algorithm  
**Logic / Idea:**  
- Builds MST by choosing the **smallest edges** and ensuring no cycle is formed.  
- Uses **Disjoint Set (Union-Find)** for cycle detection.  

**Complexity:**  
- Time: **O(E log E)** (for sorting edges)  
- Space: **O(V)**  

---

## 📊 Complexity Comparison Table  

| Algorithm       | Use Case                      | Time Complexity   | Space   |
|-----------------|-------------------------------|------------------|---------|
| BFS / DFS       | Graph traversal               | O(V + E)         | O(V)    |
| Dijkstra        | Shortest path (no negative)   | O((V + E) log V) | O(V)    |
| Bellman-Ford    | Shortest path (with negative) | O(V × E)         | O(V)    |
| Prim’s          | Minimum Spanning Tree (MST)   | O((V + E) log V) | O(V+E)  |
| Kruskal’s       | Minimum Spanning Tree (MST)   | O(E log E)       | O(V)    |

---

## ✅ Conclusion  
This repository covers the **essential graph algorithms** every computer science student and developer should know.  
Understanding these algorithms is crucial for:  
- **Competitive programming**  
- **Technical interviews**  
- **Real-world applications** (routing, networks, optimization problems)  

---
