
//  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mergedList.next = mergedList;
                mergedList.val = list1.val;
                if( list1.next != null) {
                    list1 = list1.next;
                } else {list1 = null;}
            } else if (list1.val > list2.val) {
                mergedList.next = mergedList;
                mergedList.val = list2.val;
                if( list2.next != null) {
                    list2 = list2.next;
                } else {list2 = null;}
            } else {
                mergedList.next = mergedList;
                mergedList.val = list1.val;
                if( list1.next != null) {
                    list1 = list1.next;
                } else {list1 = null;}
                mergedList.next = mergedList;
                mergedList.val = list2.val;
                if( list2.next != null) {
                    list2 = list2.next;
                } else {list2 = null;}
            }
        }
        while (list1 != null){
            mergedList.next = mergedList;
            mergedList.val = list1.val;
            if( list1.next != null) {
                list1 = list1.next;
            } else {list1 = null;}
        }
        while (list2 != null){
            mergedList.next = mergedList;
            mergedList.val = list2.val;
            if( list2.next != null) {
                list2 = list2.next;
            } else {list2 = null;}
        }
        return mergedList;
    }
}
