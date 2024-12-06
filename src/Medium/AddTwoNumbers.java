package Medium;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int r = 0, carry = 0;
        if(l1.val + l2.val > 9){
            r = l1.val + l2.val - 10;
            carry = 1;
        } else r = l1.val + l2.val;
        ListNode head = new ListNode(r);
        ListNode cur = head;
        l1 = l1.next;
        l2 = l2.next;
        while (l1 != null || l2 != null) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            if (v1 + v2 + carry > 9) {
                cur.next = new ListNode(v1 + v2 + carry -10);
                carry = 1;
            } else {
                cur.next = new ListNode(v1 + v2 + carry);
                carry = 0;
            }
            if(l1 != null) l1 = (l1.next != null) ? l1.next: null;
            if(l2 != null) l2 = (l2.next != null) ? l2.next: null;
            cur = cur.next;
        }
        if(carry == 1) cur.next = new ListNode(1);
        return head;
    }

    public static void main(String[] args) {
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
