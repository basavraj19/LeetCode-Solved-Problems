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
        while(p.next!=null){
            p=p.next;
        }
        p.next=list2;
        p=list1;
        while(p!=null){
            ListNode q=p;
            while(q!=null){
                if(p.val>q.val)
                {
                    int t=p.val;
                    p.val=q.val;
                    q.val=t;
                }
                q=q.next;
            }
            p=p.next;
        }
        return list1;
    }
}