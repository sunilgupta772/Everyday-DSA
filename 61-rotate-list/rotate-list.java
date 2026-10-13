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
    public ListNode rotateRight(ListNode head, int k) {
       ListNode temp = head;
       int size =0;
       int rotate = 0;
       while(temp!=null){
        temp = temp.next;
        size++;
       }
       if(k>size && size>0){
        rotate = k%size;

       }else{
         rotate = k;
       }
       int i =1;
       if(size>1){
        while(i<=rotate){
       temp = head;
       while(temp.next.next!=null){
        temp = temp.next;
       }
       ListNode last = temp.next;
       last.next = head;
       head = last;
       temp.next = null;
       i++; 
       }
       }
       return head;
    }
}