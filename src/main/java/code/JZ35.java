package code;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 复杂链表的复制
 */
public class JZ35 {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(head);
        nodeMap.put(head, new Node(head.val));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            Node tempNode = nodeMap.get(node);
            if (node.next != null) {
                if (nodeMap.containsKey(node.next)) {
                    tempNode.next = nodeMap.get(node.next);
                } else {
                    queue.offer(node.next);
                    Node tempNextNode = new Node(node.next.val);
                    tempNode.next = tempNextNode;
                    nodeMap.put(node.next, tempNextNode);
                }
            }
            if (node.random != null) {
                if (nodeMap.containsKey(node.random)) {
                    tempNode.random = nodeMap.get(node.random);
                } else {
                    queue.offer(node.random);
                    Node tempNextNode = new Node(node.random.val);
                    tempNode.random = tempNextNode;
                    nodeMap.put(node.random, tempNextNode);
                }
            }
        }
        return nodeMap.get(head);
    }
}
