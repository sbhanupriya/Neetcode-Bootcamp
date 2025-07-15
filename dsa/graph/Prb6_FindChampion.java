package dsa.graph;

public class Prb6_FindChampion {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];
        for (int i = 0; i < edges.length; i++) {
            indegree[edges[i][1]]++;
        }
        int ans = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                count++;
                ans = i;
            }
        }
        return count > 1 ? -1 : ans;
    }

    public static void main(String[] args){
        System.out.println(new Prb6_FindChampion().findChampion(5, new int[][]{{0,1},{1,2},{2,3},{3,4}}));
    }
}
