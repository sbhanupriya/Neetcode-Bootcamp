package dsa.graph;

public class Prb8_MaxAreaOfIsland {
    private int dfs(int[][] grid, int i, int j){
        int island = 1;
        int[] x = {0,0,1,-1};
        int[] y = {1,-1,0,0};
        for(int k=0;k<4;k++){
            int newX = i + x[k];
            int newY = j + y[k];
            if(newX>=0 && newY>=0 && newX<grid.length && newY<grid[0].length && grid[newX][newY]==1){
                grid[newX][newY] = 0;
                island += dfs(grid,newX,newY);
            }
        }
        return island;
    }
    public int maxAreaOfIsland(int[][] grid) {

        int islandCount = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    grid[i][j] = 0;
                    islandCount = Math.max(islandCount, dfs(grid, i, j));
                }
            }
        }

        return islandCount;
    }
}
