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

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        temp = head;
        while (temp != null) {
            temp.val = arr.get(i);
            temp = temp.next;
            if (i >= arr.size()-2) {
                i = 1;
            } else {
                i += 2;
            }
        }

        return head;
    }
}