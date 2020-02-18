
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
        import java.util.ArrayDeque;
        import java.util.Queue;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AwsFiles
{

    private static final int HasFile = 1;
    private static final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    int minimumHours(int rows, int columns, List<List<Integer> > grid)
    {
        int pendingServers = 0;
        Queue<Point> serversWithFile = new ArrayDeque<>();

        // Add all servers with files in queue and count number of servers without file
        for (int r = 0; r < grid.size(); r++) {
            for (int c = 0; c < grid.get(0).size(); c++) {
                if (grid.get(r).get(c) == HasFile) {
                    serversWithFile.add(new Point(r, c));
                } else {
                    pendingServers++;
                }
            }
        }

        if (pendingServers == 0) return 0;
        // Iterate till all the servers has file
        for (int hours = 1; !serversWithFile.isEmpty(); hours++) {
            for (int sz = serversWithFile.size(); sz > 0; sz--) {
                Point server = serversWithFile.poll();

                for (int[] dir : DIRS) {
                    int r = server.r + dir[0];
                    int c = server.c + dir[1];
                    // If the point is pending server, convert it to server with file and add to queue
                    if (isPendingServer(grid, r, c)) {
                        pendingServers--;
                        if (pendingServers == 0) return hours;
                        grid.get(r).set(c, HasFile);
                        serversWithFile.add(new Point(r, c));
                    }
                }
            }
        }
        return -1;
    }

    private boolean isPendingServer(List<List<Integer>> grid, int r, int c) {
        return r >= 0 && r < grid.size() &&c >= 0 && c < grid.get(0).size() && grid.get(r).get(c) != HasFile;
    }

    private static class Point {
        int r, c;
        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

}
