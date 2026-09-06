/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class DeleteTail {
    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = deleteTail(head);
        Traversing.traverseList(head);
    }
    
}
