package dsa.two_pointers;

import java.util.Arrays;

public class Prb12_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int satisfyCount = 0;
        int cookieIndex = 0;
        int childIndex = 0;
        while(childIndex<g.length && cookieIndex <s.length){
            if(g[childIndex]<=s[cookieIndex]){
                satisfyCount++;
                childIndex++;
                cookieIndex++;
            } else {
                cookieIndex++;
            }
        }

        return satisfyCount;
    }

    public static void main(String[] args){
        System.out.println(new Prb12_AssignCookies().findContentChildren(new int[]{10,2,4,5},new int[] {9,1,2,4,8,100}));
    }
}
