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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode();
        ListNode node = head;
        ListNode prev = null;

        while (node != null && node.next != null) {
            ListNode temp = new ListNode();
            temp.val = node.val;
            temp.next = null;
            if (node == head) {
                newHead = temp;
            } else {
                prev.next = temp;
            }
            prev = temp;
            node = node.next.next;
        }

        if (node != null) {
            ListNode temp = new ListNode();
            temp.val = node.val;
            temp.next = null;
            prev.next = temp;
            prev = temp;
        }

        node = head.next;
        while (node != null && node.next != null) {
            ListNode temp = new ListNode();
            temp.val = node.val;
            prev.next = temp;
            prev = temp;
            node = node.next.next;
        }
        if (node != null) {
            ListNode temp = new ListNode();
            temp.val = node.val;
            temp.next = null;
            prev.next = temp;
            prev = temp;
        }
        return newHead;
    }
}