package datastructure.linkedlist;

/**
 *
 * 双指针应用https://blog.csdn.net/hlk09/article/details/81186297
 * https://blog.csdn.net/zjc_game_coder/article/details/78500566
 */
public class a_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        if (fast == null) return head.next;//不够n个结点，删除链表第一个结点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
