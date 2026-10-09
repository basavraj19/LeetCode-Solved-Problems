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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(prev.next);
        prev.next = null;
        slow = head;
        fast = newHead;

        while (slow != null) {
            if (slow.val != fast.val) {
                prev.next = reverse(newHead);
                   print(head);
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = reverse(newHead);
        print(head);
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
        }

        return prev;
    }

      public void print(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}