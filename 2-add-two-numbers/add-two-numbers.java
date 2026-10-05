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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = null;
        ListNode prev = null;
        int carry = 0;
        while (temp1 != null || temp2 != null || carry == 1) {
            int s = carry;

            if (temp1 != null) {
                s += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                s += temp2.val;
                temp2 = temp2.next;
            }

            ListNode newNode = new ListNode(s % 10);
            carry = s / 10;

            if (head == null) {
                head = newNode;
            } else {
                prev.next = newNode;
            }
            prev = newNode;
        }

        return head;
    }
}