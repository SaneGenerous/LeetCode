package Medium;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        int v1 = (l1 != null) ? l1.val : 0;
        int v2 = (l2 != null) ? l2.val : 0;
        while (l1 != null || l2 != null) {
            if (v1 + v2 + carry > 9) {

            }
            cur.next = new ListNode(v1 + v2 + carry);
        }
        return head;
    }
    public static void main(String[] args){
            AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
            ListNode l1 = new ListNode(9);
            ListNode l2 = new ListNode(1);
            l2.next = new ListNode(9);
            l2.next.next = new ListNode(9);
            l2.next.next.next = new ListNode(9);
            l2.next.next.next.next = new ListNode(9);
            l2.next.next.next.next.next = new ListNode(9);
            l2.next.next.next.next.next.next = new ListNode(9);
            l2.next.next.next.next.next.next.next = new ListNode(9);
            l2.next.next.next.next.next.next.next.next = new ListNode(9);
            l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
            ListNode l3 = addTwoNumbers.addTwoNumbers(l1, l2);
            while (l3 != null) {
                System.out.println(l3.val);
                l3 = l3.next;
            }

    }

}
