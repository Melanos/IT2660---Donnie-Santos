public class Driver
{
    public static void main(String[] args)
    {
        int nodesNum = 30000; //Can go up to 30k nodes, otherwise causes memory leak.
        Graph graph = new Graph(nodesNum);
        graph.InitializeNodes(graph, nodesNum);

        for(int i = 0; i<5; i++)
        {
            System.out.print("Node " + i + "\'s ");
            graph.showVertex(i);
            System.out.print("Its routes are:\n");
            graph.showEdges(i);
        }

        int select = graph.Search();
        graph.algorithmChoice(graph, select);
    }
}
