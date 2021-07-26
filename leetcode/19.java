/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode read = head;
        int count = 0;
        while(read != null){
            count++;
            read = read.next;
        }
        
        if(count == 1) return null;
        
        int index = count - n;
        count = 0;
        
        if(index-1 == -1) return head.next;
        
        read = head;
        ListNode result = read;
        while(read != null){
            if(index-1 == count){ 
                System.out.println(read.val);
                if(read.next.next == null) read.next = null;
                else read.next = read.next.next;
                break;
            }
            
            count++;
            read = read.next;
        }
        
        System.out.println(count);
        return result;
    }

}
