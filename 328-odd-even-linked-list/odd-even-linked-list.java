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
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         ListNode dummy1 = new ListNode(-1);
//         ListNode dummy2 = new ListNode(-1);
//         ListNode even = dummy1;
//         ListNode odd = dummy2;
//         ListNode temp = head;
//         while(temp!=null && temp.next!=null){
//             even.next = temp;
//             temp = temp.next;
//             even = even.next;
//             if(temp!=null){
//                 odd.next = temp;
//             temp = temp.next;
//             odd = odd.next;
//             }
            
//         }
       
//         odd.next = null;
//         even.next = dummy2.next;
//         return dummy2.next;
        
//     }
// }

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode odd = dummy1;
        ListNode even = dummy2;
        ListNode temp = head;

        while (temp != null) {
            odd.next = temp;
            temp = temp.next;
            odd = odd.next;

            if (temp != null) {
                even.next = temp;
                temp = temp.next;
                even = even.next;
            }
        }

        even.next = null;
        odd.next = dummy2.next;

        return dummy1.next;
    }
}
