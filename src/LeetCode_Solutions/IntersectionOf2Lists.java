/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA= getSize(headA), sizeB= getSize(headB);
        ListNode p=headA, q=headB;
        if(sizeA>sizeB){
            for(int i=0;i<(sizeA-sizeB);i++)
                p=p.next;
        }
        else
            for(int i=0;i<(sizeB-sizeA);i++)
                q=q.next;
        
        if(p==q)
            return p;
        
        while(p.next!=null || q.next!=null){
            if(p.next==q.next)
                return p.next;
            p=p.next;
            q=q.next;
        }
        return null;
    }
    
    public int getSize(ListNode head){
        int size=1;
        while(head.next!=null){
            size++;
            head=head.next;
        }
        return size;
    }
}
