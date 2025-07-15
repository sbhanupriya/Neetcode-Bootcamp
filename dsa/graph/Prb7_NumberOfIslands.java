package dsa.graph;

/*
Time O(n*m)
Space O(n*m)
But DSU is HOTS!!!

1) Flatten 2D array into 1D indexes
2) Each land cell is considered 1 component -> islandCount++;
3) For each land cell, merge 4 directions (union) if successful reduce islandCount
islandCount --
 */
public class Prb7_NumberOfIslands {
    private void dfs(char[][] grid, boolean[][] vis, int i, int j){
        int[] x = {1,-1,0,0};
        int[] y = {0,0,-1,1};
        for(int k=0;k<4;k++){
            int newX = i + x[k];
            int newY = j + y[k];
            if(newX>=0 && newY>=0 && newX<grid.length && newY<grid[0].length && grid[newX][newY]=='1' && vis[newX][newY]==false){
                //System.out.println(newX+ " " + newY);
                vis[newX][newY] = true;
                dfs(grid,vis,newX,newY);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    vis[i][j] = true;
                    dfs(grid,vis,i,j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    public static void main(String[] args){
        char[][] grid = new char[][] {{'1','1','1'},{'0','0','0'},{'1','1','1','1'}};
        System.out.println(new Prb7_NumberOfIslands().numIslands(grid));
    }
}
