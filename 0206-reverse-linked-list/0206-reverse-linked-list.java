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
        if(head==null||head.next==null) return head;
        ListNode p=head;
        int q=0,i=0,j=0;
        while(p!=null){
            p=p.next;
            q++;
        }
        p=head;
        ListNode r=head;
        int s=q-1;
        while(j<q/2){
            i=0;
            while(i<s){
                i++;
                r=r.next;
            }
            int t=p.val;
            p.val=r.val;
            r.val=t;
            p=p.next;
            r=p;
            s-=2;
            j++;
        }
        return head;
    }
    
}