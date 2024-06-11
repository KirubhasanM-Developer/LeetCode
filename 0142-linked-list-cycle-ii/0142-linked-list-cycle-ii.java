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
        List<ListNode>li=new ArrayList<>();
        while(head!=null&&!li.contains(head)){
            
            li.add(head);
           head=head.next;

        }
        return head;
        
    }
}