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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=null,head=null;
        while(list1!=null || list2!=null){
            int num=0;
            if(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    num=list1.val;
                    list1=list1.next;
                }
                else{
                    num= list2.val;
                    list2=list2.next;
                }
            }
            else if(list2!=null){
                num= list2.val;
                list2=list2.next;
            }
            else if(list1!=null){
                num= list1.val;
                list1= list1.next;
            }
            
            ListNode newest= new ListNode(num);
            
            if(head== null){
                head=temp=newest;
            }
            else{
                temp.next= newest;
                temp=temp.next;
            }
        }
        return head;
    }
}
