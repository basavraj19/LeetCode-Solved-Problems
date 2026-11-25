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
            return head;
        }

        Node newHead = null;
        Node mover = null;
        Node temp = head;

        while (temp != null) {
            Node cur = new Node(temp.val);

            if (newHead == null) {
                newHead = cur;
                mover = cur;
            } else {
                mover.next = cur;
                mover = mover.next;
            }

            temp = temp.next;
        }

        temp = head;
        mover = newHead;
        while (temp != null) {
            mover.random = getRandom(head, newHead, temp.random);
            temp = temp.next;
            mover = mover.next;
        }

        return newHead;
    }

    public Node getRandom(Node head, Node newHead, Node random) {
        Node temp1 = head;
        Node temp2 = newHead;

        while (temp1 != null) {
            if (temp1 == random) {
                return temp2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}