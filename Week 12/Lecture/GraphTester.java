public class GraphTester
{
   public static void main(String[] args)
   {
      String[] vertices = {"Seattle", "San Francisco", "Los Angeles", "Denver"};
      int[][]  edges = {
                         {0, 1}, {0, 3},
                         {1, 0}, {1, 2}, {1, 3},
                         {2, 1}, {2, 3},
                         {3, 0}, {3, 1}, {3, 2}
                       };

      // OLD Code: causes warning: [rawtypes] found raw type: UnweightedGraph
      // when compiled with -Xlint
      //UnweightedGraph<String> cities = new UnweightedGraph (vertices, edges);

      UnweightedGraph<String> cities = new UnweightedGraph<String> (vertices, edges);

      System.out.println ("Number of Vertices: " + cities.getSize() );
      System.out.println ("Vertex(1):          " + cities.getVertex(1) );
      System.out.println ("Index for 'Denver': " + cities.getIndex("Denver") );

      System.out.println ("The edges for cities:");
      cities.printEdges();
   }
}