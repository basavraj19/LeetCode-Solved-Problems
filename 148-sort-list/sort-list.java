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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int len = 0;
        while (temp != null && temp.next != null) {
            len += 2;
            temp = temp.next.next;
        }
        if (temp != null) {
            len++;
        }

        return sort(head, 0, len - 1);
    }

    private ListNode sort(ListNode head, int l, int h) {
        if (l >= h) {
            return head;
        }

        int mid = (l + h) / 2;
        ListNode secHead = head;
        ListNode prev = null;
        int counter = mid;

        while (secHead != null && counter >= l) {
            counter--;
            prev = secHead;
            secHead = secHead.next;
        }

        if (prev != null) {
            prev.next = null;
        }

        head = sort(head, l, mid);
        secHead = sort(secHead, mid + 1, h);

        return merge(head, secHead);
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        ListNode newHead = null;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode temp = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                if (newHead == null) {
                    newHead = temp1;
                    temp = temp1;
                } else {
                    temp.next = temp1;
                    temp = temp.next;
                }
                temp1 = temp1.next;
            } else {
                if (newHead == null) {
                    newHead = temp2;
                    temp = temp2;
                } else {
                    temp.next = temp2;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }
        }

        if (temp1 != null) {
            temp.next = temp1;
        }

        if (temp2 != null) {
            temp.next = temp2;
        }

        return newHead;
    }
}