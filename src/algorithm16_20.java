import java.util.HashMap;

public class algorithm16_20 {
    public static void main(String[] args) {
        // 19.删除链表的倒数第N个节点
        /*ListNode l1 = new ListNode(1);
        ListNode l2 = l1.next = new ListNode(2);
        ListNode l3 = l2.next = new ListNode(3);
        ListNode l4 = l3.next = new ListNode(4);
        l4.next = new ListNode(5);

        removeNthFromEnd(l1, 2);
        while (l1!=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }*/

        // 20.有效的括号
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";
    }


    // 19.删除链表的倒数第N个节点
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i < n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    // 20.有效的括号
    public static boolean isValid(String s) {
        boolean[] b = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {

        }

        return false;
    }
}
