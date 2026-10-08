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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (n > len) {
            return null;
        }

        len = len - n;

        if (len == 0) {
            head = head.next;
            return head;
        }

        temp = head;
        ListNode prev = null;

        while (len != 0) {
            len--;
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;
    }
}