public class flattenChild {


        public Node flatten(Node head) {
            if (head == null) return head; // Edge case: empty list

            Node dummy = new Node(); // Temporary node to track head
            dummy.next = head;
            Node prev = dummy;

            Stack<Node> stack = new Stack<>();
            stack.push(head);

            while (!stack.isEmpty()) {
                Node curr = stack.pop();

                prev.next = curr;
                curr.prev = prev;

                // Push next node onto stack (processed later)
                if (curr.next != null) {
                    stack.push(curr.next);
                }

                // Push child node onto stack (processed first)
                if (curr.child != null) {
                    stack.push(curr.child);
                    curr.child = null; // Remove child pointer
                }

                prev = curr; // Move prev forward
            }

            // Fix head pointer
            dummy.next.prev = null;
            return dummy.next;
        }


}
