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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode p=list1;
        ListNode q=list2;
        ListNode r=list1;
        while(p!=null){
            if(p.val>q.val){
                int t=p.val;
                    p.val=q.val;
                    q.val=t;
                while(q.next!=null){
                    if(q.val<=q.next.val){
                        break;
                    }
                    t=q.val;
                    q.val=q.next.val;
                    q.next.val=t;
                    q=q.next;
                }
                q=list2;
            }
            r=p;
            p=p.next;
        }
        r.next=list2;
        return list1;
    }
}