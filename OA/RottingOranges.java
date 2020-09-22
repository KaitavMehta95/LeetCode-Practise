package OA;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kaitavmehta created on 2020-09-20
 */
public class RottingOranges {
    public static void main(String args[]) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(getTime(grid));

    }

    public static int getTime(int[][] grid) {

        int rows = grid[0].length;
        int columns = grid.length;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        Queue<int[]> badOranges = new LinkedList<>();
        int fresh = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (grid[row][column] == 2) {
                    badOranges.add(new int[]{row, column});
                } else if (grid[row][column] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;
        int count = 0;
        while (!badOranges.isEmpty()) {
            count++;
            int size = badOranges.size();
            for (int i = 0; i < size; i++) {

                int[] point = badOranges.poll();

                int x = point[0];
                int y = point[1];
                for (int[] dir : directions) {
                    int x1 = x + dir[0];
                    int y1 = y + dir[1];

                    if (x1 >= rows || x1 < 0 || y1 >= columns || y1 < 0 || grid[x1][y1] == 2 || grid[x1][y1] == 0) {
                        continue;
                    }
                    grid[x1][y1] = 2;
                    badOranges.offer(new int[]{x1, y1});
                    fresh--;

                }


            }
        }

        return fresh == 0 ? count : -1;

    }

}
