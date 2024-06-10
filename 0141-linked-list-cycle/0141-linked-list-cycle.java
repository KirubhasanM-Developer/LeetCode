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
        ListNode small=head;
        ListNode large=head;
        while(large!=null&&large.next!=null){
            small=small.next;
            large=large.next.next;
            if(small==large){
                return true;
            }
        }
        return false;
        
    }
}