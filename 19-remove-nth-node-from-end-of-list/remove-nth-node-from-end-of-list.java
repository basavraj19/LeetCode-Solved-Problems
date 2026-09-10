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
        int len = 0;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            len += 2;
            temp = temp.next.next;
        }

        if (temp != null) {
            len++;
        }

        ListNode prev = null;
        temp = head;
        len = len - n;

        if (len == 0) {
            head = head.next;
            return head;
        }
        while (temp != null) {
            if (len == 0) {
                prev.next = temp.next;
                break;
            }
            len--;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}