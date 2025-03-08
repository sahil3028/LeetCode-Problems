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

public class RemoveLinkedLIstElement {


        public ListNode removeElements(ListNode head, int val) {
            // ListNode temp=head;
            if(head!=null){
                while(head.val==val){
                    if(head.next!=null)
                        head=head.next;
                    else {
                        head=null;
                        return head;
                    }
                }
            } else return head;

            ListNode temp=head;

            while(temp.next!=null){
                if(temp.next.val==val){
                    if(temp.next.next!=null){
                        temp.next=temp.next.next;
                    }
                    else{
                        temp.next=null;
                        return head;
                    }
                }
                if(temp.next.val!=val){
                    temp=temp.next;
                }
            }

            return head;
        }

}
