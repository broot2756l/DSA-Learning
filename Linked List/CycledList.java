public class CycledList {
    public static Node createLinkedListWithCycle(int[] values, int cyclePos) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node curr = head;
        Node cycleNode = (cyclePos == 0) ? head : null;

        for (int i = 1; i < values.length; i++) {
            curr.next = new Node(values[i]);
            curr = curr.next;
            if (i == cyclePos) {
                cycleNode = curr;   // remember this node — we'll loop back to it
            }
        }

        if (cyclePos >= 0) {
            curr.next = cycleNode;   // instead of null, tail points back into the list
        }

        return head;
    }
}
