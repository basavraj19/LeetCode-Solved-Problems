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

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.offer(lists[i]);
            }
        }

        ListNode head = null;
        ListNode temp = null;

        while (!pq.isEmpty()) {
            ListNode cur = pq.poll();
            if (head == null) {
                head = cur;
                temp = cur;
            } else {
                temp.next = cur;
                temp = temp.next;
            }

            if (cur.next != null) {
                pq.offer(cur.next);
            }
        }

        return head;
    }
}