/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class InsertAtPos {
    public static Node insertAtPos(Node head, int value, int pos) {
        Node newNode = new Node(value);
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for(int i = 0; i < pos - 1 && curr != null; i++){
            curr = curr.next;
        }
        if(curr != null){
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(30);
        head.next.next = new Node(20);
        insertAtPos(head, 40, 1);
        Traversing.traverseList(head);
    }
    
}
