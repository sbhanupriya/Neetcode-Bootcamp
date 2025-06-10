package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prb1_CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        Deque<String> st = new ArrayDeque<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].compareTo("./")==0)
                continue;
            else if(logs[i].compareTo("../")==0){
                st.pollLast();
            } else {
                st.offerLast(logs[i]);
            }
        }

        return st.size();
    }

    public static void main(String[] args){
        System.out.println(minOperations(new String[]{"dc2/","dc1/", "../", "./", "dc4"}));
    }
}
