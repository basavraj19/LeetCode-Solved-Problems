/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.val);

            newNode.next = temp.next;
            temp.next = newNode;

            temp = newNode.next;
        }

        temp = head;
        Node newHead = temp.next;

        while (temp != null) {
            Node clonedNode = temp.next;

            clonedNode.random = temp.random == null ? null : temp.random.next;

            temp = clonedNode.next;
        }

        temp = head;

        while (temp != null) {
            Node clonedNode = temp.next;

            temp.next = clonedNode.next;
            temp = temp.next;

            clonedNode.next = temp == null ? null : temp.next;
        }

        return newHead;
    }
}