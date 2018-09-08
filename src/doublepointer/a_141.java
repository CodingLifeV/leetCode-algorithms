package doublepointer;

public class a_141 {
    /*public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode i = head, j = head.next;
        while(j != null) {
            if (i == j) return true;
            j = j.next;
        }
        return false;
    }*/ //错误解法
    //双指针,一个指针每次移动一个节点，一个指针每次移动二个节点，如果存在环，那么这两个指针一定会相遇。
     public boolean hasCycle(ListNode head) {
         if (head == null) return false;
         ListNode i = head, j = head.next;
         while (i != null && j != null && j.next != null) {
             if (i == j) return true;
             i = i.next;
             j = j.next.next;
         }
         return false;
     }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
