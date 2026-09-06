public class MiddleOfList {
    public static Node middleNode(Node head) {
      Node slow = head;
      Node fast = head;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(40);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);

        head = middleNode(head);
        System.out.println(head.data);
    }
}
