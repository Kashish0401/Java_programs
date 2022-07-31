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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        ListNode evenList= head.next,evenHead=evenList;
        head.next=head.next.next;
        ListNode p=head.next;
        while(p!=null && p.next!=null){
            evenList.next=p.next;
            evenList=evenList.next;
            if(p.next.next!=null)
                p.next=p.next.next;
            else 
                break;
            p=p.next;
        }
        evenList.next=null;
        p.next=evenHead;
        return head;
    }
}
