
import java.util.*;

class Graph1 {

    class Edge {

        double distance;
        int source, destination;

        public Edge(int source, int destination, double distance) {
            this.source = source;
            this.destination = destination;
            this.distance = distance;
        }
    }

    int vertices, e;
    LinkedList<Edge>[] adjacencylist;
    Edge edge[];

    Graph1(int vertices, int e) {
        this.e = e;
        this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
        addEdge(1, 2, 13);
        addEdge(2, 3, 24.3);
        addEdge(3, 4, 5);
        addEdge(4, 5, 25.6);
        addEdge(4, 6, 10.2);
        addEdge(6, 7, 17.7);
        addEdge(6, 8, 7.6);
        addEdge(8, 9, 6.7);
        addEdge(3, 10, 15.2);
        addEdge(8, 10, 8.1);
        addEdge(9, 12, 12.4);
        addEdge(10, 11, 6.3);
        addEdge(11, 12, 3.9);
        addEdge(12, 13, 3.9);
        addEdge(4, 114, 23.7);
        addEdge(114, 113, 8.22);
        addEdge(7, 114, 10.9);
        addEdge(7, 106, 10.9);
        addEdge(106, 105, 11);
        addEdge(6, 105, 6.7);
        addEdge(9, 105, 7);
        addEdge(14, 15, 7.5);
        addEdge(15, 16, 7.5);
        addEdge(16, 17, 7.3);
        addEdge(18, 21, 7);
        addEdge(19, 20, 6);
        addEdge(11, 19, 13.1);
        addEdge(18, 19, 13.2);
        addEdge(13, 14, 14);
        addEdge(9, 14, 10.8);
        addEdge(13, 17, 10.9);
        addEdge(22, 23, 7.4);
        addEdge(21, 22, 7.5);
        addEdge(17, 18, 5);
        addEdge(17, 103, 11.9);
        addEdge(16, 104, 11.9);
        addEdge(100, 67, 12);
        addEdge(105, 100, 15);
        addEdge(67, 104, 15);
        addEdge(15, 100, 7.3);
        addEdge(108, 107, 15);
        addEdge(103, 104, 7.3);
        addEdge(102, 103, 8);
        addEdge(67, 98, 14);
        addEdge(98, 99, 12);
        addEdge(100, 99, 14);
        addEdge(106, 107, 12);
        addEdge(7, 113, 8.2);
        addEdge(20, 23, 19);
        addEdge(23, 24, 15.2);
        addEdge(24, 25, 9.1);
        addEdge(20, 25, 11.1);
        addEdge(25, 27, 22);
        addEdge(107, 112, 7.3);
        addEdge(99, 107, 7.3);
        addEdge(103, 22, 9.4);
        addEdge(98, 108, 6.2);
        addEdge(108, 109, 6.2);
        addEdge(33, 24, 17.7);
        addEdge(33, 39, 17.8);
        addEdge(42, 29, 17);
        addEdge(24, 26, 8.4);
        addEdge(26, 28, 9);
        addEdge(28, 29, 8.4);
        addEdge(28, 30, 5.7);
        addEdge(30, 31, 5.7);
        addEdge(31, 32, 5.7);
        addEdge(32, 33, 2.9);
        addEdge(41, 32, 13.6);
        addEdge(36, 22, 10.4);
        addEdge(37, 38, 10.4);
        addEdge(38, 39, 10.5);
        addEdge(102, 101, 10.5);
        addEdge(37, 101, 4.3);
        addEdge(36, 37, 3.8);
        addEdge(34, 35, 4.5);
        addEdge(38, 35, 10.8);
        addEdge(35, 36, 7.4);
        addEdge(23, 35, 10.8);
        addEdge(33, 34, 7.11);
        addEdge(39, 40, 14.6);
        addEdge(31, 42, 16.6);
        addEdge(41, 40, 9.3);
        addEdge(43, 53, 9.4);
        addEdge(42, 52, 10);
        addEdge(40, 52, 5.2);
        addEdge(52, 53, 5.2);
        addEdge(54, 45, 5.5);
        addEdge(53, 54, 5.2);
        addEdge(44, 45, 5.5);
        addEdge(62, 61, 9.4);
        addEdge(58, 55, 9.4);
        addEdge(61, 58, 9.4);
        addEdge(57, 55, 9.4);
        addEdge(59, 57, 9.4);
        addEdge(51, 50, 9.4);
        addEdge(150, 56, 14);
        addEdge(57, 150, 18);
        addEdge(50, 49, 10.2);
        addEdge(55, 51, 10.5);
        addEdge(47, 48, 5.4);
        addEdge(48, 49, 5.5);
        addEdge(51, 39, 5.4);
        addEdge(45, 46, 10.9);
        addEdge(47, 53, 10.9);
        addEdge(46, 47, 10.5);
        addEdge(52, 48, 13.2);
        addEdge(50, 40, 13);
        addEdge(44, 54, 5.7);
        addEdge(44, 43, 5);
        addEdge(42, 43, 5.7);
        addEdge(101, 61, 6.3);
        addEdge(102, 62, 6.3);
        addEdge(38, 55, 7.2);
        addEdge(58, 37, 7.2);
        addEdge(58, 59, 9.4);
        addEdge(57, 74, 9.4);
        addEdge(73, 59, 9.4);
        addEdge(73, 74, 9.5);
        addEdge(86, 74, 14.9);
        addEdge(72, 86, 7.11);
        addEdge(72, 73, 4.68);
        addEdge(60, 59, 11.88);
        addEdge(71, 72, 12.6);
        addEdge(60, 64, 6);
        addEdge(62, 63, 6);
        addEdge(65, 66, 6);
        addEdge(60, 61, 8.2);
        addEdge(63, 65, 8.5);
        addEdge(63, 64, 4.2);
        addEdge(68, 67, 9.48);
        addEdge(68, 69, 11.84);
        addEdge(69, 64, 11.84);
        addEdge(70, 85, 12.2);
        addEdge(85, 86, 12.2);
        addEdge(84, 151, 11.5);
        addEdge(87, 83, 11.5);
        addEdge(75, 151, 11.5);
        addEdge(74, 75, 5.79);
        addEdge(75, 76, 5.79);
        addEdge(77, 76, 6);
        addEdge(78, 79, 5.79);
        addEdge(77, 78, 5.8);
        addEdge(79, 88, 5.8);
        addEdge(79, 80, 5.8);
        addEdge(87, 88, 5.8);
        addEdge(86, 151, 5.8);
        addEdge(151, 87, 5.8);
        addEdge(72, 86, 5.8);
        addEdge(84, 85, 5.8);
        addEdge(84, 83, 5.7);
        addEdge(82, 83, 5);
        addEdge(81, 82, 5.7);
        addEdge(70, 89, 7.6);
        addEdge(70, 71, 7.6);
        addEdge(80, 81, 7.6);
        addEdge(88, 81, 8);
        addEdge(69, 70, 9.7);
        addEdge(89, 90, 9.7);
        addEdge(92, 93, 9.7);
        addEdge(71, 64, 10);
        addEdge(91, 85, 20);
        addEdge(92, 91, 3.6);
        addEdge(89, 91, 9.7);
        addEdge(93, 90, 10.5);
        addEdge(95, 93, 17.3);
        addEdge(65, 68, 5.3);
        addEdge(69, 90, 5.5);
        addEdge(90, 96, 5.5);
        addEdge(93, 94, 5.5);
        addEdge(97, 108, 7.3);
        addEdge(94, 97, 7.3);
        addEdge(97, 96, 7.3);
        addEdge(68, 96, 7.3);
        addEdge(114, 135, 18.11);
        addEdge(135, 134, 4);
        addEdge(133, 134, 11.5);
        addEdge(115, 149, 11);
        addEdge(135, 137, 9.3);
        addEdge(149, 146, 9.3);
        addEdge(137, 146, 9.3);
        addEdge(146, 147, 9.3);
        addEdge(147, 148, 9.3);
        addEdge(119, 148, 9.3);
        addEdge(110, 119, 9.3);
        addEdge(132, 133, 9.3);
        addEdge(132, 131, 9);
        addEdge(116, 112, 8.8);
        addEdge(126, 143, 8.8);
        addEdge(116, 117, 8.7);
        addEdge(148, 117, 8.7);
        addEdge(111, 109, 8.7);
        addEdge(117, 147, 8.7);
        addEdge(123, 127, 8.7);
        addEdge(127, 128, 8.7);
        addEdge(130, 131, 8);
        addEdge(129, 143, 8);
        addEdge(119, 120, 6.33);
        addEdge(148, 125, 6.33);
        addEdge(120, 125, 6.33);
        addEdge(143, 142, 6.33);
        addEdge(141, 142, 6.33);
        addEdge(142, 144, 6.33);
        addEdge(144, 145, 6.33);
        addEdge(126, 125, 6.33);
        addEdge(144, 130, 7);
        addEdge(147, 141, 6);
        addEdge(110, 109, 5);
        addEdge(132, 145, 5.2);
        addEdge(140, 145, 5.2);
        addEdge(146, 140, 5.2);
        addEdge(140, 141, 5);
        addEdge(139, 145, 5.5);
        addEdge(138, 137, 5.5);
        addEdge(121, 122, 3.6);
        addEdge(121, 120, 3.6);
        addEdge(124, 123, 3.6);
        addEdge(122, 123, 4);
        addEdge(124, 121, 4);
        addEdge(125, 124, 3.5);
        addEdge(126, 127, 3.5);
        addEdge(128, 129, 3.5);
        addEdge(139, 133, 3.5);
        addEdge(118, 119, 3.5);
        addEdge(129, 130, 2);
        addEdge(139, 138, 2);
        addEdge(149, 116, 2);
        addEdge(136, 115, 8);
        addEdge(136, 137, 7.9);
        addEdge(135, 136, 8);
        addEdge(113, 115, 5);
        addEdge(112, 113, 12.7);
        addEdge(111, 112, 12.7);
        addEdge(111, 118, 10.5);
        addEdge(94, 109, 13.3);
        addEdge(67, 66, 10.5);
        addEdge(62, 66, 11.6);
        addEdge(88, 77, 5.8);
        addEdge(87, 76, 7);
    }

    public void addEdge(int source, int destination, double weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].add(edge);
        Edge edge1 = new Edge(destination, source, weight);
        adjacencylist[destination].add(edge1);
    }

    public long bellmanFord_sp(int start, int destination) {
        long star = System.nanoTime();
        //Graph1 g = new Graph1(153, 239);
        double[] dist = new double[153];
        java.util.Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[start] = 0;
        for (int i = 0; i < 153; i++) {
            for (LinkedList<Edge> edges : adjacencylist) {
                for (Edge edge : edges) {
                    if (dist[edge.source] + edge.distance < dist[edge.destination]) {
                        dist[edge.destination] = dist[edge.source] + edge.distance;
                    }
                }
            }
        }
        double dis = dist[destination];
        long time = System.nanoTime() - star;
        return time;
    }
}

public class bellmanford {

    public static void main(String[] args) {
        int sourceVertex = 5;
        int destinationVertex = 113;
        int vertices = 153;
        int ed = 239;
        //Graph1 g = new Graph1(153, 239);

        //double d = g.bellmanFord_sp(5,113);
        //System.out.println(d);
        //System.out.printf("The cost to get from node %d to %d is %.2f\n", sourceVertex, destinationVertex, d[destinationVertex]);
    }
}
