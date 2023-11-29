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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode p=head;
        while(p!=null){
            arr.add(p.val);
            p=p.next;
        }
        int i=arr.size()-1;
        p=head;
        while(p!=null){
            p.val=arr.get(i);
            i--;
            p=p.next;
        }
        return head;
    }
}