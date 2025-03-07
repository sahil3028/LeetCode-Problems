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
class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode test =new ListNode(0);
        ListNode x=test;

        while(list1!= null && list2!=null){
            if(list1.val <=list2.val){
                x.next=list1;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                x.next=list2;
                list2=list2.next;
            }

            x=x.next;
        }
        if(list1==null||list2==null){
            if(list1==null){
                while(list2!=null){
                    x.next=list2;
                    list2=list2.next;
                    x=x.next;
                }

            }else{
                while(list1!=null){
                    x.next=list1;
                    list1=list1.next;
                    x=x.next;
                }
            }
        }
        return test.next;
    }
}