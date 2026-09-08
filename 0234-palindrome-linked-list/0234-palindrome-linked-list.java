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
        if (head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int count = 0;
        while (fast != null && fast.next != null) {
            ListNode cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = prev;
            prev = cur;
        }

        if (fast == null) {
            while (prev != null && slow != null) {
                if (prev.val != slow.val) {
                    return false;
                }
                prev = prev.next;
                slow = slow.next;
            }
        } else {
            slow = slow.next;
            while (prev != null && slow != null) {
                if (prev.val != slow.val) {
                    return false;
                }
                prev = prev.next;
                slow = slow.next;
            }
        }
        return true;
    }
}