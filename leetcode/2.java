class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        
        int sum = 0;
        if(l1 != null) sum += l1.val;
        if(l2 != null) sum += l2.val;
        
        ListNode newNode = new ListNode(sum % 10);
        recu(l1.next, l2.next, newNode, sum / 10);
        
        return newNode;
    }
    
    public ListNode recu(ListNode l1, ListNode l2, ListNode l3, int val){
        if(l1 == null && l2 == null){
            if(val == 1){
                ListNode newNode = new ListNode(1);
                l3.next = newNode;
                
                return l3.next;
            }
            return l3;
        }
        
        int sum = 0;
        if(l1 != null) sum += l1.val;
        if(l2 != null) sum += l2.val;
        
        sum += val;
        ListNode newNode = new ListNode(sum % 10);
        l3.next = newNode;
        
        if(l1 == null && l2 != null) return recu(null, l2.next, l3.next, sum / 10);
        if(l1 != null && l2 == null) return recu(l1.next, null, l3.next, sum / 10);
        return recu(l1.next, l2.next, l3.next, sum / 10);
    }
}
