package dsa.graph;

public class Prb3_FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] inDeg = new int[n+1];
        int[] outDeg = new int[n+1];

        for(int i=0;i<trust.length;i++){
            int source = trust[i][0];
            int destination = trust[i][1];
            outDeg[source]++;
            inDeg[destination]++;
        }

        for(int i=1;i<=n;i++){
            if(outDeg[i]==0 && inDeg[i]==n-1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(new Prb3_FindTheTownJudge().findJudge(5, new int[][] {{1,2},{2,3},{1,3}, {4,3},{5,3}}));
    }
}
