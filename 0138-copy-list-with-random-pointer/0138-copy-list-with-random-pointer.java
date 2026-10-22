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

        Node newHead = null;
        Node mover = null;
        Node temp = head;

        while (temp != null) {
            Node newNode = new Node(temp.val);

            if (newHead == null) {
                newHead = newNode;
                mover = newNode;
            } else {
                mover.next = newNode;
                mover = mover.next;
            }
            temp = temp.next;
        }

        temp = head;
        mover = newHead;

        while (temp != null) {
            mover.random = getRandom(head, newHead, temp.random);
            mover = mover.next;
            temp = temp.next;
        }

        return newHead;
    }

    private Node getRandom(Node head1, Node head2, Node random) {
        if (head1 == random) {
            return head2;
        }

        Node temp = head1;
        Node mover = head2;

        while (temp != null) {
            if (temp == random) {
                return mover;
            }
            temp = temp.next;
            mover = mover.next;
        }

        return null;
    }
}