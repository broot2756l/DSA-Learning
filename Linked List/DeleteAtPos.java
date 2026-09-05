/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class DeleteAtPos {
    public static Node deleteAtPos(Node head, int pos) {
        if(head == null){
            return null;
        }
        if(pos == 0){
            return head.next;
        }
        Node curr = head;
        for(int i = 0; i < pos - 1 && curr.next != null; i++){
            curr = curr.next;
        }
        if(curr.next != null){
            curr.next = curr.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(30);
        head.next.next = new Node(20);
        deleteAtPos(head, 2);
        Traversing.traverseList(head);
    }
    
}
