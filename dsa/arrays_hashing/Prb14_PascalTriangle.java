package dsa.arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/*
Time O(N*N)
 */
public class Prb14_PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            List<Integer> curr = new ArrayList<>();
            for(int j=1;j<i;j++){
                if(j==1){
                    curr.add(1);
                } else {
                    curr.add(result.get(i-2).get(j-1) + result.get(i-2).get(j-2));
                }
            }
            curr.add(1);
            result.add(curr);
        }

        return result;
    }
}
