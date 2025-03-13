public class SwapInPairs {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;

            while (prev.next != null && prev.next.next != null) {
                ListNode first = prev.next;   // First node of the pair
                ListNode second = first.next; // Second node of the pair

                // Swap nodes
                first.next = second.next;
                second.next = first;
                prev.next = second;

                // Move prev forward for the next swap
                prev = first;
            }

            return dummy.next; // New head of the swapped list
        }

    }


