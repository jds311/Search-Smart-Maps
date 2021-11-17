
import java.util.ArrayList;
import java.util.LinkedList;

class Edge {

    int source;
    int destination;
    double weight;

    public Edge(int source, int destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class HeapNode {

    int vertex;
    double distance;
}

class Graph {
    public ArrayList<Integer> ar = new ArrayList<Integer>();
    int vertices;
    LinkedList<Edge>[] adjacencylist;

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
            addEgde(1, 2, 13);
            addEgde(2, 3, 24.3);
            addEgde(3, 4, 5);
            addEgde(4, 5, 25.6);
            addEgde(4, 6, 10.2);
            addEgde(6, 7, 17.7 );
            addEgde(6, 8, 7.6);
            addEgde(8, 9, 6.7);
            addEgde(3, 10, 15.2);
            addEgde(8, 10, 8.1);
            addEgde(9, 12, 12.4);
            addEgde(10, 11, 6.3);
            addEgde(11, 12, 3.9);
            addEgde(12, 13, 3.9);
            addEgde(4, 114, 23.7);
            addEgde(114,113 ,8.22);
            addEgde(7, 114, 10.9);
            addEgde(7,106 ,10.9 );
            addEgde(106,105 ,11 );
            addEgde(6,105 ,6.7 );
            addEgde(9,105 , 7);
            addEgde(14, 15,7.5 );
            addEgde(15,16 ,7.5 );
            addEgde(16, 17, 7.3);
            addEgde(18,21 ,7 );
            addEgde(19,20 ,6 );
            addEgde(11, 19,13.1 );
            addEgde(18,19 ,13.2 );
            addEgde(13,14 ,14 );
            addEgde(9,14 ,10.8 );
            addEgde(13,17 ,10.9 );
            addEgde(22,23 ,7.4 );
            addEgde(21,22 , 7.5);
            addEgde(17,18 , 5);
            addEgde(17,103 , 11.9);
            addEgde(16,104 , 11.9);
            addEgde(100,67 , 12);
            addEgde(105,100 , 15);
            addEgde(67,104 ,15 );
            addEgde(15,100 ,7.3 );
            addEgde(108,107 , 15);
            addEgde(103,104 ,7.3 );
            addEgde(102, 103,8 );
            addEgde(67,98 ,14 );
            addEgde(98,99 ,12 );
            addEgde(100,99 ,14 );
            addEgde(106,107 , 12);
            addEgde(7,113 ,8.2 );
            addEgde(20,23 ,19 );
            addEgde(23,24 , 15.2);
            addEgde(24,25 ,9.1 );
            addEgde(20,25 ,11.1 );
            addEgde(25,27 , 22);
            addEgde(107,112 ,7.3 );
            addEgde(99,107 , 7.3);
            addEgde(103,22 , 9.4);
            addEgde(98,108 ,6.2 );
            addEgde(108,109 , 6.2);
            addEgde(33,24 ,17.7 );
            addEgde(33,39 , 17.8);
            addEgde(42,29 ,17 );
            addEgde(24,26, 8.4);
            addEgde(26,28 , 9);
            addEgde(28,29 , 8.4);
            addEgde(28,30 ,5.7 );
            addEgde(30,31 ,5.7 );
            addEgde(31,32 ,5.7 );
            addEgde(32,33 ,2.9 );
            addEgde(41,32 ,13.6 );
            addEgde(36,22 ,10.4 );
            addEgde(37,38 ,10.4 );
            addEgde(38,39 ,10.5 );
            addEgde(102,101 ,10.5 );
            addEgde(37,101 ,4.3 );
            addEgde(36,37 , 3.8);
            addEgde(34,35 ,4.5 );
            addEgde(38,35 ,10.8 );
            addEgde(35,36 ,7.4 );
            addEgde(23,35 ,10.8 );
            addEgde(33,34 ,7.11 );
            addEgde(39,40 ,14.6 );
            addEgde(31,42 ,16.6 );
            addEgde(41,40 , 9.3);
            addEgde(43,53 , 9.4);
            addEgde(42,52 ,10 );
            addEgde(40,52 ,5.2 );
            addEgde(52,53 , 5.2);
            addEgde(54,45 , 5.5);
            addEgde(53,54 , 5.2);
            addEgde(44,45 ,5.5 );
            addEgde(62,61 , 9.4);
            addEgde(58,55 , 9.4);
            addEgde(61,58 , 9.4);
            addEgde(57,55 ,9.4 );
            addEgde(59,57 , 9.4);
            addEgde(51, 50, 9.4);
            addEgde(150,56 ,14);
            addEgde(57,150,18);
            addEgde(50,49 ,10.2 );
            addEgde(55,51 ,10.5 );
            addEgde(47,48 ,5.4 );
            addEgde(48,49 , 5.5);
            addEgde(51,39 , 5.4);
            addEgde(45,46 , 10.9);
            addEgde(47,53 ,10.9 );
            addEgde(46,47 ,10.5 );
            addEgde(52,48 , 13.2);
            addEgde(50,40 ,13 );
            addEgde(44,54 ,5.7 );
            addEgde(44,43 , 5);
            addEgde(42,43 ,5.7 );
            addEgde(101,61 , 6.3);
            addEgde(102,62 , 6.3);
            addEgde(38,55 ,7.2 );
            addEgde(58,37 ,7.2 );
            addEgde(58,59 ,9.4 );
            addEgde(57,74 ,9.4 );
            addEgde(73,59 ,9.4 );
            addEgde(73,74 ,9.5 );
            addEgde(86,74 , 14.9);
            addEgde(72,86 ,7.11 );
            addEgde(72,73 ,4.68 );
            addEgde(60,59 ,11.88 );
            addEgde(71,72 , 12.6);
            addEgde(60,64 , 6);
            addEgde(62,63 , 6);
            addEgde(65,66 , 6);
            addEgde(60,61 ,8.2);
            addEgde(63,65 ,8.5 );
            addEgde(63,64 ,4.2 );
            addEgde(68,67 ,9.48 );
            addEgde(68,69 ,11.84 );
            addEgde(69,64 ,11.84 );
            addEgde(70,85 , 12.2);
            addEgde(85,86 ,12.2 );
            addEgde(84,151 ,11.5 );
            addEgde(87,83 ,11.5 );
            addEgde(75,151 ,11.5 );
            addEgde(74,75 , 5.79);
            addEgde(75,76 , 5.79);
            addEgde(77,76 ,6 );
            addEgde(78,79 ,5.79 );
            addEgde(77,78 , 5.8);
            addEgde(79,88 , 5.8);
            addEgde(79,80 ,5.8 );
            addEgde(87,88 ,5.8 );
            addEgde(86,151 , 5.8);
            addEgde(151,87 , 5.8);
            addEgde(72,86 ,5.8 );
            addEgde(84,85 ,5.8 );
            addEgde(84,83 , 5.7);
            addEgde(82,83 ,5 );
            addEgde(81,82 ,5.7 );
            addEgde(70,89 , 7.6);
            addEgde(70,71 ,7.6 );
            addEgde(80,81 , 7.6);
            addEgde(88,81 ,8 );
            addEgde(69,70 ,9.7 );
            addEgde(89,90 ,9.7 );
            addEgde(92,93 , 9.7);
            addEgde(71,64 ,10 );
            addEgde(91,85 ,20 );
            addEgde(92,91 , 3.6);
            addEgde(89,91 , 9.7);
            addEgde(93,90 ,10.5 );
            addEgde(95,93 ,17.3 );
            addEgde(65,68 ,5.3 );
            addEgde(69,90 ,5.5 );
            addEgde(90,96 ,5.5 );
            addEgde(93,94 , 5.5);
            addEgde(97,108 ,7.3 );
            addEgde(94,97 ,7.3 );
            addEgde(97,96 , 7.3);
            addEgde(68,96 ,7.3 );
            addEgde(114,135 , 18.11);
            addEgde(135,134 ,4 );
            addEgde(133,134 ,11.5 );
            addEgde(115,149 , 11);
            addEgde(135,137 ,9.3 );
            addEgde(149,146 ,9.3 );
            addEgde(137,146 ,9.3 );
            addEgde(146,147 , 9.3);
            addEgde(147,148 , 9.3);
            addEgde(119,148 ,9.3 );
            addEgde(110,119 , 9.3);
            addEgde(132,133 , 9.3);
            addEgde(132,131 ,9 );
            addEgde(116,112 ,8.8 );
            addEgde(126,143 , 8.8);
            addEgde(116,117 ,8.7 );
            addEgde(148,117 ,8.7 );
            addEgde(111,109 , 8.7);
            addEgde(117,147 , 8.7);
            addEgde(123,127 ,8.7 );
            addEgde(127,128 , 8.7);
            addEgde(130,131 ,8 );
            addEgde(129,143 ,8 );
            addEgde(119,120 , 6.33);
            addEgde(148,125 ,6.33 );
            addEgde(120,125 ,6.33 );
            addEgde(143,142 ,6.33 );
            addEgde(141,142 ,6.33 );
            addEgde(142,144 ,6.33 );
            addEgde(144,145 ,6.33 );
            addEgde(126,125 ,6.33 );
            addEgde(144,130 ,7 );
            addEgde(147,141 ,6 );
            addEgde(110,109 ,5 );
            addEgde(132,145 ,5.2 );
            addEgde(140,145 , 5.2);
            addEgde(146,140 , 5.2);
            addEgde(140,141 ,5 );
            addEgde(139,145 ,5.5 );
            addEgde(138,137 ,5.5 );
            addEgde(121,122 ,3.6 );
            addEgde(121,120 , 3.6);
            addEgde(124,123 ,3.6 );
            addEgde(122,123 ,4 );
            addEgde(124,121 ,4 );
            addEgde(125,124 ,3.5 );
            addEgde(126,127 ,3.5 );
            addEgde(128,129 , 3.5);
            addEgde(139,133 , 3.5);
            addEgde(118,119 ,3.5 );
            addEgde(129,130 ,2 );
            addEgde(139,138 , 2);
            addEgde(149,116 ,2 );
            addEgde(136,115 ,8 );
            addEgde(136,137 ,7.9 );
            addEgde(135,136 ,8 );
            addEgde(113,115 ,5 );
            addEgde(112,113 ,12.7 );
            addEgde(111,112 , 12.7);
            addEgde(111,118 ,10.5 );
            addEgde(94,109 ,13.3 );
            addEgde(67, 66, 10.5);
            addEgde(62, 66, 11.6);
            addEgde(88, 77, 5.8);
            addEgde(87, 76, 7);
                }

    public void addEgde(int source, int destination, double weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].add(edge);
        Edge edge1 = new Edge(destination, source, weight);
        adjacencylist[destination].add(edge1);
    }

    public time_Dist dijkstra_GetMinDistances(int sourceVertex, int destinationVertex) {
        long start = System.nanoTime();
        ar.clear();
        time_Dist td = new time_Dist();
        int INFINITY = Integer.MAX_VALUE;
        boolean[] SPT = new boolean[vertices];
        int[] parents = new int[153];
        parents[sourceVertex] = -1;
        HeapNode[] heapNodes = new HeapNode[vertices];
        for (int i = 0; i < vertices; i++) {
            heapNodes[i] = new HeapNode();
            heapNodes[i].vertex = i;
            heapNodes[i].distance = INFINITY;
        }
        heapNodes[sourceVertex].distance = 0;
        MinHeap minHeap = new MinHeap(vertices);
        for (int i = 0; i < vertices; i++) {
            minHeap.insert(heapNodes[i]);
        }
        while (!minHeap.isEmpty()) {
            HeapNode extractedNode = minHeap.extractMin();
            int extractedVertex = extractedNode.vertex;
            SPT[extractedVertex] = true;
            LinkedList<Edge> list = adjacencylist[extractedVertex];
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);
                int destination = edge.destination;
                if (SPT[destination] == false) {
                    double newKey = heapNodes[extractedVertex].distance + edge.weight;
                    double currentKey = heapNodes[destination].distance;
                    if (currentKey > newKey) {
                        decreaseKey(minHeap, newKey, destination);
                        heapNodes[destination].distance = newKey;
                        parents[destination] = extractedVertex;
                    }
                }
            }
        }
        double dist;
        dist = printDijkstra(heapNodes, sourceVertex, destinationVertex, parents);
        td.dist = dist;
        td.time = System.nanoTime() - start;
        return td;
    }

    public void decreaseKey(MinHeap minHeap, double newKey, int vertex) {

        int index = minHeap.indexes[vertex];
        HeapNode node = minHeap.mH[index];
        node.distance = newKey;
        minHeap.bubbleUp(index);
    }

    public double printDijkstra(HeapNode[] resultSet, int sourceVertex, int destinationVertex, int[] parents) {
        System.out.println("Dijkstra Algorithm: (Adjacency List + Min Heap)");
        int dist = 0;
        for (int i = 0; i < vertices; i++) {
            if (i == destinationVertex) {
                dist = i;
                System.out.println("Source Vertex: " + sourceVertex + " to vertex " + +i
                        + " distance: " + resultSet[i].distance);
                printPath(destinationVertex, parents);
            }
        }
        return resultSet[dist].distance;
    }

    void printPath(int j, int parents[]) {
        if (parents[j] == -1) {
            return;
        }
        printPath(parents[j], parents);
        System.out.println(j + " ");
        ar.add(j);
    }
}

class MinHeap {

    int capacity;
    int currentSize;
    HeapNode[] mH;
    int[] indexes;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        mH = new HeapNode[capacity + 1];
        indexes = new int[capacity];
        mH[0] = new HeapNode();
        mH[0].distance = Integer.MIN_VALUE;
        mH[0].vertex = -1;
        currentSize = 0;
    }

    public void insert(HeapNode x) {
        currentSize++;
        int idx = currentSize;
        mH[idx] = x;
        indexes[x.vertex] = idx;
        bubbleUp(idx);
    }

    public void bubbleUp(int pos) {
        int parentIdx = pos / 2;
        int currentIdx = pos;
        while (currentIdx > 0 && mH[parentIdx].distance > mH[currentIdx].distance) {
            HeapNode currentNode = mH[currentIdx];
            HeapNode parentNode = mH[parentIdx];

            //swap the positions
            indexes[currentNode.vertex] = parentIdx;
            indexes[parentNode.vertex] = currentIdx;
            swap(currentIdx, parentIdx);
            currentIdx = parentIdx;
            parentIdx = parentIdx / 2;
        }
    }

    public HeapNode extractMin() {
        HeapNode min = mH[1];
        HeapNode lastNode = mH[currentSize];
        indexes[lastNode.vertex] = 1;
        mH[1] = lastNode;
        mH[currentSize] = null;
        sinkDown(1);
        currentSize--;
        return min;
    }

    public void sinkDown(int k) {
        int smallest = k;
        int leftChildIdx = 2 * k;
        int rightChildIdx = 2 * k + 1;
        if (leftChildIdx < heapSize() && mH[smallest].distance > mH[leftChildIdx].distance) {
            smallest = leftChildIdx;
        }
        if (rightChildIdx < heapSize() && mH[smallest].distance > mH[rightChildIdx].distance) {
            smallest = rightChildIdx;
        }
        if (smallest != k) {

            HeapNode smallestNode = mH[smallest];
            HeapNode kNode = mH[k];
            indexes[smallestNode.vertex] = k;
            indexes[kNode.vertex] = smallest;
            swap(k, smallest);
            sinkDown(smallest);
        }
    }

    public void swap(int a, int b) {
        HeapNode temp = mH[a];
        mH[a] = mH[b];
        mH[b] = temp;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int heapSize() {
        return currentSize;
    }
}

public class backend {

    public static void main(String[] args) {
        int sourceVertex = 1; int destinationVertex=5;
        int vertices = 153;
        Graph graph = new Graph(vertices);
        graph.dijkstra_GetMinDistances(5,113);
    }
}
