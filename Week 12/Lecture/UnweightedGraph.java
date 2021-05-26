import java.util.ArrayList;
import java.util.List;

public class UnweightedGraph<V>
{
   private List<V> vertices            = new ArrayList();
   private List<List<Edge>> neighbours = new ArrayList();


   class SearchTree
   {
      private int root;
      private int[] parent;
      private List<Integer> searchOrder;

      public SearchTree (int root, int[] parent, List<Integer> searchOrder)
      {
         this.root        = root;
         this.parent      = parent;
         this.searchOrder = searchOrder;
      }

      public int getRoot ()
      {
         return root;
      }

      public int[] getParent ()
      {
         return parent;
      }

      public List<Integer> getSearchOrder ()
      {
         return searchOrder;
      }

      public int getNumberOfVerticesFound ()
      {
         return searchOrder.size();
      }

      public List<V> getPath (int index)
      {
         ArrayList<V> path = new ArrayList<>();

         do
         {
            path.add (vertices.get(index) );
            index  = parent [index];
         } while (index != -1);

         return path;
      }

      public void printPath (int index)
      {
         List<V> path = getPath (index);

         System.out.print ("A path from " + vertices.get(root)  +
                           " to "         + vertices.get(index) + ": ");

         for (int k = path.size() - 1; k >= 0; k--)
         {
            System.out.print (path.get(k) + " ");
         }
      }

      public void printTree ()
      {
         System.out.println ("Root is: " + vertices.get(root) );
         System.out.print   ("Edges: ");

         for (int k = 0; k < parent.length; k++)
         {
            System.out.print   ("("  + vertices.get (parent[k]) +
                                ", " + vertices.get (k)         + ") ");
         }
      }

   }


   public UnweightedGraph ()
   {
   }

   public UnweightedGraph (V[] vertices, int[][] edges)
   {
      for (int k = 0; k < vertices.length; k++)
      {
         addVertex (vertices [k] );
      }

      createAdjacencyLists (edges, vertices.length );
   }


   public UnweightedGraph (List<V> vertices, List<Edge> edges)
   {
      for (int k = 0; k < vertices.size(); k++)
      {
         addVertex (vertices.get(k) );
      }

      createAdjacencyLists (edges, vertices.size() );
   }

   public UnweightedGraph (List<Edge> edges, int numberOfVertices)
   {
      for (int k = 0; k < numberOfVertices; k++)
      {
         addVertex ( (V) (new Integer (k) ) ); // vertices are 0, 1, 2, ...
      }

      createAdjacencyLists (edges, numberOfVertices );
   }

   public UnweightedGraph (int[][] edges, int numberOfVertices)
   {
      for (int k = 0; k < numberOfVertices; k++)
      {
         addVertex ( (V) (new Integer (k) ) ); // vertices are 0, 1, 2, ...
      }

      createAdjacencyLists (edges, numberOfVertices );
   }

   private void createAdjacencyLists (int[][] edges, int numberOfVertices)
   {
      for (int k = 0; k < edges.length; k++)
      {
         addEdge (edges [k][0], edges [k][1] );
      }
   }

   private void createAdjacencyLists (List<Edge> edges, int numberOfVertices)
   {
      for (Edge edge : edges)
      {
         addEdge (edge.getVertexOne(), edge.getVertexTwo() );
      }
   }

   public int getSize()
   {
      return vertices.size();
   }

   public List<V> getVertices()
   {
      return vertices;
   }

   public V getVertex (int index)
   {
      return vertices.get (index);
   }

   public int getIndex (V vertex)
   {
      return vertices.indexOf (vertex);
   }

   public List<Integer> getNeighbours (int neighboursIndex)
   {
      List<Integer> result = new ArrayList<>();

      for (Edge e : neighbours.get (neighboursIndex) )
      {
         result.add (e.getVertexTwo() );
      }

      return result;
   }

   public int getDegree (int vertexIndex)
   {
      return neighbours.get (vertexIndex).size();
   }

   public void printEdges ()
   {
      for (int k = 0; k < neighbours.size(); k++)
      {
         System.out.print (getVertex(k) + " (" + k + "): ");

         for (Edge e : neighbours.get (k) )
         {
            System.out.print ( "(" + getVertex (e.getVertexOne() ) + ", " +
                                     getVertex (e.getVertexTwo() ) + ") ");
         }

         System.out.println ();
      }
   }

   public void clear()
   {
      vertices.clear();
      neighbours.clear();
   }

   public boolean addVertex (V vertex)
   {
      if (vertices.contains (vertex) == false)
      {
         vertices.add (vertex);

         neighbours.add (new ArrayList<Edge>() );

         return true;
      }
      else
      {
         return false;
      }
   }

   public boolean addEdge (Edge e)
   {
      if ((e.getVertexOne() < 0) || (e.getVertexTwo() > getSize() - 1) )
      {
         throw new IllegalArgumentException ("No such index: " + e.getVertexOne() );
      }

      else if ((e.getVertexTwo() < 0) || (e.getVertexOne() > getSize() - 1) )
      {
         throw new IllegalArgumentException ("No such index: " + e.getVertexOne() );
      }

      else if (neighbours.get (e.getVertexOne()).contains(e) == false)
      {
         neighbours.get (e.getVertexOne()).add(e);

         return true;
      }

      else
      {
         return false;
      }
   }

   public boolean addEdge (int u, int v)
   {
      return addEdge (new Edge (u, v) );
   }

   public SearchTree dfs (int v)
   {
      List<Integer> searchOrder = new ArrayList<>();
      int[]      parent         = new int     [vertices.size()];
      boolean[] isVisited       = new boolean [vertices.size()];

      for (int k = 0; k < parent.length; k++)
      {
         parent[k] = -1; // Initialise all to -1
      }

      dfs (v, parent, searchOrder, isVisited);

      return new SearchTree (v, parent, searchOrder);
   }

   private void dfs (int u, int[] parent, List<Integer> searchOrder, boolean[] isVisited)
   {
      searchOrder.add (u);
      isVisited[u] = true;

      for (Edge e : neighbours.get(u) )
      {
         if (isVisited[e.getVertexTwo()] == false)
         {
            parent [e.getVertexTwo()] = u;

            dfs (e.getVertexTwo(), parent, searchOrder, isVisited);
         }
      }
   }


}