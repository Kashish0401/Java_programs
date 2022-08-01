package LeetCode_Solutions.SinglyLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p=head;
        while(p!=null){
            if(p.next!=null && p.next.val==val){
                    p.next=p.next.next;
            }
           else
               p=p.next;
        }
        if(head!=null && head.val==val)
            head=head.next;
        return head;
    }
}
