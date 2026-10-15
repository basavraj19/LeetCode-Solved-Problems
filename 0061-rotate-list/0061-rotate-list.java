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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        if (k % len == 0) {
            return head;
        }
        k = k % len;
        temp.next = head;
        temp = head;
        len = len - k - 1;
        while (len != 0) {
            temp = temp.next;
            len--;
        }

        head = temp.next;
        temp.next = null;
        return head;
    }
}