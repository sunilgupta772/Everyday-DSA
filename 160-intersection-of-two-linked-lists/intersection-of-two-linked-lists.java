/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = 0;
        ListNode temp1 = headA;
        while(temp1!=null){
            temp1 = temp1.next;
            length1++;
        }
        int length2 = 0;
        ListNode temp2 = headB;
        while(temp2!=null){
            temp2 = temp2.next;
            length2++;
        }
        temp1 = headA;
        temp2 = headB;
        if(length1>length2){
            for(int i=0;i<length1-length2;i++){
                temp1 = temp1.next;
            }
        }else{
            for(int i=0;i<length2-length1;i++){
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}