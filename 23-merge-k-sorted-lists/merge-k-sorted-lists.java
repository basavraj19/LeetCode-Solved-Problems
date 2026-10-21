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
        ListNode head = null;
        ListNode prev = null;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            if (head == null) {
                head = lists[i];
            }
            if (prev != null) {
                prev.next = temp;
            }
            while (temp != null) {
                arr.add(temp.val);
                prev = temp;
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        ListNode temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = arr.get(i++);
            temp = temp.next;
        }

        return head;
    }
}