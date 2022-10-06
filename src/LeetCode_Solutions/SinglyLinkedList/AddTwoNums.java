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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,sum=0;
        ListNode head=null,temp=null;
        while(l1!=null || l2!=null){
            if(l1!=null){
                sum=l1.val+sum;
                l1=l1.next;
            }
            if(l2!=null){
                sum=l2.val+sum;
                l2=l2.next;
            }
            sum+=carry;
            carry= sum/10;
            ListNode newest= new ListNode(sum%10);
            if(head==null)
                head=temp=newest;
            else{
                temp.next = newest;
                temp=temp.next;
            }
            sum=0;
        }
        if(carry!=0)
            temp.next= new ListNode(carry);
        return head;
    }
}
