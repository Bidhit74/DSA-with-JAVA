public class FindShortestPath {
    // Question :- Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
    // Example: "WNEENESENNN"
    // output : Shortest path = 5

    public static double findShortestPath(String direction) {
        int coordinateX = 0 , coordinateY = 0;
        int n = direction.length();
        for (int i = 0; i < n; i++) {
            if (direction.charAt(i) == 'N') {
                coordinateY += 1;
            } else if (direction.charAt(i) == 'S') {
                coordinateY -= 1;
            } else if (direction.charAt(i) == 'E') {
                coordinateX += 1;
            } else {
                coordinateX -= 1;
            }
        }
        // find shortest path formula = sqrt((x2 - x1)^2 + (y2 - y1)^2);
        double path = Math.pow(coordinateY, 2) + Math.pow(coordinateX, 2);
        double shortestPath = Math.sqrt(path);
        return shortestPath;
    }
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        System.out.println(findShortestPath(direction));
    }
}