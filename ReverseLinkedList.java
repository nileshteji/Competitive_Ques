/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null)
        {   next = curr.next;
            curr.next = prev;
            prev = curr;
         curr = next;
            
        }
        return prev;
    }
}
