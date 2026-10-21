class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        while (true) {
            ListNode kth = prevGroup;
            for (int i = 0; i < k; i++) {
                kth = kth.next;
                if (kth == null) {
                    return dummy.next;
                }
            }
            ListNode nextGroup = kth.next;
            ListNode prev = nextGroup;
            ListNode current = prevGroup.next;
            while (current != nextGroup) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }
    }
}