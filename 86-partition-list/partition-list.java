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
class Solution {
    public ListNode partition(ListNode head, int x) {
       ListNode dummy1 = new ListNode(-1);
       ListNode s = dummy1;
       ListNode dummy2 = new ListNode();
       ListNode l = dummy2;
       ListNode temp = head;
       while(temp!=null){
        if(temp.val>=x){
            l.next= temp;
            l = temp;
        }else{
            s.next = temp;
            s = temp;
        }
        temp = temp.next;
       }
       l.next = null;
       s.next = dummy2.next;
       return dummy1.next;

    }
}