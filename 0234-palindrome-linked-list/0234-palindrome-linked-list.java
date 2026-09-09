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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode left = head;
        ListNode right = reverse(slow.next);

        while (right != null) {
            if (left.val != right.val) {
                reverse(slow.next);
                return false;
            }
            left = left.next;
            right = right.next;
        }
        reverse(slow.next);
        return true;
    }

    private ListNode reverse(ListNode temp) {
        ListNode prev = null;
        while (temp != null) {
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
        }

        return prev;
    }
}