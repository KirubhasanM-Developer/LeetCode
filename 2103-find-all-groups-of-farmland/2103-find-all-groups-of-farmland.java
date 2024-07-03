import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        List<int[]> result = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    int[] bounds = exploreLand(land, visited, i, j);
                    result.add(bounds);
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
    
    private int[] exploreLand(int[][] land, boolean[][] visited, int startRow, int startCol) {
        int maxRow = startRow;
        int maxCol = startCol;
        int[] directions = {0, 1, 0, -1, 1, 0, -1, 0}; // right, down, left, up
        
        for (int row = startRow; row < land.length && land[row][startCol] == 1; row++) {
            for (int col = startCol; col < land[0].length && land[row][col] == 1; col++) {
                visited[row][col] = true;
                maxRow = Math.max(maxRow, row);
                maxCol = Math.max(maxCol, col);
            }
        }
        
        return new int[]{startRow, startCol, maxRow, maxCol};
    }
}
