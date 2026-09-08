// Floyd cycle detection --> One slow pointer and one fast pointer.

public class CycleDetection {
    public static boolean hasCycle(Node head) {
      Node slow = head;
      Node fast = head;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
      }
      return false;
    }

    public static Node detectCycleStart(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
            Node slow2 = head;
            while (slow2 != slow) {
                slow2 = slow2.next;
                slow = slow.next;
            }
            return slow2;
            }
      }
      return null;
    }
    

    public static void main(String[] args) {
        Node head = CycledList.createLinkedListWithCycle(new int[] {10, 20, 30, 40, 50}, 1);
        System.out.println(hasCycle(head));
        System.out.println(detectCycleStart(head).data);
    }
}
