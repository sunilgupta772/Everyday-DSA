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
//     public boolean isPalindrome(ListNode head) {
//         if (head == null || head.next == null) {
//             return true;
//         }

//         ListNode slow = head;
//         ListNode fast = head;

//         // Find the middle of the linked list
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // Start from the node after the middle
//         ListNode head2 = slow.next;
//         slow.next = null;

//         // Reverse the second half
//         ListNode prev = null;
//         ListNode curr = head2;

//         while (curr != null) {
//             ListNode forr = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = forr;
//         }

//         // Compare both halves
//         ListNode i = head;
//         ListNode j = prev;

//         while (i != null && j != null) {
//             if (i.val != j.val) {
//                 return false;
//             }

//             i = i.next;
//             j = j.next;
//         }

//         return true;
//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
         ListNode head2 = slow;
        if (fast != null) {
            head2 = slow.next;
        }
        ListNode prev = null;
        ListNode curr = head2;
        ListNode forr = head2;
        while(curr!=null){
            forr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forr;
        }
        ListNode i = head;
        ListNode j = prev;
        while(i!=null && j!=null){
           
            if(i.val != j.val){  
                return false;
            }
            i = i.next;
            j = j.next;     
        }
        return true;
    }}
 