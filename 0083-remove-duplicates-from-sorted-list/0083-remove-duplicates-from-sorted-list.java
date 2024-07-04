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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp=head;
       ListNode temps=temp;
      if(head==null){
        return null;
      }
       
        while(head.next!=null){
           if(head.val!=head.next.val){
temp.next=head.next;
temp=temp.next;
           }
           head=head.next;
        }
        temp.next=null;
        return temps;
    }
}