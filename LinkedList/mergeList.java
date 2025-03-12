/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ListNode x = new ListNode(0);
        ListNode head = x, temp = head;

        if (lists == null || lists.length == 0) {
            System.out.println("Empty list");
            return x.next;
        }

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null)
                continue;

            ListNode l = lists[i];
            if (x.next == null) {

                while (l != null) {
                    temp.next = new ListNode(l.val);
                    l = l.next;
                    temp = temp.next;
                }
                continue;
            }

            temp = x.next;
            ListNode slow = x;

            while (l != null) {
                ListNode nextL = l.next; // Store next l node
                temp = x; // Reset temp to beginning for each l node

                // Find the correct position to insert l.val
                while (temp.next != null && temp.next.val < l.val) {
                    temp = temp.next;
                }

                // Insert l2 node
                l.next = temp.next;
                temp.next = l;

                // Move to the next l2 node
                l = nextL;

            }

        }
        return x.next;
    }

}