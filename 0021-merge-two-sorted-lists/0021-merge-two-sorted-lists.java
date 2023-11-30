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
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode p=list1;
        ListNode q=list1;
        while(p!=null){
            arr.add(p.val);
            q=p;
            p=p.next;
        }
        q.next=list2;
        p=list2;
        while(p!=null){
            arr.add(p.val);
            p=p.next;
        }
        Collections.sort(arr);
        int i=0;
        p=list1;
        while(p!=null){
            p.val=arr.get(i);
            i++;
            p=p.next; 
        }
        return list1;
    }
}