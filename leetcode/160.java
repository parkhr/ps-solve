// O(n+m) 인듯
// O(n) 으로 어떻게? => 

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> list = new ArrayList<>();
        
        while(true){
            list.add(headA);
            if(headA.next != null){
                headA = headA.next;
            }else {
                break;
            }
        }
        
        while(true){
            if(list.contains(headB)) return headB;
            
            if(headB.next != null){
                headB = headB.next;
            }else {
                break;
            }
        }
        
        return null;
    }
  
  // ========================================================================
  // O(n)
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int lenA = length(headA), lenB = length(headB);

      while (lenA > lenB) {
          headA = headA.next;
          lenA--;
      }
      while (lenA < lenB) {
          headB = headB.next;
          lenB--;
      }

      while (headA != headB) {
          headA = headA.next;
          headB = headB.next;
      }
      return headA;
  }

  private int length(ListNode node) {
      int length = 0;
      while (node != null) {
          node = node.next;
          length++;
      }
      return length;
  }
}
