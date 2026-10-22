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
        Map<Node, Node> map = new HashMap<>();
        map.put(null, null);

        while (temp != null) {
            Node newNode = new Node(temp.val);

            if (newHead == null) {
                newHead = newNode;
                mover = newNode;
            } else {
                mover.next = newNode;
                mover = mover.next;
            }
            map.put(temp, newNode);
            temp = temp.next;
        }

        temp = head;
        mover = newHead;

        while (temp != null) {
            mover.random = map.get(temp.random);
            mover = mover.next;
            temp = temp.next;
        }

        return newHead;
    }
}