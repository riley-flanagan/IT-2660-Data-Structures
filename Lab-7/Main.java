import java.util.List;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] vertices = {
            "Liberal Arts", // 0 
            "Student Services", // 1
            "Health Careers & Sciences", // 2 
            "Health Technologies Center", // 3
            "Recreation Center", // 4
            "Technology Learning Center", // 5
            "Business & Technology", // 6
            "Theatre" // 7
        };

    // 2-Define Edges

    int[][] edges = {
      {0, 7}, {0, 1}, // lbrl arts connects to theater (7) and SS (1)
      {1, 5}, {1, 2}, // ss connects to tlc and health & sciences
      {2, 3}, {2, 4}, // health careers and sciences connects to Heatlh Tech Center & rec center
      // health tech center connects to no where, save health career center, which is already noted in {2, 3}
      {4, 5}, // rec center connects to TLC
      {5, 6}, // tlc connects to business and tech 
      {6, 0}, {6, 7} // haha funny number. business and tech connects to theater and liberal arts
      // theater connects to b&t and liberal arts, both of which are noted

    };

    
    // 3. Create the graph (name "graph") using the vertices and edges
    
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building

    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);
    
    // 5. Retrieve and print the search order of the DFS traversal
    
    List<Integer> searchOrder = dfs.getSearchOrder();
        System.out.println("dfs search order:");
        for (int i : searchOrder) {
            System.out.print(graph.getVertex(i) + " ");
        }
        System.out.println();

    // 6. Print the parent-child relationships for each vertex during the DFS traversal

    for (int i = 0; i < vertices.length; i++) {
            if (dfs.getParent(i) != -1) {
                System.out.println(graph.getVertex(dfs.getParent(i)) + 
                                   " is parent of " + graph.getVertex(i));
            }
        }
    
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)

            System.out.println("\nPath from Business & Technology to Liberal Arts:");
        dfs.printPath(graph.getIndex("Liberal Arts"));

        // 8. Call printTree() to print the entire DFS tree
        System.out.println("\ndfs Tree Structure:");
        dfs.printTree();
    
    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    
        System.out.println("\nFull DFS Tree Structure:");
        dfs.printTree();

  }
}