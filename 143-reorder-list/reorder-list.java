
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;

        ListNode curr = head2;
        ListNode prev = null;

        while (curr != null) {
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }

        ListNode i = head;
        ListNode j = prev;

        while (j != null) {
            ListNode k = i.next;
            i.next = j;
            ListNode nextJ = j.next;
            j.next = k;

            i = k;
            j = nextJ;
        }
    }
}
