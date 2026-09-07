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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        return reverse(head, null);
    }

    public ListNode reverse(ListNode cur, ListNode prev) {
        if (cur == null) {
            return prev;
        }

        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;

        return reverse(temp, prev);
    }
}