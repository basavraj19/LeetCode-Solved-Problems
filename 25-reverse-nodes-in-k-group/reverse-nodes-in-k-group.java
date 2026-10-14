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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 0;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next.next;
            len += 2;
        }

        if (temp != null) {
            len++;
        }
        len = len - len % k;
        return reverse(head, len, k);
    }

    private ListNode reverse(ListNode head, int len, int k) {
        ListNode prev = null;
        ListNode temp = head;
        ListNode curHead = head;
        ListNode prevHead = null;
        ListNode newHead = null;
        int x = 1;

        while (x <= len && temp != null) {
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
            if (x % k == 1 || k == 1) {
                prevHead = curHead;
                curHead = cur;
            }
            if (x % k == 0) {
                if (newHead == null) {
                    newHead = cur;
                }
                if (prevHead != null) {
                    prevHead.next = cur;
                }
                prev = null;
            }
            x++;
        }
        curHead.next = temp;
        return newHead;
    }
}