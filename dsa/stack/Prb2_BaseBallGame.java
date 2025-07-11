package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;


/*
Time complexity O(N)
Space complexity O(N)

Slight optimisation possible - keep sum of values inserted in stack
so we do not have to loop over again

 */
public class Prb2_BaseBallGame {
        public int calPoints(String[] operations) {
            Deque<Integer> deque = new ArrayDeque<>();
            for(int i=0;i<operations.length;i++){
                if(operations[i].compareTo("D")==0){
                    if(deque.size()>0)
                        deque.offerLast(deque.peekLast()*2);
                } else if(operations[i].compareTo("C")==0){
                    if(deque.size()>0){
                        deque.pollLast();
                    }
                } else if(operations[i].compareTo("+")==0){
                    if(deque.size()>=2){
                        int first = deque.pollLast();
                        int sum = first + deque.peekLast();
                        deque.offerLast(first);
                        deque.offerLast(sum);
                    }
                } else {
                    deque.offerLast(Integer.parseInt(operations[i]));
                }
            }

            int sum = 0;
            while(deque.size()!=0){
                sum += deque.pollLast();
            }
            return sum;
        }

        public static void main(String[] args){
          System.out.println(new  Prb2_BaseBallGame().calPoints(new String[]{"12","12","D","12","C","+"}));
        }
}
