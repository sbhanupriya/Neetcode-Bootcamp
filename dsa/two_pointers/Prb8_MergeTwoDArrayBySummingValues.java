package dsa.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class Prb8_MergeTwoDArrayBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int left1 = 0;
        int left2 = 0;
        while(left1<nums1.length && left2<nums2.length){
            if(nums1[left1][0]==nums2[left2][0]){
                result.add(new int[]{nums1[left1][0],nums1[left1][1]+ nums2[left2][1]});
                left1++;
                left2++;
            } else if(nums1[left1][0]<nums2[left2][0]){
                result.add(new int[]{nums1[left1][0], nums1[left1][1]});
                left1++;
            }
            else {
                result.add(new int[]{nums2[left2][0], nums2[left2][1]});
                left2++;
            }
        }
        while(left1<nums1.length){
            result.add(new int[]{nums1[left1][0], nums1[left1][1]});
            left1++;
        }
        while(left2<nums2.length){
            result.add(new int[]{nums2[left2][0], nums2[left2][1]});
            left2++;
        }
        int[][] mergedArray = new int[result.size()][2];

        for(int i=0;i<result.size();i++){
            mergedArray[i][0] = result.get(i)[0];
            mergedArray[i][1] = result.get(i)[1];
        }
        return mergedArray;
    }
}
