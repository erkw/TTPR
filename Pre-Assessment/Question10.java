import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Question10 {
    public static Node getMiddle(Node head) {
        Node slow = head, fast = head;

        // Fast goes twice as fast as slow
        while (fast != null && fast.next != null) { // Makes it so that it stops at odd and even lengths
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow pointer will be at the middle
    }

    public static void main(String[] args) {
        // Node list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = getMiddle(head);
        System.out.println("Middle node: " + middle.data);
    }
}
