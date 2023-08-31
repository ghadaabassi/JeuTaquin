package TaquinGame;

import java.util.*;

public class TaquinSolver {

    private static final int[][] goalState = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };

    protected static class Node {
        int[][] state;
        int row;
        int col;
        int depth;
        Node parent;

        Node(int[][] state, int row, int col, int depth, Node parent) {
            this.state = state;
            this.row = row;
            this.col = col;
            this.depth = depth;
            this.parent = parent;
        }

        List<Node> getNeighbors() {
            List<Node> neighbors = new ArrayList<>();
            int[][] moves = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
            for (int[] move : moves) {
                int r = row + move[0];
                int c = col + move[1];
                if (r >= 0 && r < 3 && c >= 0 && c < 3) {
                    int[][] newState = cloneState(state);
                    swap(newState, row, col, r, c);
                    neighbors.add(new Node(newState, r, c, depth + 1, this));
                }
            }
            return neighbors;
        }

        boolean isGoal() {
            return Arrays.deepEquals(state, goalState);
        }

        private int[][] cloneState(int[][] state) {
            int[][] newState = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    newState[i][j] = state[i][j];
                }
            }
            return newState;
        }

        private void swap(int[][] state, int r1, int c1, int r2, int c2) {
            int temp = state[r1][c1];
            state[r1][c1] = state[r2][c2];
            state[r2][c2] = temp;
        }
    }

    public static List<Node> solve(int[][] initialState) {
        List<Node> toVisit = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Node root = new Node(initialState, 1, 1, 0, null);
        toVisit.add(root);

        while (!toVisit.isEmpty()) {
            Node node = toVisit.remove(0);
            visited.add(nodeToString(node));
            if (node.isGoal()) {
                return getPath(node);
            }
            for (Node neighbor : node.getNeighbors()) {
                if (!visited.contains(nodeToString(neighbor)) && !toVisit.contains(neighbor)) {
                    toVisit.add(neighbor);
                }
            }
        }

        return null;
    }

    private static List<Node> getPath(Node node) {
        List<Node> path = new ArrayList<>();
        while (node != null) {
            path.add(node);
            node = node.parent;
        }
        Collections.reverse(path);
        return path;
    }

    protected static String nodeToString(Node node) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(node.state[i][j]);
            }
        }
        return sb.toString();
    }

    protected static void printState(int[][] state) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(state[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
  
}