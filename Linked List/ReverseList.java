public class ReverseList {

    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(0);

        head = reverseList(head);
        Traversing.traverseList(head);
    }
    
}
