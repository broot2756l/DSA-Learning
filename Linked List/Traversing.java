/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class Traversing {

    // function to traverse and print the singly linked list
    static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        // create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40
        Node head = new Node(50);
        head.next = new Node(30);
        head.next.next = new Node(20);
        head.next.next.next = new Node(0);

        traverseList(head);
    }
}