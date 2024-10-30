import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null) return null;
        ListNode hA = headA;
        ListNode hB = headB;
        List<ListNode> listA = new ArrayList<>();
        List<ListNode> listB = new ArrayList<>();
        int i = 0;
        while(hA != null || hB != null ){
            if(listB.contains(hA)) return hA;
            if(!listA.contains(hA)) listA.add(hA);
            if(hA.next != null) hA = hA.next;
            if(listA.contains(hB)) return hB;
            if(!listB.contains(hB)) listB.add(hB);
            if(hB.next != null) hB = hB.next;
            if(hA.next == null && hB.next == null) {
                if(i == 1) return null; else i++;
            }
        }
        return null;
    }
}
