package dsa.sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prb31_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int end = 0;
        int start = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length-k+1];
        int index = 0;
        for(end=0;end<nums.length;end++){
            while(deque.size()>0 && deque.peekLast()<nums[end]){
                deque.pollLast();
            }
            deque.offerLast(nums[end]);
            if((end-start+1)==k){
                result[index++] = deque.peekFirst();
                if(nums[start]==deque.peekFirst())
                    deque.pollFirst();
                start++;
            }
        }
        return result;
    }
    public static  void main(String[] args){
        int[] res = new Prb31_SlidingWindowMaximum().maxSlidingWindow(new int[]{3,-1,0,-9,1,2,4},3);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
