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
        ListNode temp = head;
        ListNode newHead = head;
        ListNode prevHead = null;
        while (temp != null) {
            ListNode kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                if (prevHead != null) {
                    prevHead.next = temp;
                }
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);
            if (temp == head) {
                newHead = kthNode;
                prevHead = temp;
            } else {
                prevHead.next = kthNode;
                prevHead = temp;
            }
            temp = nextNode;
        }

        return newHead;
    }

    private void reverse(ListNode temp) {
        ListNode prev = null;
        while (temp != null) {
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
        }
    }

    private ListNode getKthNode(ListNode temp, int k) {
        k--;
        while (k > 0 && temp != null) {
            temp = temp.next;
            k--;
            if (k == 0) {
                return temp;
            }
        }

        return null;
    }
}