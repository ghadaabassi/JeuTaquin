package TaquinGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TaquinState {
    private int[][] board;
    private int zeroRow;
    private int zeroCol;

    public TaquinState(int[][] board, int zeroRow, int zeroCol) {
        this.board = board;
        this.zeroRow = zeroRow;
        this.zeroCol = zeroCol;
    }

    public int[][] getBoard() {
        return board;
    }

    public int getZeroRow() {
        return zeroRow;
    }

    public int getZeroCol() {
        return zeroCol;
    }

    public List<TaquinState> getNeighbors() {
        List<TaquinState> neighbors = new ArrayList<>();

        int[][] moves = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] move : moves) {
            int newRow = zeroRow + move[0];
            int newCol = zeroCol + move[1];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                int[][] newBoard = new int[board.length][board[0].length];

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[0].length; j++) {
                        newBoard[i][j] = board[i][j];
                    }
                }

                newBoard[zeroRow][zeroCol] = newBoard[newRow][newCol];
                newBoard[newRow][newCol] = 0;

                neighbors.add(new TaquinState(newBoard, newRow, newCol));
            }
        }

        return neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TaquinState that = (TaquinState) o;
        return Arrays.deepEquals(board, that.board);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(board);
    }

    public static List<TaquinState> solve(int[][] board, int zeroRow, int zeroCol) {
        TaquinState initialState = new TaquinState(board, zeroRow, zeroCol);

        Queue<TaquinState> queue = new LinkedList<>();
        Set<TaquinState> visited = new HashSet<>();
        Map<TaquinState, TaquinState> parents = new HashMap<>();

        queue.offer(initialState);
        visited.add(initialState);

        while (!queue.isEmpty()) {
            TaquinState current = queue.poll();

            if (isSolved(current)) {
                // le Taquin a été résolu, retourner le chemin de la configuration initiale à la
                // configuration correcte
                List<TaquinState> path = new ArrayList<>();
                TaquinState state = current;

                while (state != null) {
                    path.add(0, state);
                    state = parents.get(state);
                }

                return path;
            }

            for (TaquinState neighbor : current.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parents.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        // le Taquin ne peut pas être résolu à partir de l'état initial
        return null;
    }

    private static boolean isSolved(TaquinState state) {
        int n = state.getBoard().length;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 && j == n - 1) {
                    // le dernier emplacement est vide
                    if (state.getBoard()[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (state.getBoard()[i][j] != num) {
                        return false;
                    }
                    num++;
                }
            }
        }

        return true;
    }

}