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

public class Reverse {
        public ListNode reverseList(ListNode head) {
            ListNode next=head;
            ListNode pres=next;
            ListNode prev=null;

            while(next!=null){
                next=next.next;
                pres.next=prev;
                prev=pres;
                pres=next;
            }
            head=pres;

            return prev;

        }

}