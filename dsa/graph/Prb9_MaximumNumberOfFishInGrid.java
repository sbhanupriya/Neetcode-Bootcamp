package dsa.graph;

import helper.Pair;

import java.util.ArrayDeque;
import java.util.Queue;

public class Prb9_MaximumNumberOfFishInGrid {
    private int helperBfs(int[][] grid, int i, int j, boolean[][] vis){
        int count = 0;
        Queue<Pair<Integer,Integer>> queue = new ArrayDeque<>();
        queue.offer(new Pair<>(i,j));
        int[] x = new int[]{0,0,1,-1};
        int[] y = new int[]{1,-1,0,0};
        vis[i][j] = true;

        while(queue.isEmpty()==false){
            Pair<Integer,Integer> pair = queue.poll();
            count += grid[pair.getKey()][pair.getValue()];
            for(int k=0;k<4;k++){
                int newX = pair.getKey() + x[k];
                int newY = pair.getValue() + y[k];
                if(newX>=0 && newY>=0 && newX<grid.length && newY<grid[0].length && vis[newX][newY]==false && grid[newX][newY]>0){
                    vis[newX][newY] = true;
                    queue.offer(new Pair<>(newX, newY));
                }
            }
        }

        return count;
    }
    public int findMaxFish(int[][] grid) {
        int maxFishCount = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0 && vis[i][j]==false){
                    maxFishCount = Math.max(maxFishCount, helperBfs(grid,i,j,vis));
                }
            }
        }
        return maxFishCount;
    }
}
