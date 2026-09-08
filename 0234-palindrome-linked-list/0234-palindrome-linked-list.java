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
        if (head.next == null) {
            return true;
        }

        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        return checkPalindrome(arr);
    }

    private boolean checkPalindrome(List<Integer> arr) {
        int low = 0, high = arr.size()-1;
        while (low <= high) {
            if (arr.get(low) != arr.get(high)) {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}