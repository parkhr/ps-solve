class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        List<ListNode> list = new ArrayList<>();
        
        while(head != null){
            list.add(head);
            head = head.next;
        }

        ListNode newNode = list.get(list.size()-1);
        ListNode h = newNode;
        
        for(int i = 1; i < list.size(); i++){
            h.next = list.get(list.size() - i - 1);
            h = h.next;
        }
        
        h.next = null;
        
        return newNode;
    }
}
