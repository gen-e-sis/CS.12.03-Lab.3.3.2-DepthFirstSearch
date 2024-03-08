import java.util.Stack;

public class DepthFirstSearch {

    // Main method. Used for visualising and debugging purposes.
    public static void main(String[] args) {

        int[][] graph1 = {
                {6,9},
                {11},
                {6,7},
                {9},
                {5,8},
                {4,7},
                {0,2,11},
                {2,5},
                {4,10},
                {0,3},
                {8},
                {1,6}
        };

        int[][] graph2 = {
                {3,6,5,9},
                {11},
                {7,10},
                {0},
                {5},
                {0,4,7},
                {0,11},
                {2,5,8},
                {7},
                {0},
                {2},
                {1,6}
        };

        int[] path_graph_1 = depthFirstSearch(graph1);
        int[] path_graph_2 = depthFirstSearch(graph2);

        printPath(path_graph_1);
        printPath(path_graph_2);

    }

    public static int[] depthFirstSearch(int[][] graph) {
        Stack<Integer> stack = new Stack<Integer>();
        // Create a stack.
        boolean[] visited = new boolean[graph.length];
        // Create an array called visited. This will keep track of which nodes we have visited.

        // Create an array called path. This will keep track of the order of nodes that we visit.
        int[] path = new int[graph.length];
        // Create an index for the path array.
        int index = 0;
        // Push our starting node to the stack. We can begin our traversal from any valid node. Let's begin our traversal at node 0.
        stack.push(0);
        // Record the starting node as visited.
        visited[0] = true;
        // While our stack is not empty i.e. while we still have nodes to explore ...
        while (!stack.isEmpty()){
            int temp = stack.pop();
            path[index] = temp;
            index++;
            for(int i = 0; i < graph[temp].length; i++){
                if(!visited[graph[temp][i]]){
                    visited[graph[temp][i]] = true;
                    stack.push(graph[temp][i]);
                }
            }
        }
        // Pop the node that we are currently visiting from the stack.

        // Add the node that we are currently visiting to the path.

        // Obtain an array of all neighbouring/adjacent nodes of the node that we are currently visiting.

        // For each neighbouring/adjacent node ...

        // If the neighbouring/adjacent node has not been visited ...

        // Record the neighbouring/adjacent node as visited.

        // Push the neighbouring/adjacent node onto the stack.




        // Return the path.
        return path;
    }

    // A private helper method that prints the path. Used for visualisation and debugging purposes.
    private static void printPath(int[] path) {

        for (int node: path) System.out.print(node + " ");
        System.out.println();

    }


}