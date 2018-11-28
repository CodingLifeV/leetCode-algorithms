package datastructure.linkedlist;

/**
 * 分隔链表
 * https://blog.csdn.net/shey666/article/details/80523049
 */
public class a_725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode cur = root;
        ListNode[] ret = new ListNode[k];
        int N = 0;
        while (cur != null) {
            N++;
            cur = cur.next;
        }
        int mod = N % k;
        int minSize = N / k;
        cur = root;
        for (int i = 0; cur != null && i < k; i++) {
            ret[i] = cur;
            int curSize = minSize + (mod-- > 0 ? 1 : 0);
            for (int j = 0; j < curSize - 1; j++) {
                cur = cur.next;
            }
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return ret;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


