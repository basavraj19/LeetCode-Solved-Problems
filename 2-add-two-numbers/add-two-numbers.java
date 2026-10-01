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
        ListNode temp = null;
        int remainder = 0;

        while (temp1 != null && temp2 != null) {
            int sum = temp1.val + temp2.val + remainder;
            int digit = sum % 10;
            remainder = sum / 10;
            ListNode curNode = new ListNode(digit);
            curNode.next = null;
            if (head == null) {
                head = curNode;
            } else {
                temp.next = curNode;
            }
            temp = curNode;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            int sum = temp1.val + remainder;
            int digit = sum % 10;
            remainder = sum / 10;
            ListNode curNode = new ListNode(digit);
            curNode.next = null;
            if (head == null) {
                head = curNode;
            } else {
                temp.next = curNode;
            }
            temp = curNode;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            int sum = temp2.val + remainder;
            int digit = sum % 10;
            remainder = sum / 10;
            ListNode curNode = new ListNode(digit);
            curNode.next = null;
            if (head == null) {
                head = curNode;
            } else {
                temp.next = curNode;
            }
            temp = curNode;
            temp2 = temp2.next;
        }
        if (remainder > 0) {
            ListNode curNode = new ListNode(remainder);
            curNode.next = null;
            if (head == null) {
                head = curNode;
            } else {
                temp.next = curNode;
            }
        }
        return head;
    }
}