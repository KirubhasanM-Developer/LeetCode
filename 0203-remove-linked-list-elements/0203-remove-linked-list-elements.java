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
        if(head==null){
            return null;
        }
       
        
        ListNode temp1=null,temp2=head;
        while(temp2!=null&&temp2.val==val){
            temp2=temp2.next;
        }head=temp2;

        while(temp2!=null){
            if(temp2.val==val){
                temp1.next=temp2.next;
                  temp2=temp2.next;
                  continue;
                

            }
            temp1=temp2;
            temp2=temp2.next;
        }
        return head;
    }
}