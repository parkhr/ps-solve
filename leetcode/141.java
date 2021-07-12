public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        Set<ListNode> set = new HashSet<>();
        set.add(head);
        
        while(head.next != null){
            head = head.next;
            if(!set.add(head)){
                return true;
            }
        }
        
        return false;
    }
}
