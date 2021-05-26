/*
If the number of vertices searched is the same as the number of vertices in the graph, the graph is connected. Otherwise, the graph is not connected.

*/

public class Edge
{
   private int vertexOne;
   private int vertexTwo;

   public Edge ()
   {
      this (0, 0);
   }

   public Edge (int vertexOne, int vertexTwo)
   {
      this.vertexOne = vertexOne;
      this.vertexTwo = vertexTwo;
   }

   public int getVertexOne ()
   {
      return vertexOne;
   }

   public int getVertexTwo ()
   {
      return vertexTwo;
   }

   public void setVertexOne (int vertexOne)
   {
      this.vertexOne = vertexOne;
   }

   public void setVertexTwo (int vertexTwo)
   {
      this.vertexTwo = vertexTwo;
   }

}