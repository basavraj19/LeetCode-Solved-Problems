/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode temp = headA;

        while (temp != null) {
            ListNode cur = headB;
            while (cur != null) {
                if (cur == temp) {
                    return temp;
                }
                cur = cur.next;
            }
            temp = temp.next;
        }

        return null;
    }
}