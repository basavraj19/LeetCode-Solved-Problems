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

        Map<Node, Node> map = new HashMap<>();
        map.put(null, null);

        while (temp != null) {
            Node cur = new Node(temp.val);
            map.put(temp, cur);

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
            mover.random = map.get(temp.random);
            temp = temp.next;
            mover = mover.next;
        }

        return newHead;
    }
}