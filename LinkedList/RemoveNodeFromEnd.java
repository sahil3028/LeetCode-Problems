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

public class RemoveNodeFromEnd {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            if(head.next==null&&n!=0){
                head=null;
                return head;
            }

            ListNode temp= head;
            int count=0,pos=0;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
            if(count-n<0){
                return head.next;
            }
            temp=head;
            while(pos<count-n){
                temp=temp.next;
                pos++;
            }

            if(temp.next==null) temp.next=null;
            else temp.next=temp.next.next;
            return head;


    }}

