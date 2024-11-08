import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode newHead = new ListNode(stack.pop());
        ListNode a = newHead;
        while(!stack.empty()){
            a.next = new ListNode(stack.pop());
            a = a.next;
        }
        return newHead;
    }
}
