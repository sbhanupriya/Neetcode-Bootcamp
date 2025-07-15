package dsa.graph;

import helper.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class Prb4_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        image[sr][sc] = color;
        if(oldColor == color)
            return image;

        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        q.offer(new Pair<Integer,Integer>(sr,sc));

        int[] x = new int[]{1,-1,0,0};
        int[] y = new int[]{0,0,-1,1};

        while(q.isEmpty()==false){
            Pair<Integer,Integer> pair = q.poll();
            for(int k=0;k<4;k++){
                int newX = pair.getKey() + x[k];
                int newY = pair.getValue() + y[k];
                if(newX>=0 && newY>=0 && newX<image.length && newY<image[0].length && image[newX][newY]==oldColor){
                    image[newX][newY] = color;
                    q.offer(new Pair<Integer,Integer>(newX, newY));
                }
            }
        }
        return image;
    }

    public static void  main(String[] args){
        int[][] grid = {{1,1,1,},{1,1,0},{1,0,1}};
        int[][] res = new Prb4_FloodFill().floodFill(grid, 1,1,2);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
