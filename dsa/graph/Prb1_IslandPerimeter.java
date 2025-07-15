package dsa.graph;

/*
Intitution - BFS/DFS
getPerimeterLogic - if boundary 1 or if nextCell Land 1
But why do we need to do BFS DFS? Just Apply O(N*M)
Answer is independent on traversal but depends on cell
Time O(N)
Space O(1)
*/

public class Prb1_IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    perimeter += (i-1<0 || grid[i-1][j]==0)? 1:0;
                    perimeter += (i+1==grid.length || grid[i+1][j]==0)?1:0;
                    perimeter += (j-1<0 || grid[i][j-1]==0)? 1:0;
                    perimeter += (j+1==grid[0].length || grid[i][j+1]==0)? 1:0;
                }
            }
        }
        return perimeter;
    }
    public static void main(String[] args){
        System.out.println(new Prb1_IslandPerimeter().islandPerimeter(new int[][]{{1,0,0},{1,0,0},{1,0,0}}));
    }
}
