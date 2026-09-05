/* Complexity
--> Time -> O(1)
--> Space -> O(1)
*/

public class DeleteHead {
    public static Node deleteHead(Node head) {
        if(head == null) return null;
        Node oldHead = head;
        head = head.next;
        oldHead.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = deleteHead(head);
        Traversing.traverseList(head);
    }
    
}
