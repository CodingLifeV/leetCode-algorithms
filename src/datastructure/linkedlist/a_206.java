package datastructure.linkedlist;

import java.util.List;

/**
 * 反转链表
 *  头插尾插思想 : https://blog.csdn.net/qq_41998576/article/details/81484569
 *  https://blog.csdn.net/fx677588/article/details/72357389
 */
public class a_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        /*
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
        */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


