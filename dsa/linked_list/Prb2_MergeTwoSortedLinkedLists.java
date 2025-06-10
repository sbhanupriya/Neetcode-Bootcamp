package dsa.linked_list;

import dsa.linked_list.helper.ListNode;

public class Prb2_MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;

        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next =list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        if(list1!=null){
            prev.next = list1;
        }
        if(list2!=null){
            prev.next = list2;
        }

        return newHead.next;

    }
    public static void main(String[] args){
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(-1);
        ListNode trav1 = head1;
        ListNode trav2 = head2;
        for(int i=1;i<=10;i++){
            trav1.insertNext(new ListNode(i));
            trav2.insertNext(new ListNode(i));
            trav1 = trav1.next;
            trav2 = trav2.next;
        }

        ListNode mergedList = mergeTwoLists( head1, head2);
        mergedList.print();
    }
}
