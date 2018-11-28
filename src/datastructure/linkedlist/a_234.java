package datastructure.linkedlist;

public class a_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) slow = slow.next;
        cut(head, slow);
        return isEqual(head, reverse(slow));
    }
    private void cut(ListNode head, ListNode cutNode) {
        while (head.next != cutNode) {
            head = head.next;
        }
        head.next = null;
    }
    private ListNode reverse(ListNode head) {
        ListNode newNode = null;
        while (head != null) {
            ListNode node = head.next;
            head.next = newNode;
            newNode = head;
            head = node;
        }
        return newNode;
    }
    private boolean isEqual(ListNode l1, ListNode l2) {
        while (l1 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
