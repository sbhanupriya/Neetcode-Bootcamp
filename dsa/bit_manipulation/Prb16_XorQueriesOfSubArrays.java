package dsa.bit_manipulation;

public class Prb16_XorQueriesOfSubArrays {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        int[] prefixXor = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            prefixXor[i+1] = prefixXor[i] ^ arr[i];
        }

        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixXor[end+1]^prefixXor[start];
        }

        return result;
    }
}
