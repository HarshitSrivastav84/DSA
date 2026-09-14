public class BareMinimumBFS {
    public static void main(String[] args) {
        
        int[][] graph = {
            {0, 1, 1, 0, 0}, // User 0 is friends with 1, 2
            {1, 0, 0, 1, 0}, // User 1 is friends with 0, 3
            {1, 0, 0, 0, 1}, // User 2 is friends with 0, 4
            {0, 1, 0, 0, 0}, // User 3 is friends with 1
            {0, 0, 1, 0, 0}  // User 4 is friends with 2
        };

        int totalUsers = 5;
        int startUser = 0;

        // Arrays to track visited users and their distance (hops)
        boolean[] visited = new boolean[totalUsers];
        int[] distance = new int[totalUsers];

        // Queue using a basic array
        int[] queue = new int[totalUsers];
        int head = 0, tail = 0;

        queue[tail++] = startUser; 
        visited[startUser] = true;

        System.out.println("Reachable Friends from User " + startUser + ":");

        // BFS Traversal
        while (head < tail) {
            int current = queue[head++]; 

            for (int i = 0; i < totalUsers; i++) {
                
                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    distance[i] = distance[current] + 1;
                    queue[tail++] = i; 

                    System.out.println("User " + i + " -> Distance: " + distance[i] + " hop(s)");
                }
            }
        }
    }
}