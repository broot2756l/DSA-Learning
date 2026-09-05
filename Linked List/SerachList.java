/* Complexity
--> Time -> O(N)
--> Space -> O(1)
*/

public class SerachList {
    public static int searchList(Node head, int target) {
        if(head == null || head.next == null) return head.data;
        Node curr = head;
        int pos = 0;
        while(curr != null){
            if(curr.data == target){
                return pos;
            }
            curr = curr.next;
            pos += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int found = searchList(head, 40);
        if(found != -1){
            System.out.print("Target found at index ");
            System.out.println(found);
        }
        else{
            System.out.println("Target not found");
        }
    }
    
}
