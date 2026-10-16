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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f!=null) s=s.next;
        
        ListNode prev=null;
        ListNode cur=s;
        ListNode nxt=null;
        while(cur!=null){
            nxt=cur.next;
            cur.next=prev;

            prev=cur;
            cur=nxt;
        }
        ListNode x=head;
        ListNode y=prev;
        while(y!=null){
            if(x.val!=y.val) return false;
            x=x.next;
            y=y.next;
        }
        return true;
    }
}