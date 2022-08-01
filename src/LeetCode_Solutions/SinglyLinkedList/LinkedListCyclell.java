package LeetCode_Solutions.SinglyLinkedList;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head==null)
            return null;
        ListNode p=head,q=head;
        if(p.next==null)
            return null;
        if(p.next==q.next.next)
            return p; //for single element pointing towards itself
        while(p.next!=null){
            if(q.next==null || q.next.next==null)
                return null;
            else{
                q=q.next.next;
                p=p.next;
            }
            if(p.next==q.next)
                break;
        }
        p=head;
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}
