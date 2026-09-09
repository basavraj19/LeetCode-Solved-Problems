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

        while (fast != null && fast.next != null) {
            ListNode cur = slow;
            slow = slow.next;
            fast = fast.next.next;
            cur.next = prev;
            prev = cur;
        }

        if (fast == null) {
            return checkPalindrom(prev, slow);
        }
        return checkPalindrom(prev, slow.next);
    }

    private boolean checkPalindrom(ListNode left, ListNode right) {
        while (left != null && right != null) {
            if (left.val != right.val) {
                reverse(left, right);
                return false;
            }
            left = left.next;
            right = right.next;
        }
        reverse(left, right);
        return true;
    }

    private void reverse(ListNode left, ListNode right) {
        ListNode temp = left;
        ListNode prev = right;
        while (temp != null) {
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
        }
        while (prev != null) {
            System.out.println(prev.val);
            prev = prev.next;
        }
    }
}