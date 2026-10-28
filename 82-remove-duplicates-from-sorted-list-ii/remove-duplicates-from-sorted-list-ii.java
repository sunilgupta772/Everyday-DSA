class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode a = head;
        ListNode b = head;

        while (b != null) {
            if (b.next != null && b.val == b.next.val) {
                int val = b.val;

                while (b != null && b.val == val) {
                    b = b.next;
                }

                if (a == head && a.val == val) {
                    head = b;
                    a = head;
                } else {
                    a.next = b;
                }
            } else {
                a = b;
                b = b.next;
            }
        }

        return head;
    }
}