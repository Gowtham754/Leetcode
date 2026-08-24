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
    public ListNode partition(ListNode head, int x) {
        ListNode l=new ListNode();
        ListNode r=new ListNode();
        ListNode s=l;
        ListNode f=r;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                s.next=temp;
                s=s.next;
            }
            else{
                f.next=temp;
                f=f.next;
            }
            temp=temp.next;
        }
        f.next=null;
        s.next=r.next;
        return l.next;
    }
}