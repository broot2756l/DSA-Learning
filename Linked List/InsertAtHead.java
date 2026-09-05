/* Complexity
--> Time -> O(1)
--> Space -> O(1)
*/

public class InsertAtHead {

    static Node insertAtHead(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;   
        return head;
    }
    public static void main(String[] args) {

        // create a hard-coded linked list:
        // 20 -> 30 -> 40
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);

        head = insertAtHead(head, 10);

        Traversing.traverseList(head);
        
    }
    
}
