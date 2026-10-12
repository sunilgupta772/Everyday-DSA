
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode fast = head;
        ListNode prev = null;

        while(curr != null){
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }

        return prev;
    }
}
