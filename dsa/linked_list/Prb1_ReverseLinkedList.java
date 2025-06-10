package dsa.linked_list;

import dsa.linked_list.helper.ListNode;

public class Prb1_ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode trav = head;
        ListNode next = null;

        while(trav!=null){
            next = trav.next;
            if(newHead==null){
                newHead = trav;
                trav.next = null;
            } else {
                trav.next = newHead;
                newHead = trav;
            }
            trav = next;
        }
        return newHead;
    }
    public static void main(String[] args){
        ListNode listNode = new ListNode(1, null);
        ListNode trav = listNode;
        for(int i=2;i<=4;i++){
           trav.insertNext(new ListNode(i,null));
           trav = trav.next;
        }
        listNode = reverseList(listNode);
        listNode.print();

    }
}
