/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class InsertAtTail {

    public static Node insertAtTail(Node head, int value) {
        Node newNode = new Node(value);
        if(head == null) return newNode;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(30);
        head.next.next = new Node(20);
        insertAtTail(head, 40);
        Traversing.traverseList(head);
    }
    
}
