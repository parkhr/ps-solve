// Node 순회 시간복잡도는 = 전체 순환하면 O(n)
// 전체 시간복잡도는 l1, l2 length 값 = O(n+m) 인듯

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode handler = head;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                handler.next = l1;
                l1 = l1.next;
            }else {
                handler.next = l2;
                l2= l2.next;
            }

            handler = handler.next;
        }

        if(l1 == null) handler.next = l2;
        else if(l2 == null) handler.next = l1;

        return head.next;
    }
}
