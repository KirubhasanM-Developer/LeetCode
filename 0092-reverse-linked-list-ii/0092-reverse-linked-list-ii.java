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
    public ListNode reverseBetween(ListNode head, int left, int right) {   
        
     
     
     
     if (head == null || left == right) {
            return head;
        }

        // Step 1: Reach the node just before the `left` position
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Start reversing from `prev.next`
        ListNode curr = prev.next;
        ListNode nxt = curr.next;

        // Step 2: Reverse the nodes between `left` and `right`
        for (int i = 0; i < right - left; i++) {
            curr.next = nxt.next;
            nxt.next = prev.next;
            prev.next = nxt;
            nxt = curr.next;
        }

        // Step 3: Return the new head of the list
        return dummy.next;
   }
}