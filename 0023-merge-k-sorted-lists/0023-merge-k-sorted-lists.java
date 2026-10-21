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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = merge(head, lists[i]);
        }

        return head;
    }

    private ListNode merge(ListNode head, ListNode list) {
        if (head == null) {
            return list;
        }

        if (list == null) {
            return head;
        }
        ListNode newHead = null;
        ListNode temp1 = head;
        ListNode temp2 = list;
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