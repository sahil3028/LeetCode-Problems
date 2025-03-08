public class palindrone {

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

        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;

            ListNode slow = head, fast = head, prev = null;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                ListNode temp = slow.next;
                slow.next = prev;
                prev = slow;
                slow = temp;
            }

            if (fast != null) slow = slow.next;

            while (slow != null) {
                if (slow.val != prev.val) return false;
                slow = slow.next;
                prev = prev.next;
            }

            return true;
        }


}
