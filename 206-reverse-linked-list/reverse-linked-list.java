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

        ListNode temp = head;
        ListNode newHead = null;

        while (temp != null) {
            ListNode cur = new ListNode();
            cur.val = temp.val;
            cur.next = newHead;
            newHead = cur;
            temp = temp.next;
        }

        return newHead;
    }
}