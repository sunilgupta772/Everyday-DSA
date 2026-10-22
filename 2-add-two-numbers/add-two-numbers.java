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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i = l1;
        ListNode j = l2;
        ListNode ans = new ListNode();
        ListNode temp = ans;
        int carry=0;
        int sum = 0;
        while(i!=null && j!=null){
            sum = i.val + j.val + carry;
             int last = sum % 10;
            carry = sum / 10;

            temp.next = new ListNode(last);
            temp = temp.next;

            i = i.next;
            j = j.next;
        }
        while(i!=null){
            sum = i.val + carry;
            int last = sum % 10;
            carry = sum / 10;
            temp.next = new ListNode(last);
            temp = temp.next;
            i = i.next;
        }
        while(j!=null){
           sum = j.val + carry;
            int last = sum % 10;
            carry = sum / 10;
            temp.next = new ListNode(last);
            temp = temp.next;
            j = j.next;
        }
        if(carry!=0){
            temp.next = new ListNode(carry);
        }
        return ans.next;
    
    }
}