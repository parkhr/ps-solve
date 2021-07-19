class Solution {
    public boolean isPalindrome(ListNode head) {
        List<ListNode> list = new ArrayList<ListNode>();
        
        while(head != null){
            list.add(head);
            head = head.next;
        }
        
        for(int i = 0; i < list.size() / 2; i++){
            if(list.get(i).val != list.get(list.size() - 1 - i).val) return false;
        }
        
        return true;
    }
}
