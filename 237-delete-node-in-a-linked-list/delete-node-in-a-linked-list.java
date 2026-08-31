/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode currentNode = node;
        ListNode nextNode = node.next;

        while (nextNode.next != null) {
            currentNode.val = nextNode.val;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        currentNode.val = nextNode.val;
        currentNode.next = null;
    }
}