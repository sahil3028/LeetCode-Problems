public class RemoveDuplicate {
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
        public ListNode deleteDuplicates(ListNode head) {

            ListNode test=head;
            while(test!=null && test.next!=null){
                if(test.val==test.next.val){
                    test.next=test.next.next;
                }else
                    test=test.next;
            }
            return head;
        }
    }

