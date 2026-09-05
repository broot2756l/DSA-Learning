// a linked list node
class Node {
    int data;
    Node next;

    // constructor to initialize a new node with data
    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

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
