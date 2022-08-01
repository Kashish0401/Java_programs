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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode p=head;
        while(p.next!=null){
            size++;
            p=p.next;
        }
        p=head;
        for(int i=0;i<(size-n-1);i++){
            p=p.next;
        }
        if(size==1)
            return null;
        if(n==size)
            head=head.next;
        if(n==1){
            p.next=null;
        }
        else
            p.next=p.next.next;
        return head;
    }
}
