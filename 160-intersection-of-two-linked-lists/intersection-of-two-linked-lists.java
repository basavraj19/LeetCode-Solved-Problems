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

        ListNode tempA = headA;
        ListNode tempB = headB;
        int lenA = 0, lenB = 0;

        while (tempA != null || tempB != null) {
            if (tempA != null) {
                tempA = tempA.next;
                lenA++;
            }

            if (tempB != null) {
                tempB = tempB.next;
                lenB++;
            }
        }

        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {

            for (int i = 0; i < lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}