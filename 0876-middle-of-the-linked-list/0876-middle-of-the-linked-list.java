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
    public ListNode middleNode(ListNode head) {
        int q=0;
        ListNode t=head;
        while(t!=null){
            t=t.next;
            q++;
        }
        int i=0;
        t=head;
        q=(q/2);
        while(i<q){
            t=t.next;
            i++;
        }
        return t;
    }
}