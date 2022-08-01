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
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode p=head,q=head;
        if(p.next==null)
            return false;
        if(p.next==q.next.next)
            return true;
        while(p.next!=null){
            if(q.next==null || q.next.next==null)
                return false;
            else{
                q=q.next.next;
                p=p.next;
            }
            if(p.next==q.next)
                return true;
        }
        return false;
    }
}
