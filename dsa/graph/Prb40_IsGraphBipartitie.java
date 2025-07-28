package dsa.graph;

import helper.Pair;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
Time O(V+2E)
Space O(V)
 */
public class Prb40_IsGraphBipartitie {
    private boolean bfs(int[] color, int[][] graph, int node){
        color[node] = 1;
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(node,1));
        while(queue.size()>0){
            Pair<Integer,Integer> pair = queue.poll();
            for(int adj:graph[pair.getKey()]){
                if(color[adj]==-1){
                    color[adj] = pair.getValue()==1?0:1;
                    queue.offer(new Pair<>(adj, color[adj]));
                } else if(color[adj]==pair.getValue())
                    return false;
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] graph) {

        int[] color = new int[graph.length];
        Arrays.fill(color,-1);

        for(int i=0;i<color.length;i++){
            if(color[i]==-1 && bfs(color,graph,i)==false){
                return false;
            }
        }

        return true;
    }
}
