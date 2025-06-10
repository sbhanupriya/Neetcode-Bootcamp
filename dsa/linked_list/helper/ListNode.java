package dsa.linked_list.helper;

import java.util.List;

public class ListNode {
    public int data;
    public ListNode next;
    public int val;
    public ListNode(int v){
        this.val = v;
        this.data = v;
    }
    public ListNode(int d, ListNode n){
        this.data = d;
        this.val = d;
        this.next = n;
    }
    public void insertNext(ListNode node){
        this.next = node;
    }

    public void print(){
        ListNode trav = this;
        while(trav!=null){
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        }
    }
}
